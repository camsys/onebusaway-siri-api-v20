//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Delivery for ProductionTimetable Capability.
 * 
 * <p>Java class for ProductionTimetableCapabilitiesResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionTimetableCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ProductionTimetableServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ProductionTimetablePermissions" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionTimetableCapabilitiesResponseStructure", propOrder = {
    "productionTimetableServiceCapabilities",
    "productionTimetablePermissions",
    "extensions"
})
public class ProductionTimetableCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
{

    @XmlElement(name = "ProductionTimetableServiceCapabilities")
    protected ProductionTimetableServiceCapabilitiesStructure productionTimetableServiceCapabilities;
    @XmlElement(name = "ProductionTimetablePermissions")
    protected ProductionTimetablePermissions productionTimetablePermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the productionTimetableServiceCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure }
     *     
     */
    public ProductionTimetableServiceCapabilitiesStructure getProductionTimetableServiceCapabilities() {
        return productionTimetableServiceCapabilities;
    }

    /**
     * Sets the value of the productionTimetableServiceCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure }
     *     
     */
    public void setProductionTimetableServiceCapabilities(ProductionTimetableServiceCapabilitiesStructure value) {
        this.productionTimetableServiceCapabilities = value;
    }

    /**
     * Gets the value of the productionTimetablePermissions property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetablePermissions }
     *     
     */
    public ProductionTimetablePermissions getProductionTimetablePermissions() {
        return productionTimetablePermissions;
    }

    /**
     * Sets the value of the productionTimetablePermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetablePermissions }
     *     
     */
    public void setProductionTimetablePermissions(ProductionTimetablePermissions value) {
        this.productionTimetablePermissions = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
