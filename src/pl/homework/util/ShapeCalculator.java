package pl.homework.util;

import pl.homework.lib.*;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    @Override
    public double circleArea(Circle circle) {
        return Math.PI* Math.pow(lineLength(new Line2D("", circle.getX1(), circle.getY1(),circle.getX2(), circle.getY2())),2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        double length = lineLength(new Line2D("", rectangle.getX1(), rectangle.getY1(),rectangle.getX2(), rectangle.getY2()));
        return rectangle.getSideB()*length;
    }

    @Override
    public double ballVolume(Ball ball) {
        return 4*Math.PI*Math.pow(ball.getSegment(), 3)/3;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getSegment(), 3);
    }
}
