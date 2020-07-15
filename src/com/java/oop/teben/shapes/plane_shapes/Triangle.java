package com.java.oop.teben.shapes.plane_shapes;

import com.java.oop.teben.points.Vertices2D;

import java.util.List;

public class Triangle extends PlaneShape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(Vertices2D A, Vertices2D B, Vertices2D C) {
        super(List.of(A, B, C), "Triangle");
        this.a = B.getDistance(C);
        this.b = A.getDistance(C);
        this.c = A.getDistance(B);
    }

    // S = (1/4) * ((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c)) ^ (1/2)
    @Override
    public double getArea() {
        return 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a = BC =" + a +
                ", b = AC =" + b +
                ", c = AB =" + c +
                ", Area =" + this.getArea() +
                ", Perimeter =" + this.getPerimeter() +
                '}';
    }
}
