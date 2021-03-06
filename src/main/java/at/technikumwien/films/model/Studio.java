package at.technikumwien.films.model;

public class Studio {

    private Long pk_studio_id;
    private String headquarters;
    private Integer founded_year;
    private String name;
    private String countrycode;
    private String postcode;
//    private Set<Film> films;

    public Studio() {
    }

    public Studio(String headquarters, String countrycode, String postcode, Integer founded_year, String name) {
        this.headquarters = headquarters;
        this.countrycode = countrycode;
        this.postcode = postcode;
        this.founded_year = founded_year;
        this.name = name;
    }

    public Long getPk_studio_id() {
        return pk_studio_id;
    }

    public void setPk_studio_id(Long pk_studio_id) {
        this.pk_studio_id = pk_studio_id;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public Integer getFounded_year() {
        return founded_year;
    }

    public void setFounded_year(Integer founded_year) {
        this.founded_year = founded_year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

//    public Set<Film> getFilms() {
//        return films;
//    }

//    public void setFilms(Set<Film> films) {
//        this.films = films;
//    }


    @Override
    public String toString() {
        return pk_studio_id + ". " + name + " " + headquarters + "(" + countrycode + ", "
                + postcode + "), " + "founded " + founded_year;
    }
}
