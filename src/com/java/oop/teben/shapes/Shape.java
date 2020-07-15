package com.java.oop.teben.Shapes;

import com.java.oop.teben.Points.Vertices_2D;

import java.util.List;

public abstract class Shape {
    private List<Vertices_2D> listOfVertics;

    public Shape(List<Vertices> listOfVertics) {
        this.listOfVertics = listOfVertics;
    }

    public List<Vertices> getListOfVertics() {
        return listOfVertics;
    }

    public void setListOfVertics(List<Vertices> listOfVertics) {
        this.listOfVertics = listOfVertics;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "listOfVertics=" + listOfVertics +
                '}';
    }
}
