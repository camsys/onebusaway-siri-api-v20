//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCMethod2Linear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod2Linear">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLinear">
 *       &lt;sequence>
 *         &lt;element name="alertCDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCDirection"/>
 *         &lt;element name="alertCMethod2PrimaryPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCMethod2PrimaryPointLocation"/>
 *         &lt;element name="alertCMethod2SecondaryPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCMethod2SecondaryPointLocation"/>
 *         &lt;element name="alertCMethod2LinearExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod2Linear", propOrder = {
    "alertCDirection",
    "alertCMethod2PrimaryPointLocation",
    "alertCMethod2SecondaryPointLocation",
    "alertCMethod2LinearExtension"
})
public class AlertCMethod2Linear
    extends AlertCLinear
{

    @XmlElement(required = true)
    protected AlertCDirection alertCDirection;
    @XmlElement(required = true)
    protected AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation;
    @XmlElement(required = true)
    protected AlertCMethod2SecondaryPointLocation alertCMethod2SecondaryPointLocation;
    protected ExtensionType alertCMethod2LinearExtension;

    /**
     * Gets the value of the alertCDirection property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCDirection }
     *     
     */
    public AlertCDirection getAlertCDirection() {
        return alertCDirection;
    }

    /**
     * Sets the value of the alertCDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCDirection }
     *     
     */
    public void setAlertCDirection(AlertCDirection value) {
        this.alertCDirection = value;
    }

    /**
     * Gets the value of the alertCMethod2PrimaryPointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod2PrimaryPointLocation }
     *     
     */
    public AlertCMethod2PrimaryPointLocation getAlertCMethod2PrimaryPointLocation() {
        return alertCMethod2PrimaryPointLocation;
    }

    /**
     * Sets the value of the alertCMethod2PrimaryPointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod2PrimaryPointLocation }
     *     
     */
    public void setAlertCMethod2PrimaryPointLocation(AlertCMethod2PrimaryPointLocation value) {
        this.alertCMethod2PrimaryPointLocation = value;
    }

    /**
     * Gets the value of the alertCMethod2SecondaryPointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCMethod2SecondaryPointLocation }
     *     
     */
    public AlertCMethod2SecondaryPointLocation getAlertCMethod2SecondaryPointLocation() {
        return alertCMethod2SecondaryPointLocation;
    }

    /**
     * Sets the value of the alertCMethod2SecondaryPointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCMethod2SecondaryPointLocation }
     *     
     */
    public void setAlertCMethod2SecondaryPointLocation(AlertCMethod2SecondaryPointLocation value) {
        this.alertCMethod2SecondaryPointLocation = value;
    }

    /**
     * Gets the value of the alertCMethod2LinearExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCMethod2LinearExtension() {
        return alertCMethod2LinearExtension;
    }

    /**
     * Sets the value of the alertCMethod2LinearExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCMethod2LinearExtension(ExtensionType value) {
        this.alertCMethod2LinearExtension = value;
    }

}
