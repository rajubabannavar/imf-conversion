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
import ch.ebu.ebucore.smpte.class13.group.ContainerFormat;


/**
 * <p>Java class for containerFormatStrongReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="containerFormatStrongReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/group}containerFormat"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "containerFormatStrongReference", propOrder = {
    "containerFormat"
})
public class ContainerFormatStrongReference {

    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/group")
    protected ContainerFormat containerFormat;

    /**
     * Gets the value of the containerFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerFormat }
     *     
     */
    public ContainerFormat getContainerFormat() {
        return containerFormat;
    }

    /**
     * Sets the value of the containerFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerFormat }
     *     
     */
    public void setContainerFormat(ContainerFormat value) {
        this.containerFormat = value;
    }

}