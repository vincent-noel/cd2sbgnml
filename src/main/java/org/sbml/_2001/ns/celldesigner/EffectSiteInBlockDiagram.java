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
import javax.xml.bind.annotation.XmlType;


/**
 * Effect site on the lower side of a block(protein).
 * 
 * <p>Java class for effectSiteInBlockDiagram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="effectSiteInBlockDiagram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="effectInBlockDiagram" type="{http://www.sbml.org/2001/ns/celldesigner}effectInBlockDiagram" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="offsetX" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
 *       &lt;attribute name="reaction" type="{http://www.sbml.org/2001/ns/celldesigner}SId" />
 *       &lt;attribute name="species" type="{http://www.sbml.org/2001/ns/celldesigner}SId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "effectSiteInBlockDiagram", propOrder = {
    "effectInBlockDiagram"
})
public class EffectSiteInBlockDiagram {

    protected EffectInBlockDiagram effectInBlockDiagram;
    @XmlAttribute(name = "id", required = true)
    protected short id;
    @XmlAttribute(name = "offsetX", required = true)
    protected BigDecimal offsetX;
    @XmlAttribute(name = "offsetY", required = true)
    protected BigDecimal offsetY;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "nameOffsetX", required = true)
    protected BigDecimal nameOffsetX;
    @XmlAttribute(name = "nameOffsetY", required = true)
    protected BigDecimal nameOffsetY;
    @XmlAttribute(name = "reaction")
    protected String reaction;
    @XmlAttribute(name = "species")
    protected String species;

    /**
     * Gets the value of the effectInBlockDiagram property.
     * 
     * @return
     *     possible object is
     *     {@link EffectInBlockDiagram }
     *     
     */
    public EffectInBlockDiagram getEffectInBlockDiagram() {
        return effectInBlockDiagram;
    }

    /**
     * Sets the value of the effectInBlockDiagram property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectInBlockDiagram }
     *     
     */
    public void setEffectInBlockDiagram(EffectInBlockDiagram value) {
        this.effectInBlockDiagram = value;
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
     * Gets the value of the offsetX property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetX() {
        return offsetX;
    }

    /**
     * Sets the value of the offsetX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffsetX(BigDecimal value) {
        this.offsetX = value;
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
     * Gets the value of the reaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReaction() {
        return reaction;
    }

    /**
     * Sets the value of the reaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReaction(String value) {
        this.reaction = value;
    }

    /**
     * Gets the value of the species property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecies(String value) {
        this.species = value;
    }

}
