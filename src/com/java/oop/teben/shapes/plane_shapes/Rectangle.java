package com.java.oop.teben.shapes.plane_shapes;

import com.java.oop.teben.points.Vertices2D;

import java.util.List;

public class Rectangle extends PlaneShape {

    private final double width;
    private final double height;

    public Rectangle(Vertices2D A, String nameOfShape, double width, double height) {
        super(List.of(A), "Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Width = " + width +
                ", Height = " + height +
                ", Area = " + this.getArea() +
                ", Perimeter = " + this.getPerimeter() +
                '}';
    }
}
