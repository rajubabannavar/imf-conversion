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
import ch.ebu.ebucore.smpte.class13.group.PublicationHistory;


/**
 * <p>Java class for publicationHistoryStrongReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publicationHistoryStrongReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/group}publicationHistory"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publicationHistoryStrongReference", propOrder = {
    "publicationHistory"
})
public class PublicationHistoryStrongReference {

    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/group")
    protected PublicationHistory publicationHistory;

    /**
     * Gets the value of the publicationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationHistory }
     *     
     */
    public PublicationHistory getPublicationHistory() {
        return publicationHistory;
    }

    /**
     * Sets the value of the publicationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationHistory }
     *     
     */
    public void setPublicationHistory(PublicationHistory value) {
        this.publicationHistory = value;
    }

}