package com.java.oop.teben.shapes.space_shapes;

import com.java.oop.teben.interfaces.AreaMeasurable;
import com.java.oop.teben.interfaces.VolumeMeasurable;
import com.java.oop.teben.points.Vertices3D;
import com.java.oop.teben.shapes.Shape;

import java.util.List;

public abstract class SpaceShape extends Shape<Vertices3D> implements AreaMeasurable, VolumeMeasurable {
    public SpaceShape(List<Vertices3D> listOfVertices, String nameOfShape) {
        super(listOfVertices, nameOfShape);
    }

    public void addVertex(Vertices3D vertex) {
        this.listOfVertices.add(vertex);
    }

    public String getVertex() {
        String ver = "";
        int num = 1;
        for (Object point: listOfVertices) {
            ver += "(" +
                    "x" + num + " = " + ((Vertices3D) point).getX() +
                    ", y" + num + " = " + ((Vertices3D) point).getY() +
                    ", z" + num + " = " + ((Vertices3D) point).getZ() +
                    "), ";
            num++;
        }
        return ver;
    }

    @Override
    public String toString() {
        return "SpaceShape{" +
                "listOfVertices=" + listOfVertices +
                '}';
    }
}
