package com.java.oop.teben.shapes.space_shapes;

import com.java.oop.teben.points.Vertices3D;

import java.util.List;

public class SquarePyramid extends SpaceShapes{
    private final float widthOfSquarePyramid;
    private final float heightOfSquarePyramid;

    public SquarePyramid(Vertices3D vertex, String nameOfShape, float width, float height) {
        super(List.of(vertex), "SquarePyramid");
        this.widthOfSquarePyramid = width;
        this.heightOfSquarePyramid = height;
    }

    public float getWidthOfSquarePyramid() {
        return widthOfSquarePyramid;
    }

    public float getHeightOfSquarePyramid() {
        return heightOfSquarePyramid;
    }

    // S = a ^ 2 + 4 * (1/2) * a * h
    @Override
    public float getArea() {
        float a = this.getWidthOfSquarePyramid();
        float h = this.getHeightOfSquarePyramid();
        return (float) (Math.pow(a, 2) + 4 * (1 / 2) * a * h);
    }

    // V = 1/3 * S * h
    @Override
    public float getVolume() {
        float h = this.getHeightOfSquarePyramid();
        float a = this.getWidthOfSquarePyramid();
        return (float) ((1.0 / 3.0) * Math.pow(a, 2) * h);
    }

    @Override
    public String toString() {
        return "Square Pyramid: \n\t\t[\t" +
                "Width = " + this.getWidthOfSquarePyramid() +
                ", \n\t\t\tHeight = " + this.getHeightOfSquarePyramid() +
                ", \n\t\t\tArea = " + this.getArea() +
                ", \n\t\t\tVolume = " + this.getVolume() +
                "\t]";
    }
}
