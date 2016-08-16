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
import org.smpte_ra.reg._2003._2012.KLVDataStrongReferenceVector;
import org.smpte_ra.reg._2003._2012.SegmentStrongReference;
import org.smpte_ra.reg._2003._2012.SegmentStrongReferenceVector;
import org.smpte_ra.reg._2003._2012.TaggedValueStrongReferenceVector;


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
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}AlternateSegments" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}SelectedSegment"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ComponentKLVData" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ComponentLength" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ComponentUserComments" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ComponentDataDefinition"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ComponentAttributes" minOccurs="0"/>
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
@XmlRootElement(name = "Selector")
public class Selector {

    @XmlElement(name = "AlternateSegments", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected SegmentStrongReferenceVector alternateSegments;
    @XmlElement(name = "SelectedSegment", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    protected SegmentStrongReference selectedSegment;
    @XmlElement(name = "ComponentKLVData", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected KLVDataStrongReferenceVector componentKLVData;
    @XmlElement(name = "ComponentLength", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String componentLength;
    @XmlElement(name = "ComponentUserComments", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected TaggedValueStrongReferenceVector componentUserComments;
    @XmlElement(name = "ComponentDataDefinition", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String componentDataDefinition;
    @XmlElement(name = "ComponentAttributes", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected TaggedValueStrongReferenceVector componentAttributes;
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
     * Gets the value of the alternateSegments property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentStrongReferenceVector }
     *     
     */
    public SegmentStrongReferenceVector getAlternateSegments() {
        return alternateSegments;
    }

    /**
     * Sets the value of the alternateSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentStrongReferenceVector }
     *     
     */
    public void setAlternateSegments(SegmentStrongReferenceVector value) {
        this.alternateSegments = value;
    }

    /**
     * Gets the value of the selectedSegment property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentStrongReference }
     *     
     */
    public SegmentStrongReference getSelectedSegment() {
        return selectedSegment;
    }

    /**
     * Sets the value of the selectedSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentStrongReference }
     *     
     */
    public void setSelectedSegment(SegmentStrongReference value) {
        this.selectedSegment = value;
    }

    /**
     * Gets the value of the componentKLVData property.
     * 
     * @return
     *     possible object is
     *     {@link KLVDataStrongReferenceVector }
     *     
     */
    public KLVDataStrongReferenceVector getComponentKLVData() {
        return componentKLVData;
    }

    /**
     * Sets the value of the componentKLVData property.
     * 
     * @param value
     *     allowed object is
     *     {@link KLVDataStrongReferenceVector }
     *     
     */
    public void setComponentKLVData(KLVDataStrongReferenceVector value) {
        this.componentKLVData = value;
    }

    /**
     * Gets the value of the componentLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentLength() {
        return componentLength;
    }

    /**
     * Sets the value of the componentLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentLength(String value) {
        this.componentLength = value;
    }

    /**
     * Gets the value of the componentUserComments property.
     * 
     * @return
     *     possible object is
     *     {@link TaggedValueStrongReferenceVector }
     *     
     */
    public TaggedValueStrongReferenceVector getComponentUserComments() {
        return componentUserComments;
    }

    /**
     * Sets the value of the componentUserComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaggedValueStrongReferenceVector }
     *     
     */
    public void setComponentUserComments(TaggedValueStrongReferenceVector value) {
        this.componentUserComments = value;
    }

    /**
     * Gets the value of the componentDataDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentDataDefinition() {
        return componentDataDefinition;
    }

    /**
     * Sets the value of the componentDataDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentDataDefinition(String value) {
        this.componentDataDefinition = value;
    }

    /**
     * Gets the value of the componentAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link TaggedValueStrongReferenceVector }
     *     
     */
    public TaggedValueStrongReferenceVector getComponentAttributes() {
        return componentAttributes;
    }

    /**
     * Sets the value of the componentAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaggedValueStrongReferenceVector }
     *     
     */
    public void setComponentAttributes(TaggedValueStrongReferenceVector value) {
        this.componentAttributes = value;
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
