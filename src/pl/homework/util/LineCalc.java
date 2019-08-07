package pl.homework.util;

import pl.homework.lib.Line2D;

public class LineCalc {

    public static  double lineLength(Line2D line) {
        return Math.sqrt(Math.pow(Math.abs(line.getX1() -line.getX2()),2) + Math.pow(Math.abs(line.getY1() - line.getY2()),2));
    }
}
