package pl.homework.util;

import pl.homework.lib.Circle;
import pl.homework.lib.Rectangle;
import pl.homework.lib.GeometricShape;

public interface Calc2D {
    double circleArea(Circle circle);
    double rectangleArea(Rectangle rectangle);
    double shapeArea(GeometricShape shape);

}
