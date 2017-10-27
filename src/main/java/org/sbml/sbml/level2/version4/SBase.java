//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.27 at 10:08:13 AM CEST 
//


package org.sbml.sbml.level2.version4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * The SBase type is the base type of all main components in SBML.  It supports attaching metadata, notes and annotations to components.
 * 
 * <p>Java class for SBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='skip' namespace='http://www.w3.org/1999/xhtml' maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="metaid" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBase", propOrder = {
    "notes"
})
@XmlSeeAlso({
    OriginalModel.ListOfFunctionDefinitions.class,
    OriginalModel.ListOfUnitDefinitions.class,
    OriginalModel.ListOfCompartments.class,
    OriginalModel.ListOfSpecies.class,
    OriginalModel.ListOfParameters.class,
    OriginalModel.ListOfRules.class,
    OriginalModel.ListOfReactions.class,
    OriginalModel.ListOfEvents.class,
    OriginalModel.class,
    StoichiometryMath.class,
    OriginalCompartment.class,
    Unit.class,
    MathField.class,
    ListOfSpeciesReferences.class,
    org.sbml.sbml.level2.version4.ListOfParameters.class,
    ListOfEventAssignments.class,
    FunctionDefinition.class,
    OriginalSpecies.class,
    SimpleSpeciesReference.class,
    UnitDefinition.class,
    ListOfModifierSpeciesReferences.class,
    EventAssignment.class,
    OriginalReaction.class,
    Parameter.class,
    Event.class,
    Rule.class,
    ListOfUnits.class,
    KineticLaw.class,
    Sbml.class
})
public abstract class SBase {

    protected SBase.Notes notes;
    @XmlAttribute(name = "metaid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String metaid;

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link SBase.Notes }
     *     
     */
    public SBase.Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBase.Notes }
     *     
     */
    public void setNotes(SBase.Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the metaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaid() {
        return metaid;
    }

    /**
     * Sets the value of the metaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaid(String value) {
        this.metaid = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any processContents='skip' namespace='http://www.w3.org/1999/xhtml' maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Notes {

        @XmlAnyElement
        protected List<Element> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        public List<Element> getAny() {
            if (any == null) {
                any = new ArrayList<Element>();
            }
            return this.any;
        }

    }

}
