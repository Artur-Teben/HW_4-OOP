package com.java.oop.teben.shapes.plane_shapes;

import com.java.oop.teben.interfaces.AreaMeasurable;
import com.java.oop.teben.interfaces.PerimeterMeasurable;
import com.java.oop.teben.points.Vertices2D;
import com.java.oop.teben.shapes.Shapes;

import java.util.List;

public abstract class PlaneShapes extends Shapes implements PerimeterMeasurable, AreaMeasurable {
    public PlaneShapes(List<Vertices2D> listOfVertices, String nameOfShape) {
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

    // AB = ((xB - xA)^2 + (yB - yA)^2)^(1/2)
    public float getDistance(Vertices2D pointA, Vertices2D pointB) {
        return (float) (Math.sqrt(Math.pow((pointA.getX() - pointB.getX()), 2) +
                Math.pow((pointA.getY() - pointB.getY()), 2)));
    }


}
