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

    // AB = ((xB - xA)^2 + (yB - yA)^2 + (zB - zA)^2)^(1/2)
    public float getDistance(Vertices3D pointA, Vertices3D pointB) {
        return (float) (Math.sqrt(Math.pow((pointA.getX() - pointB.getX()), 2) +
                Math.pow((pointA.getY() - pointB.getY()), 2) +
                Math.pow((pointA.getZ() - pointB.getZ()), 2)));
    }
}
