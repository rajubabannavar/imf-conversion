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
package com.netflix.imfutility;

import com.netflix.imfutility.asset.AssetMap;
import com.netflix.imfutility.asset.AssetMapParser;
import com.netflix.imfutility.config.ConfigXmlProvider;
import com.netflix.imfutility.conversion.ConversionEngine;
import com.netflix.imfutility.conversion.ConversionNotAllowedException;
import com.netflix.imfutility.conversion.ConversionXmlProvider;
import com.netflix.imfutility.conversion.SilentConversionChecker;
import com.netflix.imfutility.conversion.templateParameter.context.CustomParameterValue;
import com.netflix.imfutility.conversion.templateParameter.context.DestTemplateParameterContext;
import com.netflix.imfutility.conversion.templateParameter.context.DynamicTemplateParameterContext;
import com.netflix.imfutility.conversion.templateParameter.context.SequenceTemplateParameterContext;
import com.netflix.imfutility.conversion.templateParameter.context.TemplateParameterContextProvider;
import com.netflix.imfutility.conversion.templateParameter.context.parameters.DynamicContextParameters;
import com.netflix.imfutility.cpl.CplContextBuilder;
import com.netflix.imfutility.exception.ConversionHelperException;
import com.netflix.imfutility.generated.conversion.FormatConfigurationType;
import com.netflix.imfutility.generated.conversion.SequenceType;
import com.netflix.imfutility.inputparameters.ImfUtilityInputParameters;
import com.netflix.imfutility.inputparameters.ImfUtilityInputParametersValidator;
import com.netflix.imfutility.mediainfo.MediaInfoContextBuilder;
import com.netflix.imfutility.mediainfo.MediaInfoException;
import com.netflix.imfutility.util.ImfLogger;
import com.netflix.imfutility.validate.ImfValidator;
import com.netflix.imfutility.xml.XmlParsingException;
import com.netflix.imfutility.xsd.conversion.DestContextTypeMap;
import com.netflix.imfutility.xsd.conversion.DestContextsTypeMap;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * The base class responsible for conversion to a destination format.
 * <ul>
 * <li>Contains logic common for all formats</li>
 * <li>Designed for inheritance</li>
 * <li>Provides a common conversion workflow in a {@link #build()}  method</li>
 * <li>Subclasses must provide logic related to context creation: {@link #doBuildDynamicContextPreCpl()} ()}
 * and {@link #doBuildDynamicContextPostCpl()}</li>
 * <li>Subclasses may customize the workflow using {@link #preConvert()} and {@link #postConvert()} methods</li>
 * <li>Common workflow ({@link #build()}):
 * <ul>
 * <li>Initializing config and conversion (reading, parsing and validating config.xml and conversion,xml)</li>
 * <li>Clearing the specified working dir</li>
 * <li>Creating logs dir in the working dir</li>
 * <li>Filling the context (segment and dynamic)</li>
 * <li>Perform conversion executing operation from conversion.xml (see {@link ConversionEngine}</li>
 * <li>Deleting tmp files created during conversion.</li>
 * </ul>
 * </li>
 * </ul>
 */
public abstract class AbstractFormatBuilder {

    private final Logger logger = new ImfLogger(new ImfLogger(LoggerFactory.getLogger(AbstractFormatBuilder.class)));

    protected final IFormat format;
    protected final ImfUtilityInputParameters inputParameters;

    protected ConfigXmlProvider configProvider;
    protected ConversionXmlProvider conversionProvider;
    protected FormatConfigurationType formatConfigurationType;
    protected DestContextTypeMap destContextMap;
    protected TemplateParameterContextProvider contextProvider;
    protected AssetMap assetMap;
    protected CplContextBuilder cplContextBuilder;

    public AbstractFormatBuilder(IFormat format, ImfUtilityInputParameters inputParameters) {
        this.format = format;
        this.inputParameters = inputParameters;
    }

    /**
     * Perform conversion.
     *
     * @return exit code
     */
    public final int build() {
        try {
            logger.debug("Starting conversion to '{}' format\n", format.getName());

            // 1. validate required command line arguments (including path to config.xml)
            validateCmdLineArguments();

            // 2. init config (from config.xml)
            initConfigXml();

            // 3. init conversion.xml
            initConversionXml();

            // 4. init input parameters (such as IMP folder, CPL file, etc.) either from cmd line, or from config.xml.
            initInputParameters();

            // 5. validate input parameters
            validateInputParameters();

            // 6. create working sir if not exist
            createWorkingDir();

            // 7. clear working dir
            cleanWorkingDir();

            // 8. create logs dir in the working dir
            createLogsDir();

            // 9. init template parameter contexts
            initContexts();

            // 10. fill dynamic context before parsing CPL
            buildDynamicContextPreCpl();

            // 11. build IMF CPL contexts
            buildCplContext();

            // 12. perform validation of the input IMP and CPL (after dynamic and CPL contexts are filled!).
            validateImpAndCpl();

            // 13. build Media Info contexts (get resource parameters such as channels_num, fps, sample_rate, etc.)
            buildMediaInfoContext();

            // 14. select a dest context within conversion config.
            // (after CPL and media info context, as CPL and media info contexts may be needed
            // to select destination parameters!)
            selectDestContext();

            // 15. fill destination context
            // (after CPL and media info context, as CPL and media info contexts may be needed
            // to select destination parameters!)
            buildDestContext();

            // 16. Update CPl context with parameters calculated using dest context
            buildCplContextPostDest();

            // 17. fill dynamic context post CPL
            buildDynamicContextPostCpl();

            // 18. select a conversion config within format.
            selectConversionConfig();

            // 19. check whether we can silently convert to destination parameters
            checkForSilentConversion();

            // 20. convert
            doConvert();

            // 21. delete tmp files.
            deleteTmpFilesOnExit();

            logger.info("Conversion to '{}' format: OK\n", format.getName());

            return 0;
        } catch (ConversionException | ConversionHelperException | XmlParsingException | FileNotFoundException e) {
            // do not log stack trace, as it's 'workflow expected' exceptions
            logger.error("Conversion to '{}' format aborted: {}", format.getName(), e.getMessage());
            deleteTmpFilesOnFail();
            return 1;
        } catch (Exception e) {
            logger.error(String.format("Conversion to '%s' format aborted", format.getName()), e);
            deleteTmpFilesOnFail();
            return 1;
        }

    }

    private boolean isCleanWorkingDir() {
        if (configProvider == null) {
            return CoreConstants.DEFAULT_CLEAN_WORKING_DIR;
        }
        if (configProvider.getConfig().isCleanWorkingDir() == null) {
            return CoreConstants.DEFAULT_CLEAN_WORKING_DIR;
        }
        return configProvider.getConfig().isCleanWorkingDir();
    }

    private boolean isDeleteTmpFilesOnExit() {
        if (configProvider == null) {
            return CoreConstants.DEFAULT_DELETE_TMP_FILES_ON_EXIT;
        }
        if (configProvider.getConfig().isDeleteTmpFilesOnExit() == null) {
            return CoreConstants.DEFAULT_DELETE_TMP_FILES_ON_EXIT;
        }
        return configProvider.getConfig().isDeleteTmpFilesOnExit();
    }

    private boolean isDeleteTmpFilesOnFail() {
        if (configProvider == null) {
            return CoreConstants.DEFAULT_DELETE_TMP_FILES_ON_FAIL;
        }
        if (configProvider.getConfig().isDeleteTmpFilesOnFail() == null) {
            return CoreConstants.DEFAULT_DELETE_TMP_FILES_ON_FAIL;
        }
        return configProvider.getConfig().isDeleteTmpFilesOnFail();
    }

    private void validateCmdLineArguments() {
        logger.debug("Checking required command line arguments for conversion...");
        ImfUtilityInputParametersValidator.validateCmdLineArguments(inputParameters);
        doValidateCmdLineArguments();
        logger.debug("Checked required command line arguments for conversion: OK\n");
    }

    protected abstract void doValidateCmdLineArguments();


    private void initConfigXml() throws XmlParsingException, FileNotFoundException {
        logger.debug("Reading config.xml: {}", inputParameters.getConfigFile().getAbsolutePath());
        this.configProvider = new ConfigXmlProvider(inputParameters.getConfigFile());
        logger.debug("Config.xml is processed: OK\n");
    }

    private void initConversionXml() throws XmlParsingException, FileNotFoundException {
        logger.debug("Initializing conversion.xml");

        if (configProvider.getConfig().getConversionConfig() != null) {
            // 1. check for alternative conversion.xml
            String conversionXml = configProvider.getConfig().getConversionConfig();
            logger.debug("Using alternative conversion.xml: {}", conversionXml);
            this.conversionProvider = new ConversionXmlProvider(conversionXml, format);
        } else {
            // 2. use default one from resources
            InputStream defaultConversionXml = inputParameters.getDefaultConversionXml();
            if (defaultConversionXml == null) {
                throw new ConversionException("Conversion.xml is not found in neither default location nor config.xml");
            }
            this.conversionProvider = new ConversionXmlProvider(
                    defaultConversionXml, inputParameters.getDefaultConversionXmlPath(), format);
        }

        logger.debug("Conversion.xml is processed: OK\n");
    }

    private void initInputParameters() {
        logger.debug("Initializing input parameters...");

        // 1. setting working directory (if it's in config.xml)
        inputParameters.setDefaultWorkingDir(configProvider.getConfig().getWorkingDirectory());

        // 2. setting IMP (if it's in config.xml)
        inputParameters.setDefaultImp(configProvider.getConfig().getImp());

        // 3. setting CPL (if it's in config.xml)
        inputParameters.setDefaultCpl(configProvider.getConfig().getCpl());

        // 4. custom IMF validation
        if (configProvider.getConfig().getExternalTools().getMap().containsKey(CoreConstants.IMF_VALIDATION_TOOL)) {
            String customImfValidation = configProvider.getConfig().getExternalTools().getMap()
                    .get(CoreConstants.IMF_VALIDATION_TOOL).getValue();
            if (!StringUtils.isEmpty(customImfValidation)) {
                inputParameters.setCustomImfValidationTool(customImfValidation);
            }
        }

        logger.debug("Initialized input parameters: OK\n");
    }

    private void validateInputParameters() {
        logger.debug("Checking required input parameters for conversion...");
        ImfUtilityInputParametersValidator.validateInputParameters(inputParameters);
        logger.debug("Checked required input parameters for conversion: OK\n");
    }

    private void createWorkingDir() {
        logger.debug("Creating working directory...");
        if (!inputParameters.getWorkingDirFile().exists()) {
            boolean result = inputParameters.getWorkingDirFile().mkdirs();
            if (!result) {
                throw new ConversionException(
                        String.format("Could not create working directory '%s'", inputParameters.getWorkingDirFile().getAbsolutePath()));
            }
        }
        logger.debug("Created working directory: OK\n");
    }

    private void cleanWorkingDir() throws IOException {
        logger.debug("Cleaning working directory...");
        if (isCleanWorkingDir()) {
            FileUtils.cleanDirectory(inputParameters.getWorkingDirFile());
            logger.info("Cleaned working directory: OK\n");
        } else {
            logger.info("Cleaning working directory is DISABLED in config.xml\n");
        }
    }

    private void createLogsDir() {
        logger.debug("Creating external tools logging directory...");

        File logsDir = new File(inputParameters.getWorkingDirFile(), CoreConstants.LOGS_DIR);
        logger.debug("External tools logging directory: {}", logsDir);
        if (!logsDir.mkdir()) {
            logger.warn("Couldn't create External tools logging directory!");
        }

        logger.debug("Created external tools logging directory: OK\n");
    }

    private void initContexts() {
        logger.debug("Initializing template parameter contexts...");
        this.contextProvider =
                new TemplateParameterContextProvider(configProvider, conversionProvider, inputParameters.getWorkingDirFile());
        logger.debug("Initialized template parameter contexts: OK\n");
    }

    private void buildDynamicContextPreCpl() {
        logger.debug("Building Dynamic context before parsing CPL...");

        // build default dynamic parameters
        DynamicTemplateParameterContext dynamicContext = contextProvider.getDynamicContext();
        dynamicContext.addParameter(DynamicContextParameters.IMP, inputParameters.getImpDirectoryFile().getAbsolutePath());
        dynamicContext.addParameter(DynamicContextParameters.CPL, inputParameters.getCplFile().getAbsolutePath());
        dynamicContext.addParameter(DynamicContextParameters.VALIDATION_TOOL, inputParameters.getImfValidationTool());

        // build format-specific dynamic parameters
        doBuildDynamicContextPreCpl();

        logger.debug("Built Dynamic context before parsing CPL: OK\n");
    }

    protected abstract void doBuildDynamicContextPreCpl();

    private boolean isValidateImpAndCpl() {
        if (configProvider == null) {
            return CoreConstants.DEFAULT_VALIDATE_IMF;
        }
        if (configProvider.getConfig().isValidateImf() == null) {
            return CoreConstants.DEFAULT_VALIDATE_IMF;
        }
        return configProvider.getConfig().isValidateImf();
    }

    private void validateImpAndCpl() throws IOException, XmlParsingException {
        logger.info("Validating input IMP and CPL...\n");
        if (isValidateImpAndCpl()) {
            contextProvider.getDynamicContext().addParameter(
                    DynamicContextParameters.REFERENCED_ESSENCES, assetMap.getReferencedAssets());
            boolean noFatalErrors = new ImfValidator(contextProvider, new ConversionEngine().getExecuteStrategyFactory()).validate();
            if (noFatalErrors) {
                logger.info("Validated input IMP and CPL: OK\n");
            } else {
                throw new ConversionException("IMF package is not valid. Fatal errors found.");
            }
        } else {
            logger.info("IMP and CPL validation is DISABLED in config.xml\n");
        }
    }

    private void buildCplContext() throws XmlParsingException, FileNotFoundException {
        logger.debug("Building CPL contexts...");

        File assetMapFile = new File(inputParameters.getImpDirectoryFile(), CoreConstants.ASSETMAP_FILE);
        logger.debug("Parsing ASSETMAP.xml ('{}')...", assetMapFile.getAbsolutePath());
        this.assetMap = new AssetMapParser().parse(inputParameters.getImpDirectoryFile(), assetMapFile);
        logger.debug("Parsed ASSETMAP.xml: OK");

        logger.debug("Parsing CPL ('{}')...", inputParameters.getCplFile().getAbsolutePath());
        this.cplContextBuilder = new CplContextBuilder(contextProvider, assetMap, inputParameters.getCplFile());
        cplContextBuilder.build();
        logger.debug("Parsed CPL: OK");

        logger.debug("Built CPL contexts: OK\n");
    }

    private void buildCplContextPostDest() throws XmlParsingException, FileNotFoundException {
        logger.debug("Updating CPL contexts...");
        cplContextBuilder.buildPostDestContext();
        logger.debug("Updated CPL contexts: OK\n");
    }


    private void buildMediaInfoContext() throws XmlParsingException, IOException, MediaInfoException {
        logger.debug("Building Media Info contexts...\n");

        new MediaInfoContextBuilder(
                contextProvider, new ConversionEngine().getExecuteStrategyFactory()).build();

        logger.debug("Built Media Info contexts: OK\n");
    }

    private void buildDynamicContextPostCpl() throws IOException, XmlParsingException {
        logger.debug("Building Dynamic context after CPL is parsed...");

        // build default dynamic parameters
        DynamicTemplateParameterContext dynamicContext = contextProvider.getDynamicContext();
        SequenceTemplateParameterContext seqContext = contextProvider.getSequenceContext();
        boolean hasAudio = seqContext.getSequenceCount(SequenceType.AUDIO) > 0;
        boolean hasVideo = seqContext.getSequenceCount(SequenceType.VIDEO) > 0;
        boolean hasSubtitle = seqContext.getSequenceCount(SequenceType.SUBTITLE) > 0;
        boolean singleAudio = seqContext.getSequenceCount(SequenceType.AUDIO) == 1;
        boolean singleSubtitle = seqContext.getSequenceCount(SequenceType.SUBTITLE) == 1;

        dynamicContext.addParameter(DynamicContextParameters.HAS_AUDIO, String.valueOf(hasAudio));
        dynamicContext.addParameter(DynamicContextParameters.HAS_VIDEO, String.valueOf(hasVideo));
        dynamicContext.addParameter(DynamicContextParameters.HAS_SUBTITLE, String.valueOf(hasSubtitle));
        dynamicContext.addParameter(DynamicContextParameters.HAS_AUDIO_AND_VIDEO, String.valueOf(hasAudio && hasVideo));
        dynamicContext.addParameter(DynamicContextParameters.HAS_AUDIO_ONLY, String.valueOf(hasAudio && !hasVideo));
        dynamicContext.addParameter(DynamicContextParameters.HAS_VIDEO_ONLY, String.valueOf(!hasAudio && hasVideo));

        dynamicContext.addParameter(DynamicContextParameters.SINGLE_AUDIO, String.valueOf(singleAudio));
        dynamicContext.addParameter(DynamicContextParameters.SINGLE_SUBTITLE, String.valueOf(singleSubtitle));

        // build format-specific dynamic parameters
        doBuildDynamicContextPostCpl();

        logger.debug("Built Dynamic context after CPL is parsed: OK\n");
    }

    protected abstract void doBuildDynamicContextPostCpl() throws IOException, XmlParsingException;

    private void buildDestContext() {
        logger.debug("Building Dest context...");

        DestTemplateParameterContext destContext = contextProvider.getDestContext();
        destContext.setDestContextMap(destContextMap);

        // build format-specific dest parameters
        doBuildDestContext();

        logger.debug("Built Dest context: OK\n");
    }

    protected void doBuildDestContext() {
    }

    private void selectConversionConfig() {
        String conversionConfig = getConversionConfiguration();
        logger.debug("Conversion config: {}\n", conversionConfig);
        this.formatConfigurationType = conversionProvider.getFormatConfigurationType(conversionConfig);
    }

    private void selectDestContext() {
        DestContextTypeMap destContext = getDestContextMap(conversionProvider.getFormat().getDestContexts());

        this.destContextMap = conversionProvider.getFormat().getDefaultDestContext();
        if (destContext != null) { // merge with default
            this.destContextMap.getMap().putAll(destContext.getMap());
            this.destContextMap.setName(destContext.getName());
        }
    }

    private void checkForSilentConversion() throws ConversionNotAllowedException {
        logger.debug("Checking whether it's allowed by config.xml to silently convert to destination parameters if they don't match...");
        new SilentConversionChecker(contextProvider, configProvider.getConfig()).check();
        logger.debug("Checked: silent conversion is either allowed or not needed.\n");
    }

    private void doConvert() throws IOException, XmlParsingException {
        logger.info("Starting conversion...\n");
        preConvert();
        new ConversionEngine().convert(formatConfigurationType, contextProvider);
        postConvert();
        logger.info("Converted: OK\n");
    }

    protected abstract void preConvert() throws IOException, XmlParsingException;

    protected abstract void postConvert() throws IOException, XmlParsingException;


    protected abstract String getConversionConfiguration();

    protected abstract DestContextTypeMap getDestContextMap(DestContextsTypeMap destContexts);

    private void deleteTmpFilesOnExit() {
        logger.debug("Deleting tmp files created during conversion...");
        if (isDeleteTmpFilesOnExit()) {
            if (doDeleteTmpFiles()) {
                logger.info("Deleted tmp files created during conversion: OK\n");
            } else {
                logger.warn("Deleted tmp files created during conversion: FAIL\n");
            }
        } else {
            logger.info("Deleting tmp files is DISABLED in config.xml\n");
        }
    }

    private void deleteTmpFilesOnFail() {
        logger.debug("Deleting tmp files created during conversion...");
        if (isDeleteTmpFilesOnFail()) {
            if (doDeleteTmpFiles()) {
                logger.info("Deleted tmp files created during conversion: OK\n");
            } else {
                logger.warn("Deleted tmp files created during conversion: FAIL\n");
            }
        } else {
            logger.info("Deleting tmp files is DISABLED in config.xml\n");
        }
    }

    private boolean doDeleteTmpFiles() {
        boolean success = true;
        for (CustomParameterValue tmpParam : contextProvider.getTmpContext().getAllParameters()) {
            if (tmpParam.isDeleteOnExit()) {
                success &= doDeleteTmpFile(tmpParam.getValue());
            }
        }
        for (CustomParameterValue paramValue : contextProvider.getDynamicContext().getAllParameters()) {
            if (paramValue.isDeleteOnExit()) {
                success &= doDeleteTmpFile(paramValue.getValue());
            }
        }

        return success;
    }

    private boolean doDeleteTmpFile(String paramValue) {
        boolean success = true;

        File tmpFile = new File(paramValue);
        if (!tmpFile.isAbsolute() || !tmpFile.isFile()) {
            tmpFile = new File(contextProvider.getWorkingDir().getAbsoluteFile(), paramValue);
        }

        if (!tmpFile.isAbsolute() || !tmpFile.isFile()) {
            tmpFile = null;
        }

        if (tmpFile != null) {
            if (!tmpFile.delete()) {
                success = false;
                logger.warn("Couldn't delete tmp file {}", tmpFile.getAbsolutePath());
            }
        }

        return success;
    }

}
