//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package uk.org.ifopt.acsb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for of a specific SUITABILITY.
 * 
 * <p>Java class for SuitabilityStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuitabilityStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Suitable" type="{http://www.ifopt.org.uk/acsb}SuitabilityEnumeration"/>
 *         &lt;element name="UserNeed" type="{http://www.ifopt.org.uk/acsb}UserNeedStructure"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuitabilityStructure", propOrder = {
    "suitable",
    "userNeed"
})
public class SuitabilityStructure {

    @XmlElement(name = "Suitable", required = true)
    protected SuitabilityEnumeration suitable;
    @XmlElement(name = "UserNeed", required = true)
    protected UserNeedStructure userNeed;

    /**
     * Gets the value of the suitable property.
     * 
     * @return
     *     possible object is
     *     {@link SuitabilityEnumeration }
     *     
     */
    public SuitabilityEnumeration getSuitable() {
        return suitable;
    }

    /**
     * Sets the value of the suitable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuitabilityEnumeration }
     *     
     */
    public void setSuitable(SuitabilityEnumeration value) {
        this.suitable = value;
    }

    /**
     * Gets the value of the userNeed property.
     * 
     * @return
     *     possible object is
     *     {@link UserNeedStructure }
     *     
     */
    public UserNeedStructure getUserNeed() {
        return userNeed;
    }

    /**
     * Sets the value of the userNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserNeedStructure }
     *     
     */
    public void setUserNeed(UserNeedStructure value) {
        this.userNeed = value;
    }

}
