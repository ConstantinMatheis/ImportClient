package at.technikumwien.films.model;

import java.util.Date;

public class Actor {

    private Long pk_actor_id;
    private String firstname;
    private String lastname;
    private Date birthdate;
    private Sex sex;
//    private Set<Film> films = new HashSet<Film>(0);

    public Actor() {
    }

    public Actor(String first_name, String last_name, Sex sex, Date birthday) {
        this.firstname = first_name;
        this.lastname = last_name;
        this.sex = sex;
        this.birthdate = birthday;
    }

    public Long getPk_actor_id() {
        return pk_actor_id;
    }

    public void setPk_actor_id(Long pk_actor_id) {
        this.pk_actor_id = pk_actor_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

//    public Set<Film> getFilms() {
//        return films;
//    }
//
//    public void setFilms(Set<Film> films) {
//        this.films = films;
//    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public enum Sex {
        MALE,
        FEMALE
    }

    @Override
    public String toString() {
        return getPk_actor_id() + ". " + getFirstname() + " " + getLastname() + " " +
                getSex() + " " + getBirthdate();
    }
}
