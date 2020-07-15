package com.java.oop.teben.points;

public class Vertices {
    private double x;

    public Vertices(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Vertic{" +
                "x=" + x +
                '}';
    }
}