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
import javax.xml.bind.annotation.XmlType;
import org.smpte_ra.reg._395._2014._13._1.aaf.EssenceData;


/**
 * <p>Java class for EssenceDataStrongReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EssenceDataStrongReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}EssenceData"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EssenceDataStrongReference", propOrder = {
    "essenceData"
})
public class EssenceDataStrongReference {

    @XmlElement(name = "EssenceData", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected EssenceData essenceData;

    /**
     * Gets the value of the essenceData property.
     * 
     * @return
     *     possible object is
     *     {@link EssenceData }
     *     
     */
    public EssenceData getEssenceData() {
        return essenceData;
    }

    /**
     * Sets the value of the essenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EssenceData }
     *     
     */
    public void setEssenceData(EssenceData value) {
        this.essenceData = value;
    }

}
