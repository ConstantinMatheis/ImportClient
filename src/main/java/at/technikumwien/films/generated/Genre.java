
package at.technikumwien.films.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genre.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="genre"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTION"/&gt;
 *     &lt;enumeration value="ANIMATION"/&gt;
 *     &lt;enumeration value="COMEDY"/&gt;
 *     &lt;enumeration value="DRAMA"/&gt;
 *     &lt;enumeration value="HORROR"/&gt;
 *     &lt;enumeration value="SCIENCE_FICTION"/&gt;
 *     &lt;enumeration value="THRILLER"/&gt;
 *     &lt;enumeration value="WESTERN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "genre")
@XmlEnum
public enum Genre {

    ACTION,
    ANIMATION,
    COMEDY,
    DRAMA,
    HORROR,
    SCIENCE_FICTION,
    THRILLER,
    WESTERN;

    public String value() {
        return name();
    }

    public static Genre fromValue(String v) {
        return valueOf(v);
    }

}
