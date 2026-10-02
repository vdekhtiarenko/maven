package ru.vdekhtiarenko.geometry;

public record Sphere(double radius) implements Shape3D {
    public Sphere {
        if (!Double.isFinite(radius) || radius <= 0) throw new IllegalArgumentException("Radius must be positive and finite");
    }

    @Override public double surfaceArea() { return 4 * Math.PI * radius * radius; }
    @Override public double volume() { return (4.0 / 3.0) * Math.PI * radius * radius * radius; }
}
