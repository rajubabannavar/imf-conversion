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
import ch.ebu.ebucore.smpte.class13.type.BasicLinkStrongReferenceSet;
import ch.ebu.ebucore.smpte.class13.type.ContactStrongReferenceSet;
import ch.ebu.ebucore.smpte.class13.type.DepartmentStrongReference;
import ch.ebu.ebucore.smpte.class13.type.DetailsStrongReferenceSet;
import ch.ebu.ebucore.smpte.class13.type.IdentifierStrongReferenceSet;
import ch.ebu.ebucore.smpte.class13.type.TextualAnnotationStrongReferenceSet;
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
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}organizationNameObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}organizationDepartmentObject" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}organizationTypeGroupObject" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}organizationDetailsObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}organizationID" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}organizationRelatedInformationLinkObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}organizationLinkToLogo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}organizationCodeObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}organizationNationality" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}organizationLastUpdate" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}organizationRelatedContactObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/element}organizationDescription" minOccurs="0"/>
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
@XmlRootElement(name = "organization")
public class Organization {

    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected TextualAnnotationStrongReferenceSet organizationNameObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected DepartmentStrongReference organizationDepartmentObject;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected TypeGroupStrongReference organizationTypeGroupObject;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected DetailsStrongReferenceSet organizationDetailsObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String organizationID;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected BasicLinkStrongReferenceSet organizationRelatedInformationLinkObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String organizationLinkToLogo;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected IdentifierStrongReferenceSet organizationCodeObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String organizationNationality;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    @XmlSchemaType(name = "anySimpleType")
    protected String organizationLastUpdate;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected ContactStrongReferenceSet organizationRelatedContactObjects;
    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/element")
    protected UTF16String organizationDescription;
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
     * Gets the value of the organizationNameObjects property.
     * 
     * @return
     *     possible object is
     *     {@link TextualAnnotationStrongReferenceSet }
     *     
     */
    public TextualAnnotationStrongReferenceSet getOrganizationNameObjects() {
        return organizationNameObjects;
    }

    /**
     * Sets the value of the organizationNameObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualAnnotationStrongReferenceSet }
     *     
     */
    public void setOrganizationNameObjects(TextualAnnotationStrongReferenceSet value) {
        this.organizationNameObjects = value;
    }

    /**
     * Gets the value of the organizationDepartmentObject property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentStrongReference }
     *     
     */
    public DepartmentStrongReference getOrganizationDepartmentObject() {
        return organizationDepartmentObject;
    }

    /**
     * Sets the value of the organizationDepartmentObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentStrongReference }
     *     
     */
    public void setOrganizationDepartmentObject(DepartmentStrongReference value) {
        this.organizationDepartmentObject = value;
    }

    /**
     * Gets the value of the organizationTypeGroupObject property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGroupStrongReference }
     *     
     */
    public TypeGroupStrongReference getOrganizationTypeGroupObject() {
        return organizationTypeGroupObject;
    }

    /**
     * Sets the value of the organizationTypeGroupObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGroupStrongReference }
     *     
     */
    public void setOrganizationTypeGroupObject(TypeGroupStrongReference value) {
        this.organizationTypeGroupObject = value;
    }

    /**
     * Gets the value of the organizationDetailsObjects property.
     * 
     * @return
     *     possible object is
     *     {@link DetailsStrongReferenceSet }
     *     
     */
    public DetailsStrongReferenceSet getOrganizationDetailsObjects() {
        return organizationDetailsObjects;
    }

    /**
     * Sets the value of the organizationDetailsObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailsStrongReferenceSet }
     *     
     */
    public void setOrganizationDetailsObjects(DetailsStrongReferenceSet value) {
        this.organizationDetailsObjects = value;
    }

    /**
     * Gets the value of the organizationID property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getOrganizationID() {
        return organizationID;
    }

    /**
     * Sets the value of the organizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setOrganizationID(UTF16String value) {
        this.organizationID = value;
    }

    /**
     * Gets the value of the organizationRelatedInformationLinkObjects property.
     * 
     * @return
     *     possible object is
     *     {@link BasicLinkStrongReferenceSet }
     *     
     */
    public BasicLinkStrongReferenceSet getOrganizationRelatedInformationLinkObjects() {
        return organizationRelatedInformationLinkObjects;
    }

    /**
     * Sets the value of the organizationRelatedInformationLinkObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicLinkStrongReferenceSet }
     *     
     */
    public void setOrganizationRelatedInformationLinkObjects(BasicLinkStrongReferenceSet value) {
        this.organizationRelatedInformationLinkObjects = value;
    }

    /**
     * Gets the value of the organizationLinkToLogo property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getOrganizationLinkToLogo() {
        return organizationLinkToLogo;
    }

    /**
     * Sets the value of the organizationLinkToLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setOrganizationLinkToLogo(UTF16String value) {
        this.organizationLinkToLogo = value;
    }

    /**
     * Gets the value of the organizationCodeObjects property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierStrongReferenceSet }
     *     
     */
    public IdentifierStrongReferenceSet getOrganizationCodeObjects() {
        return organizationCodeObjects;
    }

    /**
     * Sets the value of the organizationCodeObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierStrongReferenceSet }
     *     
     */
    public void setOrganizationCodeObjects(IdentifierStrongReferenceSet value) {
        this.organizationCodeObjects = value;
    }

    /**
     * Gets the value of the organizationNationality property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getOrganizationNationality() {
        return organizationNationality;
    }

    /**
     * Sets the value of the organizationNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setOrganizationNationality(UTF16String value) {
        this.organizationNationality = value;
    }

    /**
     * Gets the value of the organizationLastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationLastUpdate() {
        return organizationLastUpdate;
    }

    /**
     * Sets the value of the organizationLastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationLastUpdate(String value) {
        this.organizationLastUpdate = value;
    }

    /**
     * Gets the value of the organizationRelatedContactObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ContactStrongReferenceSet }
     *     
     */
    public ContactStrongReferenceSet getOrganizationRelatedContactObjects() {
        return organizationRelatedContactObjects;
    }

    /**
     * Sets the value of the organizationRelatedContactObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactStrongReferenceSet }
     *     
     */
    public void setOrganizationRelatedContactObjects(ContactStrongReferenceSet value) {
        this.organizationRelatedContactObjects = value;
    }

    /**
     * Gets the value of the organizationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getOrganizationDescription() {
        return organizationDescription;
    }

    /**
     * Sets the value of the organizationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setOrganizationDescription(UTF16String value) {
        this.organizationDescription = value;
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
