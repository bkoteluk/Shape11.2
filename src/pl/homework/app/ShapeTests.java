package pl.homework.app;

import pl.homework.lib.*;
import pl.homework.util.ShapeCalculator;

import static pl.homework.util.LineCalc.lineLength;

public class ShapeTests {
    public static void main(String[] args) {
        ShapeCalculator sc = new ShapeCalculator();
        Shape[] shapes = new Shape[5];
        shapes[0] = new Line2D("Odcinek", -2, 3, 1, 7);
        shapes[1] = new Circle("Koło", 3, 4, 6, 7);
        shapes[2] = new Rectangle("Prostokąt", -2, 3, 1, 7, 6);
        shapes[3] = new Ball("Kula", 7);
        shapes[4] = new Cube("Szcześcian", 3);

        System.out.println(shapes[0].getName() + " wyznaczony przez współrzędne " + shapes[0] + " ma długość " + lineLength((Line2D)shapes[0]));
        System.out.println(shapes[1].getName() + " o długościach promienia " + ((Circle)shapes[1]).radius() + " ma ma pole, które wynosi " + sc.circleArea((Circle)shapes[1]));
        System.out.println(shapes[2].getName() + " o długościach boków " + ((Rectangle)shapes[2]).getSideA() + " " + ((Rectangle)shapes[2]).getSideB() + " ma pole, które wynosi " + sc.rectangleArea((Rectangle)shapes[2]));
        System.out.println(shapes[3].getName() + " o długości promienia " + ((Ball)shapes[3]).radius() + " ma objętość, która wynosi " + sc.ballVolume((Ball)shapes[3]));
        System.out.println(shapes[4].getName() + " o długości boku " + ((Cube)shapes[4]).getSegment() + " ma objętość, która wynosi " + sc.cubeVolume((Cube)shapes[4]));
    }
}
