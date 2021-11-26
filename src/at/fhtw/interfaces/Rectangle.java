package at.fhtw.interfaces;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(Position center, double width, double length) {
        super(center);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    private void setWidth(double width) {
        if (width >= 0.0) {
            this.width = width;
        }
    }

    public void setLength(double length) {
        if (length >= 0.0) {
            this.length = length;
        }
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (2.0 * width) + (2.0 * length);
    }

    @Override
    public void display() {
        System.out.printf("width = %.1f, length = %.1f\n", width, length);
        super.display();
    }

    public void scale(double scaleFactor) {
        setWidth(getWidth() * scaleFactor);
        setLength(getLength() * scaleFactor);
    }
}