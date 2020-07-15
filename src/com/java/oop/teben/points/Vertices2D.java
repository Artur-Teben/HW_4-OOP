package com.java.oop.teben.points;


public class Vertices_2D extends Vertices {
    private double y;

    public Vertices_2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    // AB = ((xB - xA)^2 + (yB - yA)^2)^(1/2)
    public double getDistance(Vertices_2D pointB) {
        return Math.sqrt(Math.pow((this.getX() - pointB.getX()), 2) +
                Math.pow((this.getY() - pointB.getY()), 2));
    }

    @Override
    public String toString() {
        return "Vertics_2D{" +
                "x=" + super.getX() +
                ", y=" + y +
                '}';
    }
}
