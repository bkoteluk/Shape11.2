package pl.homework.util;

import pl.homework.lib.Ball;
import pl.homework.lib.Cube;
import pl.homework.lib.Shape3D;

public interface Calc3D {
    double ballVolume(Ball ball);
    double cubeVolume(Cube cube);
    double volume(Shape3D shape);
}
