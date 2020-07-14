package com.java.oop.teben.Points;


public class Vertics_2D extends Vertic {
    private double y;

    public Vertics_2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    // AB = ((xB - xA)^2 + (yB - yA)^2)^(1/2)
    public double getDistance(Vertics_2D pointB) {
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
