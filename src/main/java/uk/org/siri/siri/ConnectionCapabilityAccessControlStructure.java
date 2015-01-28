//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract type for capability access control.
 * 
 * <p>Java class for ConnectionCapabilityAccessControlStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionCapabilityAccessControlStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityAccessControlStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}CheckOperatorRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}CheckLineRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}CheckConnectionLinkRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionCapabilityAccessControlStructure", propOrder = {
    "checkOperatorRef",
    "checkLineRef",
    "checkConnectionLinkRef"
})
public class ConnectionCapabilityAccessControlStructure
    extends CapabilityAccessControlStructure
{

    @XmlElement(name = "CheckOperatorRef", defaultValue = "true")
    protected Boolean checkOperatorRef;
    @XmlElement(name = "CheckLineRef", defaultValue = "true")
    protected Boolean checkLineRef;
    @XmlElement(name = "CheckConnectionLinkRef", defaultValue = "true")
    protected Boolean checkConnectionLinkRef;

    /**
     * Gets the value of the checkOperatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckOperatorRef() {
        return checkOperatorRef;
    }

    /**
     * Sets the value of the checkOperatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckOperatorRef(Boolean value) {
        this.checkOperatorRef = value;
    }

    /**
     * Gets the value of the checkLineRef property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckLineRef() {
        return checkLineRef;
    }

    /**
     * Sets the value of the checkLineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckLineRef(Boolean value) {
        this.checkLineRef = value;
    }

    /**
     * If access control is supported, whether access control by CONNECTION LINK is supported. Default is 'true'.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckConnectionLinkRef() {
        return checkConnectionLinkRef;
    }

    /**
     * Sets the value of the checkConnectionLinkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckConnectionLinkRef(Boolean value) {
        this.checkConnectionLinkRef = value;
    }

}
