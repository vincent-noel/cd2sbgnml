//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.27 at 10:08:13 AM CEST 
//


package org.sbml.sbml.level2.version4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.sbml._2001.ns.celldesigner.CompartmentAnnotationType;


/**
 * Redefined compartment.
 * 
 * <p>Java class for Compartment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compartment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}Compartment">
 *       &lt;redefine>
 *         &lt;complexType name="Compartment">
 *           &lt;complexContent>
 *             &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *               &lt;attribute name="id" use="required" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;attribute name="spatialDimensions" default="3">
 *                 &lt;simpleType>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                     &lt;minInclusive value="0"/>
 *                     &lt;maxInclusive value="3"/>
 *                   &lt;/restriction>
 *                 &lt;/simpleType>
 *               &lt;/attribute>
 *               &lt;attribute name="units" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *               &lt;attribute name="outside" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *               &lt;attribute name="constant" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *             &lt;/extension>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;sequence>
 *         &lt;element name="annotation" type="{http://www.sbml.org/2001/ns/celldesigner}compartmentAnnotationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compartment", propOrder = {
    "annotation"
})
public class Compartment
    extends OriginalCompartment
{

    protected CompartmentAnnotationType annotation;

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link CompartmentAnnotationType }
     *     
     */
    public CompartmentAnnotationType getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompartmentAnnotationType }
     *     
     */
    public void setAnnotation(CompartmentAnnotationType value) {
        this.annotation = value;
    }

}
