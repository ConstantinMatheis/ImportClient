
package at.technikumwien.films.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.technikumwien.films.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Actor_QNAME = new QName("http://webservice/", "actor");
    private final static QName _Film_QNAME = new QName("http://webservice/", "film");
    private final static QName _GetAllFilms_QNAME = new QName("http://webservice/", "getAllFilms");
    private final static QName _GetAllFilmsResponse_QNAME = new QName("http://webservice/", "getAllFilmsResponse");
    private final static QName _GetFilmsByName_QNAME = new QName("http://webservice/", "getFilmsByName");
    private final static QName _GetFilmsByNameResponse_QNAME = new QName("http://webservice/", "getFilmsByNameResponse");
    private final static QName _ImportFilms_QNAME = new QName("http://webservice/", "importFilms");
    private final static QName _ImportFilmsResponse_QNAME = new QName("http://webservice/", "importFilmsResponse");
    private final static QName _Studio_QNAME = new QName("http://webservice/", "studio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.technikumwien.films.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Film }
     * 
     */
    public Film createFilm() {
        return new Film();
    }

    /**
     * Create an instance of {@link Actor }
     * 
     */
    public Actor createActor() {
        return new Actor();
    }

    /**
     * Create an instance of {@link GetAllFilms }
     * 
     */
    public GetAllFilms createGetAllFilms() {
        return new GetAllFilms();
    }

    /**
     * Create an instance of {@link GetAllFilmsResponse }
     * 
     */
    public GetAllFilmsResponse createGetAllFilmsResponse() {
        return new GetAllFilmsResponse();
    }

    /**
     * Create an instance of {@link GetFilmsByName }
     * 
     */
    public GetFilmsByName createGetFilmsByName() {
        return new GetFilmsByName();
    }

    /**
     * Create an instance of {@link GetFilmsByNameResponse }
     * 
     */
    public GetFilmsByNameResponse createGetFilmsByNameResponse() {
        return new GetFilmsByNameResponse();
    }

    /**
     * Create an instance of {@link ImportFilms }
     * 
     */
    public ImportFilms createImportFilms() {
        return new ImportFilms();
    }

    /**
     * Create an instance of {@link ImportFilmsResponse }
     * 
     */
    public ImportFilmsResponse createImportFilmsResponse() {
        return new ImportFilmsResponse();
    }

    /**
     * Create an instance of {@link Studio }
     * 
     */
    public Studio createStudio() {
        return new Studio();
    }

    /**
     * Create an instance of {@link Film.Actors }
     * 
     */
    public Film.Actors createFilmActors() {
        return new Film.Actors();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Actor }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "actor")
    public JAXBElement<Actor> createActor(Actor value) {
        return new JAXBElement<Actor>(_Actor_QNAME, Actor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Film }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Film }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "film")
    public JAXBElement<Film> createFilm(Film value) {
        return new JAXBElement<Film>(_Film_QNAME, Film.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFilms }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllFilms }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getAllFilms")
    public JAXBElement<GetAllFilms> createGetAllFilms(GetAllFilms value) {
        return new JAXBElement<GetAllFilms>(_GetAllFilms_QNAME, GetAllFilms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFilmsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllFilmsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getAllFilmsResponse")
    public JAXBElement<GetAllFilmsResponse> createGetAllFilmsResponse(GetAllFilmsResponse value) {
        return new JAXBElement<GetAllFilmsResponse>(_GetAllFilmsResponse_QNAME, GetAllFilmsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilmsByName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFilmsByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getFilmsByName")
    public JAXBElement<GetFilmsByName> createGetFilmsByName(GetFilmsByName value) {
        return new JAXBElement<GetFilmsByName>(_GetFilmsByName_QNAME, GetFilmsByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilmsByNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFilmsByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getFilmsByNameResponse")
    public JAXBElement<GetFilmsByNameResponse> createGetFilmsByNameResponse(GetFilmsByNameResponse value) {
        return new JAXBElement<GetFilmsByNameResponse>(_GetFilmsByNameResponse_QNAME, GetFilmsByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportFilms }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportFilms }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "importFilms")
    public JAXBElement<ImportFilms> createImportFilms(ImportFilms value) {
        return new JAXBElement<ImportFilms>(_ImportFilms_QNAME, ImportFilms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportFilmsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportFilmsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "importFilmsResponse")
    public JAXBElement<ImportFilmsResponse> createImportFilmsResponse(ImportFilmsResponse value) {
        return new JAXBElement<ImportFilmsResponse>(_ImportFilmsResponse_QNAME, ImportFilmsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Studio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Studio }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "studio")
    public JAXBElement<Studio> createStudio(Studio value) {
        return new JAXBElement<Studio>(_Studio_QNAME, Studio.class, null, value);
    }

}
