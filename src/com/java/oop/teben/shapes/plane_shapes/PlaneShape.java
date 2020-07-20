package com.java.oop.teben.shapes.plane_shapes;

import com.java.oop.teben.interfaces.AreaMeasurable;
import com.java.oop.teben.interfaces.PerimeterMeasurable;
import com.java.oop.teben.points.Vertices2D;
import com.java.oop.teben.shapes.Shape;

import java.util.List;

public abstract class PlaneShape extends Shape<Vertices2D> implements PerimeterMeasurable, AreaMeasurable {
    public PlaneShape(List<Vertices2D> listOfVertices, String nameOfShape) {
        super(listOfVertices, nameOfShape);
    }

    public void addVertex(Vertices2D vertex) {
        this.listOfVertices.add(vertex);
    }

    public String getVertex() {
        String ver = "";
        int num = 1;
        for (Object point: listOfVertices) {
            ver += "(" +
                    "x" + num + " = " + ((Vertices2D) point).getX() +
                    ", y" + num + " = " + ((Vertices2D) point).getY() +
                    "), ";
            num++;
        }
        return ver;
    }

    @Override
    public String toString() {
        return "PlaneShape{" +
                "listOfVertices=" + listOfVertices +
                '}';
    }
}
