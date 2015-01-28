//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Roadworks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Roadworks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}OperatorAction">
 *       &lt;sequence>
 *         &lt;element name="roadworksDuration" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadworksDurationEnum" minOccurs="0"/>
 *         &lt;element name="roadworksScale" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadworksScaleEnum" minOccurs="0"/>
 *         &lt;element name="underTraffic" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="urgentRoadworks" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="mobility" type="{http://datex2.eu/schema/2_0RC1/2_0}Mobility" minOccurs="0"/>
 *         &lt;element name="subjects" type="{http://datex2.eu/schema/2_0RC1/2_0}Subjects" minOccurs="0"/>
 *         &lt;element name="maintenanceVehicles" type="{http://datex2.eu/schema/2_0RC1/2_0}MaintenanceVehicles" minOccurs="0"/>
 *         &lt;element name="roadworksExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Roadworks", propOrder = {
    "roadworksDuration",
    "roadworksScale",
    "underTraffic",
    "urgentRoadworks",
    "mobility",
    "subjects",
    "maintenanceVehicles",
    "roadworksExtension"
})
@XmlSeeAlso({
    ConstructionWorks.class,
    MaintenanceWorks.class
})
public abstract class Roadworks
    extends OperatorAction
{

    protected RoadworksDurationEnum roadworksDuration;
    protected RoadworksScaleEnum roadworksScale;
    protected Boolean underTraffic;
    protected Boolean urgentRoadworks;
    protected Mobility mobility;
    protected Subjects subjects;
    protected MaintenanceVehicles maintenanceVehicles;
    protected ExtensionType roadworksExtension;

    /**
     * Gets the value of the roadworksDuration property.
     * 
     * @return
     *     possible object is
     *     {@link RoadworksDurationEnum }
     *     
     */
    public RoadworksDurationEnum getRoadworksDuration() {
        return roadworksDuration;
    }

    /**
     * Sets the value of the roadworksDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadworksDurationEnum }
     *     
     */
    public void setRoadworksDuration(RoadworksDurationEnum value) {
        this.roadworksDuration = value;
    }

    /**
     * Gets the value of the roadworksScale property.
     * 
     * @return
     *     possible object is
     *     {@link RoadworksScaleEnum }
     *     
     */
    public RoadworksScaleEnum getRoadworksScale() {
        return roadworksScale;
    }

    /**
     * Sets the value of the roadworksScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadworksScaleEnum }
     *     
     */
    public void setRoadworksScale(RoadworksScaleEnum value) {
        this.roadworksScale = value;
    }

    /**
     * Gets the value of the underTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnderTraffic() {
        return underTraffic;
    }

    /**
     * Sets the value of the underTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnderTraffic(Boolean value) {
        this.underTraffic = value;
    }

    /**
     * Gets the value of the urgentRoadworks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrgentRoadworks() {
        return urgentRoadworks;
    }

    /**
     * Sets the value of the urgentRoadworks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrgentRoadworks(Boolean value) {
        this.urgentRoadworks = value;
    }

    /**
     * Gets the value of the mobility property.
     * 
     * @return
     *     possible object is
     *     {@link Mobility }
     *     
     */
    public Mobility getMobility() {
        return mobility;
    }

    /**
     * Sets the value of the mobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mobility }
     *     
     */
    public void setMobility(Mobility value) {
        this.mobility = value;
    }

    /**
     * Gets the value of the subjects property.
     * 
     * @return
     *     possible object is
     *     {@link Subjects }
     *     
     */
    public Subjects getSubjects() {
        return subjects;
    }

    /**
     * Sets the value of the subjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subjects }
     *     
     */
    public void setSubjects(Subjects value) {
        this.subjects = value;
    }

    /**
     * Gets the value of the maintenanceVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceVehicles }
     *     
     */
    public MaintenanceVehicles getMaintenanceVehicles() {
        return maintenanceVehicles;
    }

    /**
     * Sets the value of the maintenanceVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceVehicles }
     *     
     */
    public void setMaintenanceVehicles(MaintenanceVehicles value) {
        this.maintenanceVehicles = value;
    }

    /**
     * Gets the value of the roadworksExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadworksExtension() {
        return roadworksExtension;
    }

    /**
     * Sets the value of the roadworksExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadworksExtension(ExtensionType value) {
        this.roadworksExtension = value;
    }

}