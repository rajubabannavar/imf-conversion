//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package ch.ebu.ebucore.smpte.class13.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.ebu.ebucore.smpte.class13.group.TechnicalAttributeUInt8;


/**
 * <p>Java class for technicalAttributeUInt8StrongReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="technicalAttributeUInt8StrongReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/group}technicalAttributeUInt8"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "technicalAttributeUInt8StrongReference", propOrder = {
    "technicalAttributeUInt8"
})
public class TechnicalAttributeUInt8StrongReference {

    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/group")
    protected TechnicalAttributeUInt8 technicalAttributeUInt8;

    /**
     * Gets the value of the technicalAttributeUInt8 property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalAttributeUInt8 }
     *     
     */
    public TechnicalAttributeUInt8 getTechnicalAttributeUInt8() {
        return technicalAttributeUInt8;
    }

    /**
     * Sets the value of the technicalAttributeUInt8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalAttributeUInt8 }
     *     
     */
    public void setTechnicalAttributeUInt8(TechnicalAttributeUInt8 value) {
        this.technicalAttributeUInt8 = value;
    }

}
