package pl.homework.app;

import pl.homework.lib.*;
import pl.homework.util.ShapeCalculator;

import static pl.homework.util.LineCalc.lineLength;

public class ShapeTests {
    public static void main(String[] args) {
        ShapeCalculator sc = new ShapeCalculator();
        Shape[] shapes = new Shape[5];
        shapes[0] = new Line2D("Odcinek", -2, 3, 1, 7);
        shapes[1] = new Circle("Koło", 7);
        shapes[2] = new Rectangle("Prostokąt", 3, 7);
        shapes[3] = new Ball("Kula", 7);
        shapes[4] = new Cube("Szcześcian", 4);


        System.out.println(shapes[0] + " długość " + lineLength((Line2D)shapes[0]));
        System.out.println(shapes[1] + " pole, które wynosi " + sc.circleArea((Circle)shapes[1]));
        System.out.println(shapes[2] + " pole, które wynosi " + sc.rectangleArea((Rectangle)shapes[2]));
        System.out.println(shapes[3] + " objętość, która wynosi " + sc.ballVolume((Ball)shapes[3]));
        System.out.println(shapes[4] + " objętość, która wynosi " + sc.cubeVolume((Cube)shapes[4]));

        System.out.println(" <<< >>>");

        for (Shape shape: shapes) {

            if (shape instanceof Line2D) {
                System.out.println(shape + "długość " + lineLength((Line2D)shape));
            } else if (shape instanceof Shape2D) {
                System.out.println(shape + "pole, które wynosi " + sc.shapeArea((GeometricShape)shape));
            } else {
                System.out.println(shape + "objętość, która wynosi " + sc.volume((Shape3D) shape));
            }
        }
    }
}
