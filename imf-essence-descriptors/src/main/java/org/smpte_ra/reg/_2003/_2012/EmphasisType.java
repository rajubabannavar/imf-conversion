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
 * <p>Java class for EmphasisType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmphasisType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Emphasis_Unknown"/>
 *     &lt;enumeration value="Emphasis_Reserved0"/>
 *     &lt;enumeration value="Emphasis_Reserved1"/>
 *     &lt;enumeration value="Emphasis_Reserved2"/>
 *     &lt;enumeration value="Emphasis_None"/>
 *     &lt;enumeration value="Emphasis_Reserved3"/>
 *     &lt;enumeration value="Emphasis_15and50"/>
 *     &lt;enumeration value="Emphasis_ITU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmphasisType")
@XmlEnum
public enum EmphasisType {

    @XmlEnumValue("Emphasis_Unknown")
    EMPHASIS_UNKNOWN("Emphasis_Unknown"),
    @XmlEnumValue("Emphasis_Reserved0")
    EMPHASIS_RESERVED_0("Emphasis_Reserved0"),
    @XmlEnumValue("Emphasis_Reserved1")
    EMPHASIS_RESERVED_1("Emphasis_Reserved1"),
    @XmlEnumValue("Emphasis_Reserved2")
    EMPHASIS_RESERVED_2("Emphasis_Reserved2"),
    @XmlEnumValue("Emphasis_None")
    EMPHASIS_NONE("Emphasis_None"),
    @XmlEnumValue("Emphasis_Reserved3")
    EMPHASIS_RESERVED_3("Emphasis_Reserved3"),
    @XmlEnumValue("Emphasis_15and50")
    EMPHASIS_15_AND_50("Emphasis_15and50"),
    @XmlEnumValue("Emphasis_ITU")
    EMPHASIS_ITU("Emphasis_ITU");
    private final String value;

    EmphasisType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmphasisType fromValue(String v) {
        for (EmphasisType c: EmphasisType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
