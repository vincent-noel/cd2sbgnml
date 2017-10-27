//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.27 at 10:08:13 AM CEST 
//


package org.sbml._2001.ns.celldesigner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for layer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="layer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfTexts" type="{http://www.sbml.org/2001/ns/celldesigner}listOfTexts" minOccurs="0"/>
 *         &lt;element name="listOfSquares" type="{http://www.sbml.org/2001/ns/celldesigner}listOfSquares" minOccurs="0"/>
 *         &lt;element name="listOfFreeLines" type="{http://www.sbml.org/2001/ns/celldesigner}listOfFreeLines" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="locked" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="visible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "layer", propOrder = {
    "listOfTexts",
    "listOfSquares",
    "listOfFreeLines"
})
public class Layer {

    protected ListOfTexts listOfTexts;
    protected ListOfSquares listOfSquares;
    protected ListOfFreeLines listOfFreeLines;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "locked", required = true)
    protected boolean locked;
    @XmlAttribute(name = "visible", required = true)
    protected boolean visible;

    /**
     * Gets the value of the listOfTexts property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfTexts }
     *     
     */
    public ListOfTexts getListOfTexts() {
        return listOfTexts;
    }

    /**
     * Sets the value of the listOfTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfTexts }
     *     
     */
    public void setListOfTexts(ListOfTexts value) {
        this.listOfTexts = value;
    }

    /**
     * Gets the value of the listOfSquares property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSquares }
     *     
     */
    public ListOfSquares getListOfSquares() {
        return listOfSquares;
    }

    /**
     * Sets the value of the listOfSquares property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSquares }
     *     
     */
    public void setListOfSquares(ListOfSquares value) {
        this.listOfSquares = value;
    }

    /**
     * Gets the value of the listOfFreeLines property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfFreeLines }
     *     
     */
    public ListOfFreeLines getListOfFreeLines() {
        return listOfFreeLines;
    }

    /**
     * Sets the value of the listOfFreeLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfFreeLines }
     *     
     */
    public void setListOfFreeLines(ListOfFreeLines value) {
        this.listOfFreeLines = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     */
    public void setLocked(boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

}
