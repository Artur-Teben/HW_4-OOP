package com.java.oop.teben.points;


public class Vertices2D extends Vertex {
    private final float y;
    private final float x;

    public Vertices2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    // AB = ((xB - xA)^2 + (yB - yA)^2)^(1/2)
    public float getDistance(Vertices2D pointA, Vertices2D pointB) {
        return (float) (Math.sqrt(Math.pow((pointA.x - pointB.x), 2) +
                Math.pow((pointA.y - pointB.y), 2)));
    }
}
