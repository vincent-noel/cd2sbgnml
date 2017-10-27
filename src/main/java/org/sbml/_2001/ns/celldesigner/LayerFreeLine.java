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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for layerFreeLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="layerFreeLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bounds" type="{http://www.sbml.org/2001/ns/celldesigner}layerLineBounds"/>
 *         &lt;element name="line" type="{http://www.sbml.org/2001/ns/celldesigner}line"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isArrow" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isDotted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "layerFreeLine", propOrder = {
    "bounds",
    "line"
})
public class LayerFreeLine {

    @XmlElement(required = true)
    protected LayerLineBounds bounds;
    @XmlElement(required = true)
    protected Line line;
    @XmlAttribute(name = "isArrow")
    protected Boolean isArrow;
    @XmlAttribute(name = "isDotted")
    protected Boolean isDotted;

    /**
     * Gets the value of the bounds property.
     * 
     * @return
     *     possible object is
     *     {@link LayerLineBounds }
     *     
     */
    public LayerLineBounds getBounds() {
        return bounds;
    }

    /**
     * Sets the value of the bounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayerLineBounds }
     *     
     */
    public void setBounds(LayerLineBounds value) {
        this.bounds = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link Line }
     *     
     */
    public Line getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setLine(Line value) {
        this.line = value;
    }

    /**
     * Gets the value of the isArrow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArrow() {
        return isArrow;
    }

    /**
     * Sets the value of the isArrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArrow(Boolean value) {
        this.isArrow = value;
    }

    /**
     * Gets the value of the isDotted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDotted() {
        return isDotted;
    }

    /**
     * Sets the value of the isDotted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDotted(Boolean value) {
        this.isDotted = value;
    }

}
