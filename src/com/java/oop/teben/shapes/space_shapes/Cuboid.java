package com.java.oop.teben.shapes.space_shapes;

import com.java.oop.teben.points.Vertices3D;

import java.util.List;

public class Cuboid extends SpaceShapes {
    private final float widthOfCuboid;
    private final float heightOfCuboid;
    private final float depthOfCuboid;

    public Cuboid(Vertices3D vertex,
                  String nameOfShape,
                  float widthOfCuboid,
                  float heightOfCuboid,
                  float depthOfCuboid) {
        super(List.of(vertex), nameOfShape);
        this.widthOfCuboid = widthOfCuboid;
        this.heightOfCuboid = heightOfCuboid;
        this.depthOfCuboid = depthOfCuboid;
    }

    public float getWidthOfCuboid() {
        return widthOfCuboid;
    }

    public float getHeightOfCuboid() {
        return heightOfCuboid;
    }

    public float getDepthOfCuboid() {
        return depthOfCuboid;
    }

    // S = 2 * (a * b + a * c + b * c)
    @Override
    public float getArea() {
        float a = this.getWidthOfCuboid();
        float b = this.getHeightOfCuboid();
        float c = this.getDepthOfCuboid();
        return 2 * (a * b + a * c + b * c);
    }

    @Override
    public float getVolume() {
        return widthOfCuboid * heightOfCuboid * depthOfCuboid;
    }

    @Override
    public String toString() {
        return super.getNameOfShape() +
                ": \n\t\t[\t" +
                "Width = " + this.getWidthOfCuboid() +
                ", \n\t\t\tHeight = " + this.getHeightOfCuboid() +
                ", \n\t\t\tDepth = " + this.getDepthOfCuboid() +
                ", \n\t\t\tArea = " + this.getArea() +
                ", \n\t\t\tVolume = " + this.getVolume() +
                "\t]";
    }
}
