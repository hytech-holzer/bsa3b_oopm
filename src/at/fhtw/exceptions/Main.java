package at.fhtw.exceptions;

import java.util.List;

public class Main {

    public static void main(String[] args)  {
        try {
            List<Circle> circles = CircleReader.loadCirclesFromCSVFile("test.csv");
            circles.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Ein Radius im CSV-File ist zu groß: " + e.getMessage());
        }

        // demo: NullPointerException
        List<Circle> circlesNull = null;

        // do
        if (circlesNull == null) {
            System.out.println("die liste ist null");
        } else {
            circlesNull.add(new Circle(new Position(1.0, 2.0), 3.0));
        }

        // don't
        try {
            circlesNull.add(new Circle(new Position(1.0, 2.0), 3.0));
        } catch (NullPointerException e) {
            System.out.println("die liste ist null");
        }
    }

}
