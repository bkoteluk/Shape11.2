package pl.homework.lib;

public abstract class GeometricShape extends Shape2D {
    public GeometricShape() {
    }

    public GeometricShape(String name, double x1, double y1, double x2, double y2) {
        super(name, x1, y1, x2, y2);
    }
}
