//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.12 at 02:51:29 AM EEST 
//


package model.citeseer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for document element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="document">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="doi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="doicluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="authors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="venue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="citations" type="{}citations" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "doi",
    "doicluster",
    "title",
    "_abstract",
    "authors",
    "year",
    "venue",
    "citations"
})
@XmlRootElement(name = "document")
public class Document {

    protected String doi;
    protected String doicluster;
    protected String title;
    @XmlElement(name = "abstract")
    protected String _abstract;
    protected String authors;
    protected String year;
    protected String venue;
    protected Citations citations;

    /**
     * Gets the value of the doi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoi() {
        return doi;
    }

    /**
     * Sets the value of the doi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoi(String value) {
        this.doi = value;
    }

    /**
     * Gets the value of the doicluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoicluster() {
        return doicluster;
    }

    /**
     * Sets the value of the doicluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoicluster(String value) {
        this.doicluster = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstract(String value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthors(String value) {
        this.authors = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the venue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenue() {
        return venue;
    }

    /**
     * Sets the value of the venue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenue(String value) {
        this.venue = value;
    }

    /**
     * Gets the value of the citations property.
     * 
     * @return
     *     possible object is
     *     {@link Citations }
     *     
     */
    public Citations getCitations() {
        return citations;
    }

    /**
     * Sets the value of the citations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Citations }
     *     
     */
    public void setCitations(Citations value) {
        this.citations = value;
    }

}
