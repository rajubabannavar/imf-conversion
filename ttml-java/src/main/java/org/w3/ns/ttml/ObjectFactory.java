//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 04:29:49 PM MSK 
//


package org.w3.ns.ttml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.w3.ns.ttml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Span_QNAME = new QName("http://www.w3.org/ns/ttml", "span");
    private final static QName _Region_QNAME = new QName("http://www.w3.org/ns/ttml", "region");
    private final static QName _Style_QNAME = new QName("http://www.w3.org/ns/ttml", "style");
    private final static QName _Styling_QNAME = new QName("http://www.w3.org/ns/ttml", "styling");
    private final static QName _Layout_QNAME = new QName("http://www.w3.org/ns/ttml", "layout");
    private final static QName _Head_QNAME = new QName("http://www.w3.org/ns/ttml", "head");
    private final static QName _Div_QNAME = new QName("http://www.w3.org/ns/ttml", "div");
    private final static QName _P_QNAME = new QName("http://www.w3.org/ns/ttml", "p");
    private final static QName _Br_QNAME = new QName("http://www.w3.org/ns/ttml", "br");
    private final static QName _Body_QNAME = new QName("http://www.w3.org/ns/ttml", "body");
    private final static QName _Set_QNAME = new QName("http://www.w3.org/ns/ttml", "set");
    private final static QName _Metadata_QNAME = new QName("http://www.w3.org/ns/ttml", "metadata");
    private final static QName _Tt_QNAME = new QName("http://www.w3.org/ns/ttml", "tt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3.ns.ttml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TtEltype }
     * 
     */
    public TtEltype createTtEltype() {
        return new TtEltype();
    }

    /**
     * Create an instance of {@link MetadataEltype }
     * 
     */
    public MetadataEltype createMetadataEltype() {
        return new MetadataEltype();
    }

    /**
     * Create an instance of {@link SetEltype }
     * 
     */
    public SetEltype createSetEltype() {
        return new SetEltype();
    }

    /**
     * Create an instance of {@link BodyEltype }
     * 
     */
    public BodyEltype createBodyEltype() {
        return new BodyEltype();
    }

    /**
     * Create an instance of {@link LayoutEltype }
     * 
     */
    public LayoutEltype createLayoutEltype() {
        return new LayoutEltype();
    }

    /**
     * Create an instance of {@link HeadEltype }
     * 
     */
    public HeadEltype createHeadEltype() {
        return new HeadEltype();
    }

    /**
     * Create an instance of {@link DivEltype }
     * 
     */
    public DivEltype createDivEltype() {
        return new DivEltype();
    }

    /**
     * Create an instance of {@link PEltype }
     * 
     */
    public PEltype createPEltype() {
        return new PEltype();
    }

    /**
     * Create an instance of {@link BrEltype }
     * 
     */
    public BrEltype createBrEltype() {
        return new BrEltype();
    }

    /**
     * Create an instance of {@link StylingEltype }
     * 
     */
    public StylingEltype createStylingEltype() {
        return new StylingEltype();
    }

    /**
     * Create an instance of {@link StyleEltype }
     * 
     */
    public StyleEltype createStyleEltype() {
        return new StyleEltype();
    }

    /**
     * Create an instance of {@link RegionEltype }
     * 
     */
    public RegionEltype createRegionEltype() {
        return new RegionEltype();
    }

    /**
     * Create an instance of {@link SpanEltype }
     * 
     */
    public SpanEltype createSpanEltype() {
        return new SpanEltype();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpanEltype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml", name = "span")
    public JAXBElement<SpanEltype> createSpan(SpanEltype value) {
        return new JAXBElement<SpanEltype>(_Span_QNAME, SpanEltype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionEltype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml", name = "region")
    public JAXBElement<RegionEltype> createRegion(RegionEltype value) {
        return new JAXBElement<RegionEltype>(_Region_QNAME, RegionEltype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleEltype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml", name = "style")
    public JAXBElement<StyleEltype> createStyle(StyleEltype value) {
        return new JAXBElement<StyleEltype>(_Style_QNAME, StyleEltype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StylingEltype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml", name = "styling")
    public JAXBElement<StylingEltype> createStyling(StylingEltype value) {
        return new JAXBElement<StylingEltype>(_Styling_QNAME, StylingEltype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayoutEltype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml", name = "layout")
    public JAXBElement<LayoutEltype> createLayout(LayoutEltype value) {
        return new JAXBElement<LayoutEltype>(_Layout_QNAME, LayoutEltype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeadEltype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml", name = "head")
    public JAXBElement<HeadEltype> createHead(HeadEltype value) {
        return new JAXBElement<HeadEltype>(_Head_QNAME, HeadEltype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivEltype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml", name = "div")
    public JAXBElement<DivEltype> createDiv(DivEltype value) {
        return new JAXBElement<DivEltype>(_Div_QNAME, DivEltype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PEltype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml", name = "p")
    public JAXBElement<PEltype> createP(PEltype value) {
        return new JAXBElement<PEltype>(_P_QNAME, PEltype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrEltype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml", name = "br")
    public JAXBElement<BrEltype> createBr(BrEltype value) {
        return new JAXBElement<BrEltype>(_Br_QNAME, BrEltype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BodyEltype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml", name = "body")
    public JAXBElement<BodyEltype> createBody(BodyEltype value) {
        return new JAXBElement<BodyEltype>(_Body_QNAME, BodyEltype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEltype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml", name = "set")
    public JAXBElement<SetEltype> createSet(SetEltype value) {
        return new JAXBElement<SetEltype>(_Set_QNAME, SetEltype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataEltype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml", name = "metadata")
    public JAXBElement<MetadataEltype> createMetadata(MetadataEltype value) {
        return new JAXBElement<MetadataEltype>(_Metadata_QNAME, MetadataEltype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TtEltype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml", name = "tt")
    public JAXBElement<TtEltype> createTt(TtEltype value) {
        return new JAXBElement<TtEltype>(_Tt_QNAME, TtEltype.class, null, value);
    }

}