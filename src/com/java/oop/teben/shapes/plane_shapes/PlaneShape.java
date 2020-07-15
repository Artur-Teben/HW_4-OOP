package com.java.oop.teben.Shapes.PlaneShapes;

import com.java.oop.teben.Interfaces.AreaMeasurable;
import com.java.oop.teben.Interfaces.PerimeterMeasurable;
import com.java.oop.teben.Points.Vertices_2D;
import com.java.oop.teben.Shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    private List<Vertices_2D> listOfVertics2D = new ArrayList<>();
}
