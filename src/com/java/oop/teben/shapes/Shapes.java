package com.java.oop.teben.shapes;

import java.util.List;

public abstract class Shapes {
    protected List listOfVertices;
    private final String nameOfShape;

    public Shapes(List listOfVertices, String nameOfShape) {
        this.listOfVertices = listOfVertices;
        this.nameOfShape = nameOfShape;
    }
}
