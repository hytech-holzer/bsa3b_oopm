package at.fhtw.interfaces;

public abstract class Shape implements Moveable {
    protected Position center;

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

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    @Override
    public void move(double dx, double dy) {
        center.shift(dx, dy);
    }

    public void display() {
        System.out.printf("center = (%.1f, %.1f)%n", center.getX(), center.getY());
    }
}