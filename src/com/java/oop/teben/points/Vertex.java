package com.java.oop.teben.points;

public abstract class Vertex {
    private final float x;

    public Vertex(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }
}