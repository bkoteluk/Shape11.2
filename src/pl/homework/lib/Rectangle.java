package pl.homework.lib;

import static pl.homework.util.LineCalc.lineLength;

public class Rectangle extends GeometricShape{
    private double sideB;

    public Rectangle() {
    }

    public Rectangle(String name, double x1, double y1, double x2, double y2, double sideB) {
        super(name, x1, y1, x2, y2);
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideA() {
        return lineLength(new Line2D("", getX1(), getY1(), getX2(), getY2()));
    }

}
