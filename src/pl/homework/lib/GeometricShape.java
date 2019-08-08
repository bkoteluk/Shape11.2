package pl.homework.lib;

public abstract class GeometricShape extends Shape2D {

    public GeometricShape() {
    }

    public GeometricShape(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}
