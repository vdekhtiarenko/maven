package ru.vdekhtiarenko.geometry;

public record Triangle(double a, double b, double c) implements Shape2D {
    public Triangle {
        if (!Double.isFinite(a) || !Double.isFinite(b) || !Double.isFinite(c)
                || a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a)
            throw new IllegalArgumentException("Sides must form a valid triangle");
    }

    @Override public double area() {
        double semiPerimeter = perimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    @Override public double perimeter() { return a + b + c; }
}
