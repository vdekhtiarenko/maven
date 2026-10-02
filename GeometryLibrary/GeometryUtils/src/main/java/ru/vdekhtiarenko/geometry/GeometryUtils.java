package ru.vdekhtiarenko.geometry;

import java.util.Collection;

public final class GeometryUtils {
    private GeometryUtils() {}

    public static double squareCentimetersToSquareMeters(double squareCentimeters) {
        if (!Double.isFinite(squareCentimeters)) throw new IllegalArgumentException("Value must be finite");
        return squareCentimeters / 10_000;
    }

    public static Shape2D largestArea(Collection<? extends Shape2D> shapes) {
        return shapes.stream().max((left, right) -> Double.compare(left.area(), right.area()))
                .orElseThrow(() -> new IllegalArgumentException("At least one shape is required"));
    }
}
