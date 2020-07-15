package com.java.oop.teben.points;

public class Vertices3D extends Vertices2D {
    private final float z;

    public Vertices3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Vertics3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" + z +
                '}';
    }
}
