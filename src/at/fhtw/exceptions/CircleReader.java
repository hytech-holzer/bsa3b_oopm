package at.fhtw.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CircleReader {

    public static List<Circle> loadCirclesFromCSVFile(String filename) throws CircleToLargeException  {
        List<Circle> circles = new LinkedList<>();

        try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
            CircleCSVParser parser = new CircleCSVParser();
            String line = in.readLine();
            if (line != null) {
                parser.parseHeader(line);
                while ((line = in.readLine()) != null) {
                    Circle c = parser.parse(line);
                    if (c.getRadius() > 15) {
                        throw new CircleToLargeException(line);
                    }
                    circles.add(c);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file kann nicht gefunden werden");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return circles;
    }
}
