package at.technikumwien.films;

import at.technikumwien.films.generated.Actor;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.util.List;

// TODO: 12/4/17 args: studio oder actor
public class ActorsResourceClient {
    public static void main(String[] args) {

        WebTarget target = ClientBuilder
                .newClient()
                .target("http://localhost:8080/Filmverwaltung/resources/actors");

        List<Actor> actors = target
                .request(MediaType.APPLICATION_JSON) // .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Actor>>() {});
        for(Actor actor:actors) {
            System.out.println(actor.getFirstName() + " " + actor.getLastName());
        }
    }
}
