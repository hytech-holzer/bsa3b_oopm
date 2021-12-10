package at.fhtw.exceptions;

public class Position {
    private double x;
    private double y;

    public Position() {
        this(0.0, 0.0);
    }

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position other) {
        x = other.x;
        y = other.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void shift(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return String.format("Position(x=%f, y=%f)", x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Position other = (Position) o;
        return other.x == x && other.y == y;
    }
}