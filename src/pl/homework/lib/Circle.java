package pl.homework.lib;

import static pl.homework.util.LineCalc.lineLength;

public class Circle extends GeometricShape {
    private double radius;

    public Circle() {
    }

    public Circle(String name, double radius) {
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
