package at.fhtw.interfaces;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Square(new Position(), 5);
        Shape s2 = new Square(new Position(), 10);
        Shape s3 = new Rectangle(new Position(), 2, 6);

        s1.display();
        s2.display();
        s3.display();

        if (s1 instanceof  Scalable) {
            ((Scalable) s1).scale(2);
        }
        if (s1 instanceof Moveable) {
            System.out.println("s1 is moveable");
        }
        if (s1 instanceof Transformable) {
            System.out.println("s1 is transformable");
        }
        if (s2 instanceof  Scalable) {
            ((Scalable) s2).scale(2);
        }
        if (s3 instanceof  Scalable) {
            ((Scalable) s3).scale(2);
        }

        System.out.println("*************************");

        s1.display();
        s2.display();
        s3.display();


    }
}
