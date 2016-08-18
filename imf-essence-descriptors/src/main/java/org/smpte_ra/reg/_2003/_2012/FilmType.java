//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package org.smpte_ra.reg._2003._2012;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilmType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilmType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FtNull"/>
 *     &lt;enumeration value="Ft35MM"/>
 *     &lt;enumeration value="Ft16MM"/>
 *     &lt;enumeration value="Ft8MM"/>
 *     &lt;enumeration value="Ft65MM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FilmType")
@XmlEnum
public enum FilmType {

    @XmlEnumValue("FtNull")
    FT_NULL("FtNull"),
    @XmlEnumValue("Ft35MM")
    FT_35_MM("Ft35MM"),
    @XmlEnumValue("Ft16MM")
    FT_16_MM("Ft16MM"),
    @XmlEnumValue("Ft8MM")
    FT_8_MM("Ft8MM"),
    @XmlEnumValue("Ft65MM")
    FT_65_MM("Ft65MM");
    private final String value;

    FilmType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilmType fromValue(String v) {
        for (FilmType c: FilmType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
