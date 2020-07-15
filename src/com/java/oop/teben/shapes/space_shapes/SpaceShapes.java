package com.java.oop.teben.Shapes.SpaceShapes;

import com.java.oop.teben.Interfaces.AreaMeasurable;
import com.java.oop.teben.Interfaces.VolumeMeasurable;
import com.java.oop.teben.Points.Vertices_3D;
import com.java.oop.teben.Shapes.PlaneShapes.PlaneShape;

import java.util.ArrayList;
import java.util.List;

public abstract class SpaceShapes extends PlaneShape implements AreaMeasurable, VolumeMeasurable {
    private List<Vertices_3D> listOfVertics3D = new ArrayList<>();

}
