package ru.vdekhtiarenko.app;

import java.util.List;
import ru.vdekhtiarenko.geometry.Circle;
import ru.vdekhtiarenko.geometry.Cube;
import ru.vdekhtiarenko.geometry.GeometryUtils;
import ru.vdekhtiarenko.geometry.Rectangle;
import ru.vdekhtiarenko.geometry.Shape2D;
import ru.vdekhtiarenko.geometry.Shape3D;
import ru.vdekhtiarenko.geometry.Sphere;
import ru.vdekhtiarenko.geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        List<Shape2D> flatShapes = List.of(new Circle(3), new Rectangle(4, 5), new Triangle(3, 4, 5));
        for (Shape2D shape : flatShapes) {
            System.out.printf("%s: area=%.2f, perimeter=%.2f%n", shape, shape.area(), shape.perimeter());
        }
        Shape2D largest = GeometryUtils.largestArea(flatShapes);
        System.out.printf("Largest area: %s (%.2f cm², %.6f m²)%n", largest, largest.area(),
                GeometryUtils.squareCentimetersToSquareMeters(largest.area()));

        List<Shape3D> solids = List.of(new Cube(3), new Sphere(2));
        for (Shape3D shape : solids) {
            System.out.printf("%s: surface area=%.2f, volume=%.2f%n", shape, shape.surfaceArea(), shape.volume());
        }
    }
}
