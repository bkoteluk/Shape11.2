package pl.homework.lib;

public abstract class Shape3D extends Shape {
    public double segment;

    public Shape3D() {
    }

    public Shape3D(String name, double segment) {
        super(name);
        this.segment = segment;
    }

    public double getSegment() {
        return segment;
    }

    public void setSegment(double segment) {
        this.segment = segment;
    }
}
