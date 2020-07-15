package com.java.oop.teben.shapes.plane_shapes;

import com.java.oop.teben.interfaces.AreaMeasurable;
import com.java.oop.teben.interfaces.PerimeterMeasurable;
import com.java.oop.teben.points.Vertices2D;
import com.java.oop.teben.shapes.Shape;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    public PlaneShape(List vertices, String nameOfShape) {
        super(vertices, nameOfShape);
    }
}
