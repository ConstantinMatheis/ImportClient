package at.technikumwien.films;

import at.technikumwien.films.generated.FilmWebServiceInterface;
import at.technikumwien.films.generated.FilmWebServiceService;

import java.io.*;

public class Client {

    public static void main(String[] args) {
        if(args.length < 3) {
            printUsage();
            return;
        }
        PasswordAuthenticator.install(args[1], args[2]);
        String xml = getXml(args[0]);
        FilmWebServiceInterface filmWebService = (new FilmWebServiceService()).getFilmWebServicePort();
        filmWebService.importFilms(xml);
    }

    private static String getXml(String xmlPath) {
        BufferedReader xmlReader;
        StringBuilder builder = new StringBuilder();
        try {
            xmlReader = new BufferedReader(new FileReader(xmlPath));
            String currentLine;
            while((currentLine = xmlReader.readLine()) != null) {
                builder.append(currentLine);
            }
        } catch (FileNotFoundException e) {
            printUsage();
            throw new RuntimeException("File not found");
        } catch (IOException e) {
            printUsage();
            throw new RuntimeException(e);
        }
        return builder.toString();
    }

    private static void printUsage() {
        System.err.println("Usage: [programName] [path to xml] [username] [password]");
    }
}
