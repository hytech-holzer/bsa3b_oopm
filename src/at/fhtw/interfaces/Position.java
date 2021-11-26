package at.fhtw.interfaces;

public class Position {
    private double x;
    private double y;

    public Position() {
        this.x = 0;
        this.y = 0;
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

    public void shift(double dx, double dy) {
        x += dx;
        y += dy;
    }
}