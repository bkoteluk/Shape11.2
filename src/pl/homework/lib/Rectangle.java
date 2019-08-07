package pl.homework.lib;

import static pl.homework.util.LineCalc.lineLength;

public class Rectangle extends GeometricShape{
    private double sideA;
    private double sideB;

    public Rectangle() {
    }

    public Rectangle(String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return super.toString() + " o dłogościach boków " + getSideA() + " " + getSideB() + " ma ";
    }
}
