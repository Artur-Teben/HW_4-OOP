package com.java.oop.teben.points;


public class Vertices2D extends Vertex {
    private final float y;

    public Vertices2D(float x, float y) {
        super(x);
        this.y = y;
    }

    public float getY() {
        return y;
    }
}
