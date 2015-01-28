//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceWorks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceWorks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Roadworks">
 *       &lt;sequence>
 *         &lt;element name="roadMaintenanceType" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadMaintenanceTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="maintenanceWorksExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceWorks", propOrder = {
    "roadMaintenanceType",
    "maintenanceWorksExtension"
})
public class MaintenanceWorks
    extends Roadworks
{

    @XmlElement(required = true)
    protected List<RoadMaintenanceTypeEnum> roadMaintenanceType;
    protected ExtensionType maintenanceWorksExtension;

    /**
     * Gets the value of the roadMaintenanceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roadMaintenanceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadMaintenanceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadMaintenanceTypeEnum }
     * 
     * 
     */
    public List<RoadMaintenanceTypeEnum> getRoadMaintenanceType() {
        if (roadMaintenanceType == null) {
            roadMaintenanceType = new ArrayList<RoadMaintenanceTypeEnum>();
        }
        return this.roadMaintenanceType;
    }

    /**
     * Gets the value of the maintenanceWorksExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMaintenanceWorksExtension() {
        return maintenanceWorksExtension;
    }

    /**
     * Sets the value of the maintenanceWorksExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMaintenanceWorksExtension(ExtensionType value) {
        this.maintenanceWorksExtension = value;
    }

}
