package at.technikumwien.films.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Actor {

    private Long pk_actor_id;
    private String first_name;
    private String last_name;
    private Date birthday;
    private Gender gender;
//    private Set<Film> films = new HashSet<Film>(0);

    public Actor() {
    }

    public Actor(String first_name, String last_name, Gender gender, Date birthday) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Long getPk_actor_id() {
        return pk_actor_id;
    }

    public void setPk_actor_id(Long pk_actor_id) {
        this.pk_actor_id = pk_actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

//    public Set<Film> getFilms() {
//        return films;
//    }
//
//    public void setFilms(Set<Film> films) {
//        this.films = films;
//    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public enum Gender {
        MALE,
        FEMALE
    }

    @Override
    public String toString() {
        return getPk_actor_id() + ". " + getFirst_name() + " " + getLast_name() + " " +
                getGender() + " " + getBirthday();
    }
}
