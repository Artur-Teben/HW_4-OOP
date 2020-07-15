package com.java.oop.teben.shapes.plane_shapes;

import com.java.oop.teben.points.Vertices2D;

import java.util.List;

public class Circle extends PlaneShapes {
    private final float radiusOfCircle;

    public Circle(Vertices2D center, String nameOfShape, float radiusOfCircle) {
        super(List.of(center), "Circle");
        this.radiusOfCircle = radiusOfCircle;
    }

    public float getRadiusOfCircle() {
        return radiusOfCircle;
    }

    // S = Pi * R ^ 2
    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(radiusOfCircle, 2));
    }

    // P = 2 * Pi * R
    @Override
    public float getPerimeter() {
        return 2 * (float) Math.PI * radiusOfCircle;
    }

    @Override
    public String toString() {
        return "Circle: \n\t\t[\t" +
                "Center of circle: " + super.getVertex() +
                ", \n\t\t\tRadius = " + this.getRadiusOfCircle() +
                ", \n\t\t\tArea = " + this.getArea() +
                ", \n\t\t\tLength = " + this.getPerimeter() +
                " \t]";
    }
}
