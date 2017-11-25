
package at.technikumwien.films.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for film complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="film"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pk_film_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="actors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="actor" type="{http://webservice/}actor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="studio" type="{http://webservice/}studio" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="release_year" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="running_time" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="budget" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="genre" type="{http://webservice/}genre" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "film", propOrder = {
    "pkFilmId",
    "actors",
    "studio"
})
public class Film {

    @XmlElement(name = "pk_film_id")
    protected Long pkFilmId;
    protected Film.Actors actors;
    protected Studio studio;
    @XmlAttribute(name = "release_year")
    protected Integer releaseYear;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "running_time")
    protected Integer runningTime;
    @XmlAttribute(name = "language")
    protected String language;
    @XmlAttribute(name = "budget")
    protected Double budget;
    @XmlAttribute(name = "genre")
    protected Genre genre;

    /**
     * Gets the value of the pkFilmId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPkFilmId() {
        return pkFilmId;
    }

    /**
     * Sets the value of the pkFilmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPkFilmId(Long value) {
        this.pkFilmId = value;
    }

    /**
     * Gets the value of the actors property.
     * 
     * @return
     *     possible object is
     *     {@link Film.Actors }
     *     
     */
    public Film.Actors getActors() {
        return actors;
    }

    /**
     * Sets the value of the actors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Film.Actors }
     *     
     */
    public void setActors(Film.Actors value) {
        this.actors = value;
    }

    /**
     * Gets the value of the studio property.
     * 
     * @return
     *     possible object is
     *     {@link Studio }
     *     
     */
    public Studio getStudio() {
        return studio;
    }

    /**
     * Sets the value of the studio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Studio }
     *     
     */
    public void setStudio(Studio value) {
        this.studio = value;
    }

    /**
     * Gets the value of the releaseYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReleaseYear() {
        return releaseYear;
    }

    /**
     * Sets the value of the releaseYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReleaseYear(Integer value) {
        this.releaseYear = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the runningTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRunningTime() {
        return runningTime;
    }

    /**
     * Sets the value of the runningTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRunningTime(Integer value) {
        this.runningTime = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBudget(Double value) {
        this.budget = value;
    }

    /**
     * Gets the value of the genre property.
     * 
     * @return
     *     possible object is
     *     {@link Genre }
     *     
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Sets the value of the genre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Genre }
     *     
     */
    public void setGenre(Genre value) {
        this.genre = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected         content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="actor" type="{http://webservice/}actor" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "actor"
    })
    public static class Actors {

        protected List<Actor> actor;

        /**
         * Gets the value of the actor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Actor }
         * 
         * 
         */
        public List<Actor> getActor() {
            if (actor == null) {
                actor = new ArrayList<Actor>();
            }
            return this.actor;
        }

    }

}
