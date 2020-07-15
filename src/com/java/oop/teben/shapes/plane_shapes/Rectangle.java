package com.java.oop.teben.shapes.plane_shapes;

import com.java.oop.teben.points.Vertices2D;

import java.util.List;

public class Rectangle extends PlaneShapes {
    private final float width;
    private final float height;

    public Rectangle(Vertices2D vertex, String nameOfShape, float width, float height) {
        super(List.of(vertex), "Rectangle");
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    // S = a * b
    @Override
    public float getArea() {
        return width * height;
    }

    // P = (a + b) * 2
    @Override
    public float getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: \n\t\t[\t" +
                "Width = " + this.getWidth() +
                ", \n\t\t\tHeight = " + this.getHeight() +
                ", \n\t\t\tArea = " + this.getArea() +
                ", \n\t\t\tPerimeter = " + this.getPerimeter() +
                "\t]";
    }
}
