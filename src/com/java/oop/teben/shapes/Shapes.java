package com.java.oop.teben.shapes;

import java.util.List;

public abstract class Shapes<T> {
    protected List<T> listOfVertices;
    private final String nameOfShape;

    public Shapes(List<T> listOfVertices, String nameOfShape) {
        this.listOfVertices = listOfVertices;
        this.nameOfShape = nameOfShape;
    }

    public String getNameOfShape() {
        return nameOfShape;
    }
}
