package com.java.oop.teben.shapes.space_shapes;

import com.java.oop.teben.points.Vertices3D;

import java.util.List;

public class Sphere extends SpaceShapes {
    private final float radiusOfSphere;

    public Sphere(Vertices3D center, String nameOfShape, float radiusOfSphere) {
        super(List.of(center), nameOfShape);
        this.radiusOfSphere = radiusOfSphere;
    }

    public float getRadiusOfSphere() {
        return radiusOfSphere;
    }

    // S = 4 * Pi * R ^ 2
    @Override
    public float getArea() {
        return (float) (4 * Math.PI * Math.pow(radiusOfSphere, 2));
    }

    // V = (4 / 3) * Pi * R ^ 2
    @Override
    public float getVolume() {
        return (float) ((4.0 / 3.0) * Math.PI * Math.pow(radiusOfSphere, 3));
    }

    @Override
    public String toString() {
        return super.getNameOfShape() +
                ": \n\t\t[\t" +
                "Center of sphere: " + super.getVertex() +
                ", \n\t\t\tRadius = " + this.getRadiusOfSphere() +
                ", \n\t\t\tArea = " + this.getArea() +
                ", \n\t\t\tVolume = " + this.getVolume() +
                " \t]";
    }
}
