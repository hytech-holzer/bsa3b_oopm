package at.fhtw.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Collection<Shape> shapes = new ArrayList<>();
        shapes.add(createSquare(5));
        shapes.add(createSquare(10));
        shapes.add(createRectangle(2, 6));

        // display
        shapes.stream().forEach(Shape::display);
//        for (Shape s : shapes) {
//            s.display();
//        }

        // scale
        scale(shapes, 2);

        System.out.println("**************************");

        // display
        shapes.stream().forEach(Shape::display);
//        for (Shape s : shapes) {
//            s.display();
//        }

        System.out.println("**************************");
        double minArea = 30;
        System.out.printf("shapes with area more then %f:\n", minArea);
        getShapesGreaterThenAreaOf(shapes, minArea).forEach(Shape::display);


    }

    private static void scale(Collection<Shape> shapes, double factor) {
        shapes.stream().filter(s -> s instanceof Scalable)
                .forEach(s -> ((Scalable) s).scale(factor));
//        for (Shape s : shapes) {
//            if (s instanceof Scalable) {
//                ((Scalable) s).scale(factor);
//            }
//        }
    }

    private static Collection<Shape> getShapesGreaterThenAreaOf(Collection<Shape> shapes, double minArea) {
        return shapes.stream()
                .filter(s -> s.getArea() > minArea)
                .sorted(Comparator.comparing(Shape::getArea).reversed())
                .collect(Collectors.toList());
    }

    private static Collection<Shape> getShapesGreaterThenAreaOf_OldStyle(Collection<Shape> shapes, double minArea) {
        Collection<Shape> selectedShapes = new ArrayList<>();
        for (Shape s : shapes) {
            if (s.getArea() > minArea) {
                selectedShapes.add(s);
            }
        }
        return selectedShapes;
    }

    private static Shape createSquare(double width) {
        return new Square(new Position(), width);
    }

    private static Shape createRectangle(double width, double length) {
        return new Rectangle(new Position(), width, length);
    }

}
