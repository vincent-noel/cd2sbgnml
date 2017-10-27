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
 * For compartment aliases.
 * 
 * <p>Java class for compartmentAlias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compartmentAlias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}class"/>
 *         &lt;choice>
 *           &lt;element name="bounds" type="{http://www.sbml.org/2001/ns/celldesigner}bounds" minOccurs="0"/>
 *           &lt;element name="point" type="{http://www.sbml.org/2001/ns/celldesigner}point" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="namePoint" type="{http://www.sbml.org/2001/ns/celldesigner}point"/>
 *         &lt;element name="doubleLine" type="{http://www.sbml.org/2001/ns/celldesigner}doubleLine"/>
 *         &lt;element name="paint" type="{http://www.sbml.org/2001/ns/celldesigner}paint"/>
 *         &lt;element name="info" type="{http://www.sbml.org/2001/ns/celldesigner}info"/>
 *       &lt;/sequence>
 *       &lt;attribute name="compartment" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.sbml.org/2001/ns/celldesigner}SId">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.sbml.org/2001/ns/celldesigner}SId">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compartmentAlias", propOrder = {
    "clazz",
    "bounds",
    "point",
    "namePoint",
    "doubleLine",
    "paint",
    "info"
})
public class CompartmentAlias {

    @XmlElement(name = "class", required = true)
    protected String clazz;
    protected Bounds bounds;
    protected Point point;
    @XmlElement(required = true)
    protected Point namePoint;
    @XmlElement(required = true)
    protected DoubleLine doubleLine;
    @XmlElement(required = true)
    protected Paint paint;
    @XmlElement(required = true)
    protected Info info;
    @XmlAttribute(name = "compartment", required = true)
    protected String compartment;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the bounds property.
     * 
     * @return
     *     possible object is
     *     {@link Bounds }
     *     
     */
    public Bounds getBounds() {
        return bounds;
    }

    /**
     * Sets the value of the bounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bounds }
     *     
     */
    public void setBounds(Bounds value) {
        this.bounds = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setPoint(Point value) {
        this.point = value;
    }

    /**
     * Gets the value of the namePoint property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getNamePoint() {
        return namePoint;
    }

    /**
     * Sets the value of the namePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setNamePoint(Point value) {
        this.namePoint = value;
    }

    /**
     * Gets the value of the doubleLine property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleLine }
     *     
     */
    public DoubleLine getDoubleLine() {
        return doubleLine;
    }

    /**
     * Sets the value of the doubleLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleLine }
     *     
     */
    public void setDoubleLine(DoubleLine value) {
        this.doubleLine = value;
    }

    /**
     * Gets the value of the paint property.
     * 
     * @return
     *     possible object is
     *     {@link Paint }
     *     
     */
    public Paint getPaint() {
        return paint;
    }

    /**
     * Sets the value of the paint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paint }
     *     
     */
    public void setPaint(Paint value) {
        this.paint = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link Info }
     *     
     */
    public Info getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link Info }
     *     
     */
    public void setInfo(Info value) {
        this.info = value;
    }

    /**
     * Gets the value of the compartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompartment() {
        return compartment;
    }

    /**
     * Sets the value of the compartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompartment(String value) {
        this.compartment = value;
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

}
