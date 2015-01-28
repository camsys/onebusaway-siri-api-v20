//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for information about a FACILITY affected by an SITUATION. (+SIRI 2.0)
 * 
 * <p>Java class for AffectedFacilityStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedFacilityStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}FacilityRef" minOccurs="0"/>
 *         &lt;element name="StartStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/>
 *         &lt;element name="EndStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/>
 *         &lt;element name="FacilityName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FacilityStatus" type="{http://www.siri.org.uk/siri}FacilityStatusEnumeration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedFacilityStructure", propOrder = {
    "facilityRef",
    "startStopPointRef",
    "endStopPointRef",
    "facilityName",
    "facilityStatus",
    "extensions"
})
public class AffectedFacilityStructure {

    @XmlElement(name = "FacilityRef")
    protected FacilityRefStructure facilityRef;
    @XmlElement(name = "StartStopPointRef")
    protected StopPointRefStructure startStopPointRef;
    @XmlElement(name = "EndStopPointRef")
    protected StopPointRefStructure endStopPointRef;
    @XmlElement(name = "FacilityName")
    protected List<NaturalLanguageStringStructure> facilityName;
    @XmlElement(name = "FacilityStatus")
    protected List<FacilityStatusEnumeration> facilityStatus;
    @XmlElement(name = "Extensions")
    protected List<ExtensionsStructure> extensions;

    /**
     * Gets the value of the facilityRef property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRefStructure }
     *     
     */
    public FacilityRefStructure getFacilityRef() {
        return facilityRef;
    }

    /**
     * Sets the value of the facilityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRefStructure }
     *     
     */
    public void setFacilityRef(FacilityRefStructure value) {
        this.facilityRef = value;
    }

    /**
     * Gets the value of the startStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStartStopPointRef() {
        return startStopPointRef;
    }

    /**
     * Sets the value of the startStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStartStopPointRef(StopPointRefStructure value) {
        this.startStopPointRef = value;
    }

    /**
     * Gets the value of the endStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getEndStopPointRef() {
        return endStopPointRef;
    }

    /**
     * Sets the value of the endStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setEndStopPointRef(StopPointRefStructure value) {
        this.endStopPointRef = value;
    }

    /**
     * Gets the value of the facilityName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getFacilityName() {
        if (facilityName == null) {
            facilityName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.facilityName;
    }

    /**
     * Gets the value of the facilityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityStatusEnumeration }
     * 
     * 
     */
    public List<FacilityStatusEnumeration> getFacilityStatus() {
        if (facilityStatus == null) {
            facilityStatus = new ArrayList<FacilityStatusEnumeration>();
        }
        return this.facilityStatus;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionsStructure }
     * 
     * 
     */
    public List<ExtensionsStructure> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<ExtensionsStructure>();
        }
        return this.extensions;
    }

}
