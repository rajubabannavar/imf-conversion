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
 * <p>Java class for UserDataModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserDataModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UserDataMode_NotDefined"/>
 *     &lt;enumeration value="UserDataMode_192BitBlockStructure"/>
 *     &lt;enumeration value="UserDataMode_AES18"/>
 *     &lt;enumeration value="UserDataMode_UserDefined"/>
 *     &lt;enumeration value="UserDataMode_IEC"/>
 *     &lt;enumeration value="UserDataMode_Metadata"/>
 *     &lt;enumeration value="UserDataMode_Reserved0"/>
 *     &lt;enumeration value="UserDataMode_Reserved1"/>
 *     &lt;enumeration value="UserDataMode_Reserved2"/>
 *     &lt;enumeration value="UserDataMode_Reserved3"/>
 *     &lt;enumeration value="UserDataMode_Reserved4"/>
 *     &lt;enumeration value="UserDataMode_Reserved5"/>
 *     &lt;enumeration value="UserDataMode_Reserved6"/>
 *     &lt;enumeration value="UserDataMode_Reserved7"/>
 *     &lt;enumeration value="UserDataMode_Reserved8"/>
 *     &lt;enumeration value="UserDataMode_Reserved9"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserDataModeType")
@XmlEnum
public enum UserDataModeType {

    @XmlEnumValue("UserDataMode_NotDefined")
    USER_DATA_MODE_NOT_DEFINED("UserDataMode_NotDefined"),
    @XmlEnumValue("UserDataMode_192BitBlockStructure")
    USER_DATA_MODE_192_BIT_BLOCK_STRUCTURE("UserDataMode_192BitBlockStructure"),
    @XmlEnumValue("UserDataMode_AES18")
    USER_DATA_MODE_AES_18("UserDataMode_AES18"),
    @XmlEnumValue("UserDataMode_UserDefined")
    USER_DATA_MODE_USER_DEFINED("UserDataMode_UserDefined"),
    @XmlEnumValue("UserDataMode_IEC")
    USER_DATA_MODE_IEC("UserDataMode_IEC"),
    @XmlEnumValue("UserDataMode_Metadata")
    USER_DATA_MODE_METADATA("UserDataMode_Metadata"),
    @XmlEnumValue("UserDataMode_Reserved0")
    USER_DATA_MODE_RESERVED_0("UserDataMode_Reserved0"),
    @XmlEnumValue("UserDataMode_Reserved1")
    USER_DATA_MODE_RESERVED_1("UserDataMode_Reserved1"),
    @XmlEnumValue("UserDataMode_Reserved2")
    USER_DATA_MODE_RESERVED_2("UserDataMode_Reserved2"),
    @XmlEnumValue("UserDataMode_Reserved3")
    USER_DATA_MODE_RESERVED_3("UserDataMode_Reserved3"),
    @XmlEnumValue("UserDataMode_Reserved4")
    USER_DATA_MODE_RESERVED_4("UserDataMode_Reserved4"),
    @XmlEnumValue("UserDataMode_Reserved5")
    USER_DATA_MODE_RESERVED_5("UserDataMode_Reserved5"),
    @XmlEnumValue("UserDataMode_Reserved6")
    USER_DATA_MODE_RESERVED_6("UserDataMode_Reserved6"),
    @XmlEnumValue("UserDataMode_Reserved7")
    USER_DATA_MODE_RESERVED_7("UserDataMode_Reserved7"),
    @XmlEnumValue("UserDataMode_Reserved8")
    USER_DATA_MODE_RESERVED_8("UserDataMode_Reserved8"),
    @XmlEnumValue("UserDataMode_Reserved9")
    USER_DATA_MODE_RESERVED_9("UserDataMode_Reserved9");
    private final String value;

    UserDataModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserDataModeType fromValue(String v) {
        for (UserDataModeType c: UserDataModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
