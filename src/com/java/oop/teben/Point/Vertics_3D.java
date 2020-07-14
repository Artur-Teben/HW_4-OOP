package com.java.oop.teben.Point;

public class Vertics_3D extends Vertics_2D {
    private double z;

    public Vertics_3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    // AB = ((xB - xA)^2 + (yB - yA)^2 + (zB - zA)^2)^(1/2)
    public double getDistance(Vertics_3D pointB) {
        return Math.sqrt(Math.pow((this.getX() - pointB.getX()), 2) +
                Math.pow((this.getY() - pointB.getY()), 2) +
                Math.pow((this.getZ() - pointB.getZ()), 2));
    }

    @Override
    public String toString() {
        return "Vertics_3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" + z +
                '}';
    }
}
