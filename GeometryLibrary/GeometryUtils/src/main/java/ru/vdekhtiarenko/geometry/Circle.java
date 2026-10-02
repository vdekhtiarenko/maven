package ru.vdekhtiarenko.geometry;

public record Circle(double radius) implements Shape2D {
    public Circle {
        if (!Double.isFinite(radius) || radius <= 0) throw new IllegalArgumentException("Radius must be positive and finite");
    }

    @Override public double area() { return Math.PI * radius * radius; }
    @Override public double perimeter() { return 2 * Math.PI * radius; }
}
