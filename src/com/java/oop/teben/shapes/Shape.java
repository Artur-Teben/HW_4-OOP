package com.java.oop.teben.shapes;

import java.util.List;

public abstract class Shapes<Vertex> {
    protected final List<Vertex> listOfVertices;
    private final String nameOfShape;

    public Shapes(List<Vertex> listOfVertices, String nameOfShape) {
        this.listOfVertices = listOfVertices;
        this.nameOfShape = nameOfShape;
    }

    public String getNameOfShape() {
        return nameOfShape;
    }
}
