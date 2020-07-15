package com.java.oop.teben.shapes.plane_shapes;

import com.java.oop.teben.points.Vertices2D;

import java.util.List;

public class Circle extends PlaneShape{
    private final double radius;

    public Circle(Vertices2D vertex, String nameOfShape, double radius) {
        super(List.of(vertex), "Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius = " + radius +
                ", Area = " + this.getArea() +
                ", Length = " + this.getPerimeter() +
                '}';
    }
}
