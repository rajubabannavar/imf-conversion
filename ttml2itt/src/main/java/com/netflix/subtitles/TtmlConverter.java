/*
 * Copyright (C) 2016 Netflix, Inc.
 *
 *     This file is part of IMF Conversion Utility.
 *
 *     IMF Conversion Utility is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     IMF Conversion Utility is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with IMF Conversion Utility.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.netflix.subtitles;

import com.netflix.imfutility.util.ConversionHelper;
import com.netflix.imfutility.xml.XmlParser;
import com.netflix.imfutility.xml.XmlParsingException;
import com.netflix.subtitles.cli.TtmlConverterCmdLineParams;
import com.netflix.subtitles.cli.TtmlConverterCmdLineParser;
import com.netflix.subtitles.cli.TtmlOption;
import com.netflix.subtitles.exception.ParseException;
import com.netflix.subtitles.ttml.TtmlParagraphResolver;
import com.netflix.subtitles.ttml.TtmlTimeConverter;
import com.netflix.subtitles.ttml.TtmlUtils;
import org.w3.ns.ttml.DivEltype;
import org.w3.ns.ttml.ObjectFactory;
import org.w3.ns.ttml.PEltype;
import org.w3.ns.ttml.StyleEltype;
import org.w3.ns.ttml.TtEltype;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.netflix.subtitles.TtmlConverterConstants.NEW_STYLE_ID_PARAMETER;
import static com.netflix.subtitles.TtmlConverterConstants.OLD_STYLE_ID_PARAMETER;
import static com.netflix.subtitles.TtmlConverterConstants.REPLACE_STYLE_ID_TRANSFORMATION;
import static com.netflix.subtitles.TtmlConverterConstants.TTML_PACKAGES;
import static com.netflix.subtitles.TtmlConverterConstants.TTML_SCHEMA;
import static com.netflix.subtitles.TtmlConverterConstants.TTML_TO_ITT_TRANSFORMATION;

/**
 * Validates TTML against iTT specification and converts to iTT format in simple cases.
 */
public final class TtmlConverter {

    private final List<TtEltype> ttmlTts;
    private final File outputFile;
    private ArrayList<TtEltype> convertedItts;
    private TtEltype mergedItt;
    private final Map<String, Integer> styleIdMap = new HashMap<>();
    private final Map<TtEltype, Map<String, String>> styleRefMap = new LinkedHashMap<>();

    /**
     * Entry point.
     *
     * @param args cmd line args
     */
    public static void main(String[] args) {
        TtmlConverterCmdLineParams parsedParams = null;
        TtmlConverter converter = null;

        try {
            parsedParams = new TtmlConverterCmdLineParser().parse(args);
        } catch (Exception e) {
            System.err.println(String.format("Parsing of command line arguments failed. Reason: %s",
                    e.getLocalizedMessage()));
            System.exit(-1);
        }
        if (parsedParams == null) { //help
            System.exit(0);
        }

        printStartMessage(parsedParams);

        try {
            converter = new TtmlConverter(parsedParams);
        } catch (Exception e) {
            System.err.println(String.format("Input file/s is not valid. %s", e.getLocalizedMessage()));
            System.exit(-1);
        }

        try {
            converter.convertInputsToItt();
        } catch (Exception e) {
            System.err.println(String.format("Input file/s cannot be converted to itt. %s", e.getLocalizedMessage()));
            System.exit(-1);
        }

        try {
            converter.mergeConvertedItts();
        } catch (Exception e) {
            System.err.println(String.format("Input file/s cannot be merged to one itt. %s", e.getLocalizedMessage()));
            System.exit(-1);
        }

        try {
            converter.resolveParagraphTimeOverlaps();
        } catch (Exception e) {
            System.err.println(String.format("Input file/s cannot be converted to itt. %s", e.getLocalizedMessage()));
            System.exit(-1);
        }

        try {
            converter.writeToFile();
        } catch (Exception e) {
            System.err.println(String.format("Output iTT file cannot be saved. %s", e.getLocalizedMessage()));
            System.exit(-1);
        }

        try {
            converter.validateOutput();
        } catch (Exception e) {
            System.err.println(String.format(
                    "Output iTT file is not correct TTML file, internal merging error. %s", e.getLocalizedMessage()));
            System.exit(-1);
        }

        System.out.println("Conversion done.");
    }

    private static void printStartMessage(TtmlConverterCmdLineParams parsedParams) {
        String mergeMsg = "";
        String fileMsg = " file.";
        String startMsg;

        if (parsedParams.getTtmlOptions().size() > 1) {
            mergeMsg = "and merging";
            fileMsg = " files.";
        }

        startMsg = "Start converting " + mergeMsg + " of "
                + parsedParams.getTtmlOptions().stream()
                .map(TtmlOption::getFileName).collect(Collectors.joining(", ", "[", "]")) + fileMsg;
        System.out.println(startMsg);
    }

    /**
     * Constructor.
     *
     * @param params parsed command line parameters
     * @throws ParseException
     */
    public TtmlConverter(TtmlConverterCmdLineParams params) throws ParseException {
        outputFile = new File(params.getOutputFile());
        if (!Files.isWritable(Paths.get((outputFile.getParent() == null) ? "." : outputFile.getParent()))) {
            throw new ParseException(String.format(
                    "Output file %s cannot be written. Please check access rights.", params.getOutputFile()));
        }

        ttmlTts = params.getTtmlOptions().stream().map((o) -> {
            TtEltype tt;
            try {
                tt = XmlParser.parse(new File(o.getFileName()), new String[]{TTML_SCHEMA}, TTML_PACKAGES, TtEltype.class);
            } catch (XmlParsingException | FileNotFoundException e) {
                throw new ParseException(e);
            }

            TtmlUtils.reduceAccordingSegment(tt, o.getOffsetMS(), o.getStartMS(), o.getEndMS(), params.getFrameRate());
            TtmlUtils.moveStyleRefToP(tt);
            return tt;
        }).collect(Collectors.toList());
    }

    /**
     * Converts all TTML input documents to corresponding iTT.
     *
     * @throws TransformerConfigurationException
     */
    public void convertInputsToItt() throws TransformerConfigurationException {
        Transformer transformer = TtmlUtils.createTtmlTransformer(TTML_TO_ITT_TRANSFORMATION);

        convertedItts = ttmlTts.stream()
                .map((tt) -> TtmlUtils.transformTtmlDocument(tt, transformer))
                .collect(Collectors.toCollection(ArrayList::new));

        mergedItt = convertedItts.get(0);
    }

    /**
     * Merges converted from TTML to iTTs documents.
     */
    public void mergeConvertedItts() {
        // first merge all divs in main document
        Iterator<DivEltype> divIt = mergedItt.getBody().getDiv().iterator();
        DivEltype firstDiv = divIt.next();
        while (divIt.hasNext()) {
            DivEltype d = divIt.next();
            firstDiv.getBlockClass().addAll(d.getBlockClass());
            divIt.remove();
        }

        // merge styles
        List<StyleEltype> stylesList = mergedItt.getHead().getStyling().getStyle();
        convertedItts.stream().skip(1).forEachOrdered((itt) -> {
            itt.getHead().getStyling().getStyle().stream().forEachOrdered((st) -> {
                styleRefMap.put(itt, new HashMap<>());
                if (isStyleInList(st, stylesList)) {
                    return;
                }

                // change style id if already exists
                String newId = createStyleId(st.getId());
                styleRefMap.get(itt).put(st.getId(), newId);
                st.setId(newId);

                // add to main style list
                stylesList.add(st);
            });
        });
        // fix style references
        for (int i = 1; i < convertedItts.size(); i++) {
            TtEltype[] itt = new TtEltype[]{convertedItts.get(i)};

            styleRefMap.get(itt[0]).entrySet().stream().forEach((e) -> {
                itt[0] = fixStyleRefs(itt[0], e.getKey(), e.getValue());
            });

            convertedItts.set(i, itt[0]);
        }

        // merge divs
        TtmlTimeConverter mainConverter = new TtmlTimeConverter(mergedItt);
        convertedItts.stream().skip(1).forEachOrdered((itt) -> {
            TtmlTimeConverter ttConverter = new TtmlTimeConverter(itt);

            // merge divs
            itt.getBody().getDiv().stream().flatMap((d) -> d.getBlockClass().stream())
                    .map((obj) -> {
                        return (PEltype) obj;
                    })
                    .peek((p) -> { // if different fps
                        if (mainConverter.equals(ttConverter)) {
                            return;
                        }

                        // conver p timeExpressions according to main frameRate
                        long pB = ttConverter.parseTimeExpression(p.getBegin());
                        long pE = ttConverter.parseTimeExpression(p.getEnd());

                        p.setBegin(ConversionHelper.msToSmpteTimecode(pB, mainConverter.getUnitsInSec()));
                        p.setEnd(ConversionHelper.msToSmpteTimecode(pE, mainConverter.getUnitsInSec()));
                    })
                    .forEachOrdered((p) -> {
                        firstDiv.getBlockClass().add(p);
                    });
        });
    }

    public void resolveParagraphTimeOverlaps() {
        new TtmlParagraphResolver(mergedItt).resolveTimeOverlaps();
    }

    /**
     * Writes resulting iTT document to output file.
     *
     * @throws JAXBException
     */
    public void writeToFile() throws JAXBException {
        if (mergedItt == null) {
            System.out.println("Resulting iTT is empty. No data to write.");
            return;
        }

        Marshaller jaxbMarshaller = TtmlUtils.createTtmlJaxbContext().createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(new ObjectFactory().createTt(mergedItt), outputFile);

    }

    /**
     * Validates output ttml and throw exception if not valid.
     *
     * @throws XmlParsingException
     * @throws FileNotFoundException
     */
    public void validateOutput() throws XmlParsingException, FileNotFoundException {
        XmlParser.parse(outputFile, new String[]{TTML_SCHEMA}, TTML_PACKAGES, TtEltype.class);
    }

    /**
     * Gets converted itt documents. For test purposes.
     *
     * @return converted itt documents
     */
    List<TtEltype> getConvertedItts() {
        return convertedItts;
    }

    private boolean isStyleInList(StyleEltype st, List<StyleEltype> stylesList) {
        return stylesList.stream().anyMatch((l) -> {
            return l.getId().equals(st.getId())
                    && l.getFontFamily().equals(st.getFontFamily())
                    && l.getFontWeight().equals(st.getFontWeight())
                    && l.getFontStyle().equals(st.getFontStyle())
                    && l.getColor().equals(st.getColor())
                    && l.getFontSize().equals(st.getFontSize());
        });
    }

    private String createStyleId(String idStr) {
        int id = Optional.ofNullable(styleIdMap.get(idStr)).orElse(0);
        String newIdStr = idStr + id;

        styleIdMap.put(idStr, ++id);

        return newIdStr;
    }

    private TtEltype fixStyleRefs(TtEltype itt, String oldId, String newId) {
        Transformer transformer = TtmlUtils.createTtmlTransformer(REPLACE_STYLE_ID_TRANSFORMATION);
        transformer.setParameter(OLD_STYLE_ID_PARAMETER, oldId);
        transformer.setParameter(NEW_STYLE_ID_PARAMETER, newId);

        return TtmlUtils.transformTtmlDocument(itt, transformer);
    }
}
