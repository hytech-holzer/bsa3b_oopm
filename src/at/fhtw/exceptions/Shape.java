package at.fhtw.exceptions;

public abstract class Shape {
    protected Position center;

    public Shape() {
        this(new Position());
    }

    public Shape(Position center) {
        setCenter(center);
    }

    public void setCenter(Position center) {
        if (center != null) {
            this.center = new Position(center);
        }
    }

    public Position getCenter() {
        return new Position(center);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public void move(double dx, double dy) {
        center.shift(dx, dy);
    }

    public void display() {
        System.out.printf("center = (%.1f, %.1f)%n", center.getX(), center.getY());
    }
}