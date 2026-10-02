package ru.vdekhtiarenko.geometry;

public record Cube(double side) implements Shape3D {
    public Cube {
        if (!Double.isFinite(side) || side <= 0) throw new IllegalArgumentException("Side must be positive and finite");
    }

    @Override public double surfaceArea() { return 6 * side * side; }
    @Override public double volume() { return side * side * side; }
}
