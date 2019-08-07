package pl.homework.lib;

public class Line2D extends Shape2D {

    public Line2D() {
    }

    public Line2D(String name, double x1, double y1, double x2, double y2) {
        super(name, x1, y1, x2, y2);
    }

    @Override
    public String toString() {
        return "[" + getX1() + ", " + getY1() + "] [" + getX2() +", " + getY2() + "]";
    }
}
