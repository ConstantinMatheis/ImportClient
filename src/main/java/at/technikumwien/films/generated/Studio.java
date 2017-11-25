
package at.technikumwien.films.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for studio complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pk_studio_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="headquarters" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="founded_year" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="countrycode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studio", propOrder = {
    "pkStudioId"
})
public class Studio {

    @XmlElement(name = "pk_studio_id")
    protected Long pkStudioId;
    @XmlAttribute(name = "headquarters")
    protected String headquarters;
    @XmlAttribute(name = "founded_year")
    protected Integer foundedYear;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "countrycode")
    protected String countrycode;
    @XmlAttribute(name = "postcode")
    protected String postcode;

    /**
     * Gets the value of the pkStudioId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPkStudioId() {
        return pkStudioId;
    }

    /**
     * Sets the value of the pkStudioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPkStudioId(Long value) {
        this.pkStudioId = value;
    }

    /**
     * Gets the value of the headquarters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadquarters() {
        return headquarters;
    }

    /**
     * Sets the value of the headquarters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadquarters(String value) {
        this.headquarters = value;
    }

    /**
     * Gets the value of the foundedYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFoundedYear() {
        return foundedYear;
    }

    /**
     * Sets the value of the foundedYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFoundedYear(Integer value) {
        this.foundedYear = value;
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
     * Gets the value of the countrycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * Sets the value of the countrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrycode(String value) {
        this.countrycode = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

}
