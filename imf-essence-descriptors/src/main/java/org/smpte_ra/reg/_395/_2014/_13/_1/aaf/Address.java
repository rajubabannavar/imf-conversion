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
import org.smpte_ra.reg._2003._2012.DescriptiveObjectStrongReferenceSet;
import org.smpte_ra.reg._2003._2012.NameValueStrongReferenceSet;
import org.smpte_ra.reg._2003._2012.S330MSpatial;
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
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}CommunicationsObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}StreetNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}RoomSuiteNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}StateProvinceCounty" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}City" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}PostalTown" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}StreetName" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}Country" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}PostalCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}BuildingName" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}RoomSuiteName" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}GeographicalCoordinates" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}AstronomicalBodyName" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}PlaceName" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}AddressNameValueObjects" minOccurs="0"/>
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
@XmlRootElement(name = "Address")
public class Address {

    @XmlElement(name = "CommunicationsObjects", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected DescriptiveObjectStrongReferenceSet communicationsObjects;
    @XmlElement(name = "StreetNumber", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String streetNumber;
    @XmlElement(name = "RoomSuiteNumber", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String roomSuiteNumber;
    @XmlElement(name = "StateProvinceCounty", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String stateProvinceCounty;
    @XmlElement(name = "City", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String city;
    @XmlElement(name = "PostalTown", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String postalTown;
    @XmlElement(name = "StreetName", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String streetName;
    @XmlElement(name = "Country", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String country;
    @XmlElement(name = "PostalCode", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String postalCode;
    @XmlElement(name = "BuildingName", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String buildingName;
    @XmlElement(name = "RoomSuiteName", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String roomSuiteName;
    @XmlElement(name = "GeographicalCoordinates", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected S330MSpatial geographicalCoordinates;
    @XmlElement(name = "AstronomicalBodyName", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String astronomicalBodyName;
    @XmlElement(name = "PlaceName", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected UTF16String placeName;
    @XmlElement(name = "AddressNameValueObjects", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected NameValueStrongReferenceSet addressNameValueObjects;
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
     * Gets the value of the communicationsObjects property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptiveObjectStrongReferenceSet }
     *     
     */
    public DescriptiveObjectStrongReferenceSet getCommunicationsObjects() {
        return communicationsObjects;
    }

    /**
     * Sets the value of the communicationsObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptiveObjectStrongReferenceSet }
     *     
     */
    public void setCommunicationsObjects(DescriptiveObjectStrongReferenceSet value) {
        this.communicationsObjects = value;
    }

    /**
     * Gets the value of the streetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the value of the streetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setStreetNumber(UTF16String value) {
        this.streetNumber = value;
    }

    /**
     * Gets the value of the roomSuiteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getRoomSuiteNumber() {
        return roomSuiteNumber;
    }

    /**
     * Sets the value of the roomSuiteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setRoomSuiteNumber(UTF16String value) {
        this.roomSuiteNumber = value;
    }

    /**
     * Gets the value of the stateProvinceCounty property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getStateProvinceCounty() {
        return stateProvinceCounty;
    }

    /**
     * Sets the value of the stateProvinceCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setStateProvinceCounty(UTF16String value) {
        this.stateProvinceCounty = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setCity(UTF16String value) {
        this.city = value;
    }

    /**
     * Gets the value of the postalTown property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getPostalTown() {
        return postalTown;
    }

    /**
     * Sets the value of the postalTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setPostalTown(UTF16String value) {
        this.postalTown = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setStreetName(UTF16String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setCountry(UTF16String value) {
        this.country = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setPostalCode(UTF16String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setBuildingName(UTF16String value) {
        this.buildingName = value;
    }

    /**
     * Gets the value of the roomSuiteName property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getRoomSuiteName() {
        return roomSuiteName;
    }

    /**
     * Sets the value of the roomSuiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setRoomSuiteName(UTF16String value) {
        this.roomSuiteName = value;
    }

    /**
     * Gets the value of the geographicalCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link S330MSpatial }
     *     
     */
    public S330MSpatial getGeographicalCoordinates() {
        return geographicalCoordinates;
    }

    /**
     * Sets the value of the geographicalCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link S330MSpatial }
     *     
     */
    public void setGeographicalCoordinates(S330MSpatial value) {
        this.geographicalCoordinates = value;
    }

    /**
     * Gets the value of the astronomicalBodyName property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getAstronomicalBodyName() {
        return astronomicalBodyName;
    }

    /**
     * Sets the value of the astronomicalBodyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setAstronomicalBodyName(UTF16String value) {
        this.astronomicalBodyName = value;
    }

    /**
     * Gets the value of the placeName property.
     * 
     * @return
     *     possible object is
     *     {@link UTF16String }
     *     
     */
    public UTF16String getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTF16String }
     *     
     */
    public void setPlaceName(UTF16String value) {
        this.placeName = value;
    }

    /**
     * Gets the value of the addressNameValueObjects property.
     * 
     * @return
     *     possible object is
     *     {@link NameValueStrongReferenceSet }
     *     
     */
    public NameValueStrongReferenceSet getAddressNameValueObjects() {
        return addressNameValueObjects;
    }

    /**
     * Sets the value of the addressNameValueObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueStrongReferenceSet }
     *     
     */
    public void setAddressNameValueObjects(NameValueStrongReferenceSet value) {
        this.addressNameValueObjects = value;
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
