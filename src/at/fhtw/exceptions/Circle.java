package at.fhtw.exceptions;

public class Circle extends Shape {
    private double radius;

    public Circle(Position center, double width) {
        super(center);
        setRadius(width);
    }

    public double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        if (radius >= 0.0)
            this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 4.0 * radius;
    }

    @Override
    public void display() {
        System.out.printf("radius = %.1f%n", radius);
        super.display();
    }

    @Override
    public String toString() {
        return String.format("Circe(center=%s, radius=%f", center.toString(), radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Circle other = (Circle) o;
        return other.center.equals(center) && other.radius == radius;
    }
}