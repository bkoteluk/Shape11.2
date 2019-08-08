package pl.homework.lib;

public class Cube extends Shape3D {
    private double side;

    public Cube() {
    }

    public Cube(String name, double side) {
        setName(name);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return super.toString() + " o długości boku " + getSide() + " ma " ;
    }
}
