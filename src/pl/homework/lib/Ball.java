package pl.homework.lib;

public class Ball extends Shape3D {
    private double radius;

    public Ball() {
    }

    public Ball(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + " o długości promienia " + radius + " ma ";
    }
}
