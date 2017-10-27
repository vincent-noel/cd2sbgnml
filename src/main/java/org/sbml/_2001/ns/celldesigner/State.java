//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.27 at 10:08:13 AM CEST 
//


package org.sbml._2001.ns.celldesigner;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Chemical "state" to distinguish chemical species derived from a root chemical.
 * 
 * <p>Java class for state complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="state">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}homodimer" minOccurs="0"/>
 *         &lt;element name="listOfModifications" type="{http://www.sbml.org/2001/ns/celldesigner}listOfModifications" minOccurs="0"/>
 *         &lt;element name="listOfStructuralStates" type="{http://www.sbml.org/2001/ns/celldesigner}listOfStructuralStates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "state", propOrder = {
    "homodimer",
    "listOfModifications",
    "listOfStructuralStates"
})
public class State {

    protected BigInteger homodimer;
    protected ListOfModifications listOfModifications;
    protected ListOfStructuralStates listOfStructuralStates;

    /**
     * Gets the value of the homodimer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHomodimer() {
        return homodimer;
    }

    /**
     * Sets the value of the homodimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHomodimer(BigInteger value) {
        this.homodimer = value;
    }

    /**
     * Gets the value of the listOfModifications property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfModifications }
     *     
     */
    public ListOfModifications getListOfModifications() {
        return listOfModifications;
    }

    /**
     * Sets the value of the listOfModifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfModifications }
     *     
     */
    public void setListOfModifications(ListOfModifications value) {
        this.listOfModifications = value;
    }

    /**
     * Gets the value of the listOfStructuralStates property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfStructuralStates }
     *     
     */
    public ListOfStructuralStates getListOfStructuralStates() {
        return listOfStructuralStates;
    }

    /**
     * Sets the value of the listOfStructuralStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfStructuralStates }
     *     
     */
    public void setListOfStructuralStates(ListOfStructuralStates value) {
        this.listOfStructuralStates = value;
    }

}
