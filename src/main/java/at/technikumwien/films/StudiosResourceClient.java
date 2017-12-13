package at.technikumwien.films;

import at.technikumwien.films.model.Studio;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

public class StudiosResourceClient {
    public static void main(String[] args) {
        printUsage();
        if(args.length < 7) {
            printError("at least 7 arguments required!");
            return;
        }

        WebTarget target = ClientBuilder
                .newClient()
                .register(new RequestFilter(args[5],args[6]))
                .target("http://localhost:8080/Filmverwaltung/resources/studios");

        System.out.println("Studios BEFORE insert:");
        printAllStudios(target);

        Integer year = parseYear(args[3]);

        Response response = target
                .request()
                .post(Entity.json(new Studio(args[0], args[1], args[2], year, args[4])));

        System.out.println("URI of inserted studio: " + response.getLocation());
        System.out.println("Studios AFTER insert:");
        printAllStudios(target);
    }

    private static Integer parseYear(String yearString) {
        try {
            return Integer.parseInt(yearString);
        } catch (NumberFormatException e) {
            printError("Year must be an integer - YYYY!");
        }
        return null;
    }

    private static void printUsage() {
        System.out.println("Input format: headquarters country_code postcode founded_year name(can_be_several_words)");
    }

    private static void printError(String errorMessage) {
        System.out.println("Wrong input format:" + errorMessage);
        printUsage();
    }

    private static void printAllStudios(WebTarget target) {
        List<Studio> studios = target
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Studio>>() {});
        studios.forEach(System.out::println);
    }
}
