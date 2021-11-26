package at.fhtw.interfaces;

public class Square extends Shape implements Transformable {
    private double width;

    public Square(Position center, double width) {
        super(center);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        if (width >= 0.0)
            this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public double getPerimeter() {
        return 4.0 * width;
    }

    @Override
    public void display() {
        System.out.printf("width = %.1f%n", width);
        super.display();
    }

    @Override
    public void scale(double scaleFactor) {
        setWidth(getWidth() * scaleFactor);
    }

    @Override
    public void rotate(double phi) {

    }
}