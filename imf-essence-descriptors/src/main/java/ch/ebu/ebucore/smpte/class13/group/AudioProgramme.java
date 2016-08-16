//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package ch.ebu.ebucore.smpte.class13.group;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.ebu.ebucore.smpte.class13.type.FormatGroupStrongReference;
import ch.ebu.ebucore.smpte.class13.type.IDRefStrongReferenceSet;
import ch.ebu.ebucore.smpte.class13.type.LoudnessMetadataStrongReference;
import ch.ebu.ebucore.smpte.class13.type.TypeGroupStrongReference;
import org.smpte_ra.reg._2003._2012.ApplicationPluginObjectStrongReferenceSet;
import org.smpte_ra.reg._2003._2012.UTF16String;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioProgrammeTypeGroupObject" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioProgrammeFormatGroupObject" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioProgrammeEndTimecode" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioProgrammeStartTimecode" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioProgrammeId" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioProgrammeName" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioProgrammeLanguageCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioProgrammeLoudnessMetadataObject" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}audioProgrammeAudioContentIDRefObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}LinkedDescriptiveObjectPluginID" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}InstanceID" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ObjectClass" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ApplicationPlugInObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}LinkedGenerationID" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute ref="{http://sandflow.com/ns/SMPTEST2001-1/baseline}path"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "audioProgramme")
public class AudioProgramme {

    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected TypeGroupStrongReference audioProgrammeTypeGroupObject;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected FormatGroupStrongReference audioProgrammeFormatGroupObject;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String audioProgrammeEndTimecode;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String audioProgrammeStartTimecode;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String audioProgrammeId;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String audioProgrammeName;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String audioProgrammeLanguageCode;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected LoudnessMetadataStrongReference audioProgrammeLoudnessMetadataObject;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected IDRefStrongReferenceSet audioProgrammeAudioContentIDRefObjects;
    @XmlElement(name = "LinkedDescriptiveObjectPluginID", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String linkedDescriptiveObjectPluginID;
    @XmlElement(name = "InstanceID", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anyURI")
    protected String instanceID;
    @XmlElement(name = "ObjectClass", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String objectClass;
    @XmlElement(name = "ApplicationPlugInObjects", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected ApplicationPluginObjectStrongReferenceSet applicationPlugInObjects;
    @XmlElement(name = "LinkedGenerationID", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anyURI")
    protected String linkedGenerationID;
    @XmlAttribute(name = "path", namespace = "http://sandflow.com/ns/SMPTEST2001-1/baseline")
    protected String path;

    /**
     * Gets the value of the audioProgrammeTypeGroupObject property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGroupStrongReference }
     *     
     */
    public TypeGroupStrongReference getAudioProgrammeTypeGroupObject() {
        return audioProgrammeTypeGroupObject;
    }

    /**
     * Sets the value of the audioProgrammeTypeGroupObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGroupStrongReference }
     *     
     */
    public void setAudioProgrammeTypeGroupObject(TypeGroupStrongReference value) {
        this.audioProgrammeTypeGroupObject = value;
    }

    /**
     * Gets the value of the audioProgrammeFormatGroupObject property.
     * 
     * @return
     *     possible object is
     *     {@link FormatGroupStrongReference }
     *     
     */
    public FormatGroupStrongReference getAudioProgrammeFormatGroupObject() {
        return audioProgrammeFormatGroupObject;
    }

    /**
     * Sets the value of the audioProgrammeFormatGroupObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatGroupStrongReference }
     *     
     */
    public void setAudioProgrammeFormatGroupObject(FormatGroupStrongReference value) {
        this.audioProgrammeFormatGroupObject = value;
    }

    /**
     * Gets the value of the audioProgrammeEndTimecode property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getAudioProgrammeEndTimecode() {
        return audioProgrammeEndTimecode;
    }

    /**
     * Sets the value of the audioProgrammeEndTimecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setAudioProgrammeEndTimecode(UTF16String value) {
        this.audioProgrammeEndTimecode = value;
    }

    /**
     * Gets the value of the audioProgrammeStartTimecode property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getAudioProgrammeStartTimecode() {
        return audioProgrammeStartTimecode;
    }

    /**
     * Sets the value of the audioProgrammeStartTimecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setAudioProgrammeStartTimecode(UTF16String value) {
        this.audioProgrammeStartTimecode = value;
    }

    /**
     * Gets the value of the audioProgrammeId property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getAudioProgrammeId() {
        return audioProgrammeId;
    }

    /**
     * Sets the value of the audioProgrammeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setAudioProgrammeId(UTF16String value) {
        this.audioProgrammeId = value;
    }

    /**
     * Gets the value of the audioProgrammeName property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getAudioProgrammeName() {
        return audioProgrammeName;
    }

    /**
     * Sets the value of the audioProgrammeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setAudioProgrammeName(UTF16String value) {
        this.audioProgrammeName = value;
    }

    /**
     * Gets the value of the audioProgrammeLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getAudioProgrammeLanguageCode() {
        return audioProgrammeLanguageCode;
    }

    /**
     * Sets the value of the audioProgrammeLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setAudioProgrammeLanguageCode(UTF16String value) {
        this.audioProgrammeLanguageCode = value;
    }

    /**
     * Gets the value of the audioProgrammeLoudnessMetadataObject property.
     * 
     * @return
     *     possible object is
     *     {@link LoudnessMetadataStrongReference }
     *     
     */
    public LoudnessMetadataStrongReference getAudioProgrammeLoudnessMetadataObject() {
        return audioProgrammeLoudnessMetadataObject;
    }

    /**
     * Sets the value of the audioProgrammeLoudnessMetadataObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoudnessMetadataStrongReference }
     *     
     */
    public void setAudioProgrammeLoudnessMetadataObject(LoudnessMetadataStrongReference value) {
        this.audioProgrammeLoudnessMetadataObject = value;
    }

    /**
     * Gets the value of the audioProgrammeAudioContentIDRefObjects property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefStrongReferenceSet }
     *     
     */
    public IDRefStrongReferenceSet getAudioProgrammeAudioContentIDRefObjects() {
        return audioProgrammeAudioContentIDRefObjects;
    }

    /**
     * Sets the value of the audioProgrammeAudioContentIDRefObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefStrongReferenceSet }
     *     
     */
    public void setAudioProgrammeAudioContentIDRefObjects(IDRefStrongReferenceSet value) {
        this.audioProgrammeAudioContentIDRefObjects = value;
    }

    /**
     * Gets the value of the linkedDescriptiveObjectPluginID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedDescriptiveObjectPluginID() {
        return linkedDescriptiveObjectPluginID;
    }

    /**
     * Sets the value of the linkedDescriptiveObjectPluginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedDescriptiveObjectPluginID(String value) {
        this.linkedDescriptiveObjectPluginID = value;
    }

    /**
     * Gets the value of the instanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceID() {
        return instanceID;
    }

    /**
     * Sets the value of the instanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceID(String value) {
        this.instanceID = value;
    }

    /**
     * Gets the value of the objectClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectClass() {
        return objectClass;
    }

    /**
     * Sets the value of the objectClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectClass(String value) {
        this.objectClass = value;
    }

    /**
     * Gets the value of the applicationPlugInObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationPluginObjectStrongReferenceSet }
     *     
     */
    public ApplicationPluginObjectStrongReferenceSet getApplicationPlugInObjects() {
        return applicationPlugInObjects;
    }

    /**
     * Sets the value of the applicationPlugInObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationPluginObjectStrongReferenceSet }
     *     
     */
    public void setApplicationPlugInObjects(ApplicationPluginObjectStrongReferenceSet value) {
        this.applicationPlugInObjects = value;
    }

    /**
     * Gets the value of the linkedGenerationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedGenerationID() {
        return linkedGenerationID;
    }

    /**
     * Sets the value of the linkedGenerationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedGenerationID(String value) {
        this.linkedGenerationID = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

}
