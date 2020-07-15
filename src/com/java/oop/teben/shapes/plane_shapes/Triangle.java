package com.java.oop.teben.shapes.plane_shapes;

import com.java.oop.teben.points.Vertices2D;

import java.util.List;

public class Triangle extends PlaneShapes {
    private final float a;
    private final float b;
    private final float c;

    public Triangle(Vertices2D A, Vertices2D B, Vertices2D C) {
        super(List.of(A, B, C), "Triangle");
        this.a = getDistance(B, C);
        this.b = getDistance(A, C);
        this.c = getDistance(A, B);
    }

    // S = (1/4) * ((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c)) ^ (1/2)
    @Override
    public float getArea() {
        return (float) (0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c)));
    }

    // P = a + b + c
    @Override
    public float getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle: \n\t\t[\t" +
                "Coordinates: A, B, C: " + super.getVertex() +
                "\b\b,\n\t\t\ta = BC = " + a +
                ",\n\t\t\tb = AC = " + b +
                ",\n\t\t\tc = AB = " + c +
                ",\n\t\t\tArea = " + this.getArea() +
                ",\n\t\t\tPerimeter = " + this.getPerimeter() +
                "\t]";
    }
}
