//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package org.smpte_ra.reg._2003._2012;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.sandflow.ns.smptest2001_1.baseline.ByteOrderType;


/**
 * <p>Java class for Opaque complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Opaque">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://sandflow.com/ns/SMPTEST2001-1/baseline>HexByteArrayType">
 *       &lt;attribute ref="{http://sandflow.com/ns/SMPTEST2001-1/baseline}actualType use="required""/>
 *       &lt;attribute ref="{http://sandflow.com/ns/SMPTEST2001-1/baseline}byteOrder use="required""/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opaque", propOrder = {
    "value"
})
public class Opaque {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "actualType", namespace = "http://sandflow.com/ns/SMPTEST2001-1/baseline", required = true)
    protected String actualType;
    @XmlAttribute(name = "byteOrder", namespace = "http://sandflow.com/ns/SMPTEST2001-1/baseline", required = true)
    protected ByteOrderType byteOrder;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the actualType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualType() {
        return actualType;
    }

    /**
     * Sets the value of the actualType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualType(String value) {
        this.actualType = value;
    }

    /**
     * Gets the value of the byteOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ByteOrderType }
     *     
     */
    public ByteOrderType getByteOrder() {
        return byteOrder;
    }

    /**
     * Sets the value of the byteOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByteOrderType }
     *     
     */
    public void setByteOrder(ByteOrderType value) {
        this.byteOrder = value;
    }

}
