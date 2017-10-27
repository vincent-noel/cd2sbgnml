//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.27 at 10:08:13 AM CEST 
//


package org.sbml._2001.ns.celldesigner;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * External protein name connecting to residues.
 * 
 * <p>Java class for externalNameForResidue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="externalNameForResidue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfExternalConnectionsInBlockDiagram" type="{http://www.sbml.org/2001/ns/celldesigner}listOfExternalConnectionsInBlockDiagram"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="offsetY" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="nameOffsetX" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="nameOffsetY" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="protein">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
@XmlType(name = "externalNameForResidue", propOrder = {
    "listOfExternalConnectionsInBlockDiagram"
})
public class ExternalNameForResidue {

    @XmlElement(required = true)
    protected ListOfExternalConnectionsInBlockDiagram listOfExternalConnectionsInBlockDiagram;
    @XmlAttribute(name = "id", required = true)
    protected short id;
    @XmlAttribute(name = "offsetY", required = true)
    protected BigDecimal offsetY;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "nameOffsetX", required = true)
    protected BigDecimal nameOffsetX;
    @XmlAttribute(name = "nameOffsetY", required = true)
    protected BigDecimal nameOffsetY;
    @XmlAttribute(name = "protein")
    protected String protein;

    /**
     * Gets the value of the listOfExternalConnectionsInBlockDiagram property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfExternalConnectionsInBlockDiagram }
     *     
     */
    public ListOfExternalConnectionsInBlockDiagram getListOfExternalConnectionsInBlockDiagram() {
        return listOfExternalConnectionsInBlockDiagram;
    }

    /**
     * Sets the value of the listOfExternalConnectionsInBlockDiagram property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfExternalConnectionsInBlockDiagram }
     *     
     */
    public void setListOfExternalConnectionsInBlockDiagram(ListOfExternalConnectionsInBlockDiagram value) {
        this.listOfExternalConnectionsInBlockDiagram = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public short getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(short value) {
        this.id = value;
    }

    /**
     * Gets the value of the offsetY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetY() {
        return offsetY;
    }

    /**
     * Sets the value of the offsetY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffsetY(BigDecimal value) {
        this.offsetY = value;
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
     * Gets the value of the nameOffsetX property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNameOffsetX() {
        return nameOffsetX;
    }

    /**
     * Sets the value of the nameOffsetX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNameOffsetX(BigDecimal value) {
        this.nameOffsetX = value;
    }

    /**
     * Gets the value of the nameOffsetY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNameOffsetY() {
        return nameOffsetY;
    }

    /**
     * Sets the value of the nameOffsetY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNameOffsetY(BigDecimal value) {
        this.nameOffsetY = value;
    }

    /**
     * Gets the value of the protein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtein() {
        return protein;
    }

    /**
     * Sets the value of the protein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtein(String value) {
        this.protein = value;
    }

}
