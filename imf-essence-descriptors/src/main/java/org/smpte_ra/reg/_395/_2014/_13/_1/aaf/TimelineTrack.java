//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package org.smpte_ra.reg._395._2014._13._1.aaf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.smpte_ra.reg._2003._2012.ApplicationPluginObjectStrongReferenceSet;
import org.smpte_ra.reg._2003._2012.SegmentStrongReference;
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
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}EditRate"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}Origin"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}PackageMarkOutPosition" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}MarkOut" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}PackageMarkInPosition" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}UserPosition" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}MarkIn" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}TrackID"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}TrackName" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}EssenceTrackNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}TrackSegment"/>
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
@XmlRootElement(name = "TimelineTrack")
public class TimelineTrack {

    @XmlElement(name = "EditRate", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    protected String editRate;
    @XmlElement(name = "Origin", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String origin;
    @XmlElement(name = "PackageMarkOutPosition", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String packageMarkOutPosition;
    @XmlElement(name = "MarkOut", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String markOut;
    @XmlElement(name = "PackageMarkInPosition", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String packageMarkInPosition;
    @XmlElement(name = "UserPosition", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String userPosition;
    @XmlElement(name = "MarkIn", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String markIn;
    @XmlElement(name = "TrackID", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String trackID;
    @XmlElement(name = "TrackName", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String trackName;
    @XmlElement(name = "EssenceTrackNumber", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String essenceTrackNumber;
    @XmlElement(name = "TrackSegment", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    protected SegmentStrongReference trackSegment;
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
     * Gets the value of the editRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditRate() {
        return editRate;
    }

    /**
     * Sets the value of the editRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditRate(String value) {
        this.editRate = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the packageMarkOutPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageMarkOutPosition() {
        return packageMarkOutPosition;
    }

    /**
     * Sets the value of the packageMarkOutPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageMarkOutPosition(String value) {
        this.packageMarkOutPosition = value;
    }

    /**
     * Gets the value of the markOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkOut() {
        return markOut;
    }

    /**
     * Sets the value of the markOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkOut(String value) {
        this.markOut = value;
    }

    /**
     * Gets the value of the packageMarkInPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageMarkInPosition() {
        return packageMarkInPosition;
    }

    /**
     * Sets the value of the packageMarkInPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageMarkInPosition(String value) {
        this.packageMarkInPosition = value;
    }

    /**
     * Gets the value of the userPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPosition() {
        return userPosition;
    }

    /**
     * Sets the value of the userPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPosition(String value) {
        this.userPosition = value;
    }

    /**
     * Gets the value of the markIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkIn() {
        return markIn;
    }

    /**
     * Sets the value of the markIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkIn(String value) {
        this.markIn = value;
    }

    /**
     * Gets the value of the trackID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackID() {
        return trackID;
    }

    /**
     * Sets the value of the trackID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackID(String value) {
        this.trackID = value;
    }

    /**
     * Gets the value of the trackName property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getTrackName() {
        return trackName;
    }

    /**
     * Sets the value of the trackName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setTrackName(UTF16String value) {
        this.trackName = value;
    }

    /**
     * Gets the value of the essenceTrackNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssenceTrackNumber() {
        return essenceTrackNumber;
    }

    /**
     * Sets the value of the essenceTrackNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssenceTrackNumber(String value) {
        this.essenceTrackNumber = value;
    }

    /**
     * Gets the value of the trackSegment property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentStrongReference }
     *     
     */
    public SegmentStrongReference getTrackSegment() {
        return trackSegment;
    }

    /**
     * Sets the value of the trackSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentStrongReference }
     *     
     */
    public void setTrackSegment(SegmentStrongReference value) {
        this.trackSegment = value;
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
