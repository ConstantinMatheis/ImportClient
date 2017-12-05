package at.technikumwien.films;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import at.technikumwien.films.model.*;
import java.util.Date;
import java.util.Locale;

public class ActorsResourceClient {

    public static void main(String[] args) {
        printUsage();
        if(args.length != 4) {
            printError("at least 4 arguments required!");
            return;
        }

        WebTarget target = ClientBuilder
                .newClient()
                .target("http://localhost:8080/Filmverwaltung/resources/actors");

        System.out.println("Actors BEFORE insert:");
        printAllActors(target);

        Actor.Gender gender = parseGenderString(args[2]);
        Date birthday = parseBirthdayString(args[3]);

        Response response = target
                .request()
                .post(Entity.json(new Actor(args[0], args[1], gender, birthday)));

        System.out.println("URI of inserted actor: " + response.getLocation());
        System.out.println("Actors AFTER insert:");
        printAllActors(target);
    }



    private static void printUsage() {
        System.out.println("Input format: first_name last_name birthday(YYYY-MM-DD) gender(MALE/FEMALE)");
    }

    private static void printError(String errorMessage) {
        System.out.println("Wrong input format:" + errorMessage);
        printUsage();
    }

    private static void printAllActors(WebTarget target) {
        List<Actor> actors = target
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Actor>>() {});
        actors.forEach(System.out::println);
    }

    private static Date parseBirthdayString(String birthdayString) {
        DateFormat format = new SimpleDateFormat("YYYY-MM-DD", Locale.ENGLISH);
        try {
            return format.parse(birthdayString);
        } catch (ParseException e) {
            System.out.println("cannot parse a date!");
            return null;
        }
    }

    private static Actor.Gender parseGenderString(String genderString) {
        Actor.Gender gender = null;
        switch (genderString) {
            case "MALE":
                gender = Actor.Gender.MALE;
                break;
            case "FEMALE":
                gender = Actor.Gender.FEMALE;
                break;
            default:
                printError("format for gender: MALE or FEMALE");
                break;
        }
        return gender;
    }

}
