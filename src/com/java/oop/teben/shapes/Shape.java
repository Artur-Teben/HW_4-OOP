package com.java.oop.teben.shapes;

import java.util.List;

public abstract class Shape<Vertex> {
    protected final List<Vertex> listOfVertices;
    private final String nameOfShape;

    public Shape(List<Vertex> listOfVertices, String nameOfShape) {
        this.listOfVertices = listOfVertices;
        this.nameOfShape = nameOfShape;
    }

    public String getNameOfShape() {
        return nameOfShape;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "listOfVertices=" + listOfVertices +
                ", nameOfShape='" + nameOfShape + '\'' +
                '}';
    }
}
