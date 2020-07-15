package com.java.oop.teben.shapes;

import java.util.List;

public abstract class Shape {
    protected List vertices;
    private final String nameOfShape;

    public Shape(List vertices, String nameOfShape) {
        this.vertices = vertices;
        this.nameOfShape = nameOfShape;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "nameOfShape=" + nameOfShape +
                ", vertices='" + vertices + '\'' +
                '}';
    }
}
