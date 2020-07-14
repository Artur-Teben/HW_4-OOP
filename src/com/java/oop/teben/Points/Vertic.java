package com.java.oop.teben.Points;

public class Vertic {
    private double x;

    public Vertic(double x) {
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