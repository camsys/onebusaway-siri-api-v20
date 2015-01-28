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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegPointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegPointLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpegDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc02DirectionTypeEnum"/>
 *         &lt;element name="tpegPointLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegPointLocation", propOrder = {
    "tpegDirection",
    "tpegPointLocationExtension"
})
@XmlSeeAlso({
    TpegSimplePoint.class,
    TpegFramedPoint.class
})
public abstract class TpegPointLocation {

    @XmlElement(required = true)
    protected TpegLoc02DirectionTypeEnum tpegDirection;
    protected ExtensionType tpegPointLocationExtension;

    /**
     * Gets the value of the tpegDirection property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc02DirectionTypeEnum }
     *     
     */
    public TpegLoc02DirectionTypeEnum getTpegDirection() {
        return tpegDirection;
    }

    /**
     * Sets the value of the tpegDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc02DirectionTypeEnum }
     *     
     */
    public void setTpegDirection(TpegLoc02DirectionTypeEnum value) {
        this.tpegDirection = value;
    }

    /**
     * Gets the value of the tpegPointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegPointLocationExtension() {
        return tpegPointLocationExtension;
    }

    /**
     * Sets the value of the tpegPointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegPointLocationExtension(ExtensionType value) {
        this.tpegPointLocationExtension = value;
    }

}
