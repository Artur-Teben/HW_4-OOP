package com.java.oop.teben.shapes.space_shapes;

import com.java.oop.teben.interfaces.AreaMeasurable;
import com.java.oop.teben.interfaces.VolumeMeasurable;
import com.java.oop.teben.points.Vertices3D;
import com.java.oop.teben.shapes.Shapes;

import java.util.List;

public abstract class SpaceShapes extends Shapes implements AreaMeasurable, VolumeMeasurable {
    public SpaceShapes(List<Vertices3D> listOfVertices, String nameOfShape) {
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

    // AB = ((xB - xA)^2 + (yB - yA)^2 + (zB - zA)^2)^(1/2)
    public float getDistance(Vertices3D pointA, Vertices3D pointB) {
        return (float) (Math.sqrt(Math.pow((pointA.getX() - pointB.getX()), 2) +
                Math.pow((pointA.getY() - pointB.getY()), 2) +
                Math.pow((pointA.getZ() - pointB.getZ()), 2)));
    }
}
