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
import org.smpte_ra.reg._2003._2012.ProductVersionType;
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
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ApplicationVersionString"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}FileModificationDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ApplicationVersion" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ApplicationPlatform" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ApplicationSupplierName"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ApplicationName"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}GenerationID"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ToolkitVersion" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ApplicationProductID"/>
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
@XmlRootElement(name = "Identification")
public class Identification {

    @XmlElement(name = "ApplicationVersionString", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    protected UTF16String applicationVersionString;
    @XmlElement(name = "FileModificationDate", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String fileModificationDate;
    @XmlElement(name = "ApplicationVersion", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected ProductVersionType applicationVersion;
    @XmlElement(name = "ApplicationPlatform", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String applicationPlatform;
    @XmlElement(name = "ApplicationSupplierName", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    protected UTF16String applicationSupplierName;
    @XmlElement(name = "ApplicationName", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    protected UTF16String applicationName;
    @XmlElement(name = "GenerationID", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String generationID;
    @XmlElement(name = "ToolkitVersion", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected ProductVersionType toolkitVersion;
    @XmlElement(name = "ApplicationProductID", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String applicationProductID;
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
     * Gets the value of the applicationVersionString property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getApplicationVersionString() {
        return applicationVersionString;
    }

    /**
     * Sets the value of the applicationVersionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setApplicationVersionString(UTF16String value) {
        this.applicationVersionString = value;
    }

    /**
     * Gets the value of the fileModificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileModificationDate() {
        return fileModificationDate;
    }

    /**
     * Sets the value of the fileModificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileModificationDate(String value) {
        this.fileModificationDate = value;
    }

    /**
     * Gets the value of the applicationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ProductVersionType }
     *     
     */
    public ProductVersionType getApplicationVersion() {
        return applicationVersion;
    }

    /**
     * Sets the value of the applicationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductVersionType }
     *     
     */
    public void setApplicationVersion(ProductVersionType value) {
        this.applicationVersion = value;
    }

    /**
     * Gets the value of the applicationPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getApplicationPlatform() {
        return applicationPlatform;
    }

    /**
     * Sets the value of the applicationPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setApplicationPlatform(UTF16String value) {
        this.applicationPlatform = value;
    }

    /**
     * Gets the value of the applicationSupplierName property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getApplicationSupplierName() {
        return applicationSupplierName;
    }

    /**
     * Sets the value of the applicationSupplierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setApplicationSupplierName(UTF16String value) {
        this.applicationSupplierName = value;
    }

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setApplicationName(UTF16String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the generationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerationID() {
        return generationID;
    }

    /**
     * Sets the value of the generationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerationID(String value) {
        this.generationID = value;
    }

    /**
     * Gets the value of the toolkitVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ProductVersionType }
     *     
     */
    public ProductVersionType getToolkitVersion() {
        return toolkitVersion;
    }

    /**
     * Sets the value of the toolkitVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductVersionType }
     *     
     */
    public void setToolkitVersion(ProductVersionType value) {
        this.toolkitVersion = value;
    }

    /**
     * Gets the value of the applicationProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationProductID() {
        return applicationProductID;
    }

    /**
     * Sets the value of the applicationProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationProductID(String value) {
        this.applicationProductID = value;
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
