package com.java.oop.teben.shapes.space_shapes;

import com.java.oop.teben.interfaces.AreaMeasurable;
import com.java.oop.teben.interfaces.VolumeMeasurable;
import com.java.oop.teben.shapes.plane_shapes.PlaneShape;

import java.util.List;

public abstract class SpaceShapes extends PlaneShape implements AreaMeasurable, VolumeMeasurable {
    public SpaceShapes(List vertices, String nameOfShape) {
        super(vertices, nameOfShape);
    }
}
