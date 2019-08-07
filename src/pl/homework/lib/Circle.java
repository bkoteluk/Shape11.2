package pl.homework.lib;

import static pl.homework.util.LineCalc.lineLength;

public class Circle extends GeometricShape {
    public Circle() {
    }

    public Circle(String name, double x1, double y1, double x2, double y2) {
        super(name, x1, y1, x2, y2);
    }

    public double radius() {
        return lineLength(new Line2D("", getX1(),getY1(),getX2(),getY2()));
    }
}
