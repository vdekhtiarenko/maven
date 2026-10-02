package ru.vdekhtiarenko.geometry;

public record Rectangle(double width, double height) implements Shape2D {
    public Rectangle {
        if (!Double.isFinite(width) || !Double.isFinite(height) || width <= 0 || height <= 0)
            throw new IllegalArgumentException("Sides must be positive and finite");
    }

    @Override public double area() { return width * height; }
    @Override public double perimeter() { return 2 * (width + height); }
}
