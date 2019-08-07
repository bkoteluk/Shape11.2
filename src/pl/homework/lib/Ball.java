package pl.homework.lib;

public class Ball extends Shape3D {
    public Ball() {
    }

    public Ball(String name, double segment) {
        super(name, segment);
    }

    public double radius() {
        return getSegment();
    }

}
