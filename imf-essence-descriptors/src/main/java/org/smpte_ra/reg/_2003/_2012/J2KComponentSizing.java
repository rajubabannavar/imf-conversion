//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package org.smpte_ra.reg._2003._2012;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for J2KComponentSizing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="J2KComponentSizing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ssiz" type="{http://www.smpte-ra.org/reg/2003/2012}UInt8"/>
 *         &lt;element name="XRSiz" type="{http://www.smpte-ra.org/reg/2003/2012}UInt8"/>
 *         &lt;element name="YRSiz" type="{http://www.smpte-ra.org/reg/2003/2012}UInt8"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "J2KComponentSizing", propOrder = {
    "ssiz",
    "xrSiz",
    "yrSiz"
})
public class J2KComponentSizing {

    @XmlElement(name = "Ssiz", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String ssiz;
    @XmlElement(name = "XRSiz", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String xrSiz;
    @XmlElement(name = "YRSiz", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String yrSiz;

    /**
     * Gets the value of the ssiz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsiz() {
        return ssiz;
    }

    /**
     * Sets the value of the ssiz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsiz(String value) {
        this.ssiz = value;
    }

    /**
     * Gets the value of the xrSiz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXRSiz() {
        return xrSiz;
    }

    /**
     * Sets the value of the xrSiz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXRSiz(String value) {
        this.xrSiz = value;
    }

    /**
     * Gets the value of the yrSiz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYRSiz() {
        return yrSiz;
    }

    /**
     * Sets the value of the yrSiz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYRSiz(String value) {
        this.yrSiz = value;
    }

}
