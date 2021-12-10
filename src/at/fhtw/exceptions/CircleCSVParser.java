package at.fhtw.exceptions;

import java.util.IllegalFormatException;

public class CircleCSVParser{

    public void parseHeader(String headerLine){}

    public Circle parse(String line) throws IllegalFormatException {

        String[] tokens = line.split(",");
        Position p = new Position(Double.parseDouble(tokens[0]) , Double.parseDouble(tokens[1]));

        Circle c = new Circle(p, Double.parseDouble(tokens[2]));

        return c;


    }



}
