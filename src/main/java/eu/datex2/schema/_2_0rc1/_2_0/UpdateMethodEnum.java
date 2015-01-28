//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allElementUpdate"/>
 *     &lt;enumeration value="singleElementUpdate"/>
 *     &lt;enumeration value="snapshot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateMethodEnum")
@XmlEnum
public enum UpdateMethodEnum {

    @XmlEnumValue("allElementUpdate")
    ALL_ELEMENT_UPDATE("allElementUpdate"),
    @XmlEnumValue("singleElementUpdate")
    SINGLE_ELEMENT_UPDATE("singleElementUpdate"),
    @XmlEnumValue("snapshot")
    SNAPSHOT("snapshot");
    private final String value;

    UpdateMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateMethodEnum fromValue(String v) {
        for (UpdateMethodEnum c: UpdateMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
