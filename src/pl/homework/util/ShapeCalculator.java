package pl.homework.util;

import pl.homework.lib.*;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    @Override
    public double circleArea(Circle circle) {
        return Math.PI* Math.pow(circle.getRadius(),2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getSideA()*rectangle.getSideB();
    }

    @Override
    public double ballVolume(Ball ball) {
        return 4*Math.PI*Math.pow(ball.getRadius(), 3)/3;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getSide(), 3);
    }

    @Override
    public double volume(Shape3D shape) {
        return shape instanceof Ball ? ballVolume((Ball)shape) : cubeVolume((Cube)shape);
    }

    @Override
    public double shapeArea(GeometricShape shape) {
        return shape instanceof Circle ? circleArea((Circle)shape) : rectangleArea((Rectangle)shape);
    }
}
