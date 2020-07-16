package com.java.oop.teben;

import com.java.oop.teben.points.Vertices2D;
import com.java.oop.teben.points.Vertices3D;
import com.java.oop.teben.shapes.Shapes;
import com.java.oop.teben.shapes.plane_shapes.Circle;
import com.java.oop.teben.shapes.plane_shapes.Rectangle;
import com.java.oop.teben.shapes.plane_shapes.Triangle;
import com.java.oop.teben.shapes.space_shapes.Cuboid;
import com.java.oop.teben.shapes.space_shapes.Sphere;
import com.java.oop.teben.shapes.space_shapes.SquarePyramid;

import java.util.ArrayList;
import java.util.List;

public class Execute {
    public void showShapes() {
        Circle circle = new Circle(new Vertices2D(3, 4), "Circle", (float) 5.1);
        Rectangle rectangle = new Rectangle(new Vertices2D(0, 0), "Rectangle", 2, 8);
        Triangle triangle = new Triangle(
                new Vertices2D(0, 1),
                new Vertices2D(3, 5),
                new Vertices2D(6, 2), "Triangle");
        Cuboid cuboid = new Cuboid(new Vertices3D(0, 0, 0), "Cuboid", 3, 8, 6);
        Sphere sphere = new Sphere(new Vertices3D(10, 10, 10), "Sphere", 8);
        SquarePyramid pyramid = new SquarePyramid(
                new Vertices3D(10, 10, 0), "Square Pyramid", 3, 10);

        List<Shapes> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);
        shapes.add(cuboid);
        shapes.add(sphere);
        shapes.add(pyramid);

        for (Shapes list : shapes) {
            System.out.println(list);
        }
    }
}
