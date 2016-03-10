package com.jse.fundamentals.oop;

import java.util.ArrayList;
import java.util.List;
import com.jse.fundamentals.oop.items.Circle;
import com.jse.fundamentals.oop.items.Cuboid;
import com.jse.fundamentals.oop.items.Rectangle;
import com.jse.fundamentals.oop.items.Sphere;
import com.jse.fundamentals.oop.items.SquarePyramid;
import com.jse.fundamentals.oop.items.Triangle;
import com.jse.fundamentals.oop.models.PlaneShape;
import com.jse.fundamentals.oop.models.Shape;
import com.jse.fundamentals.oop.models.SpaceShape;
import com.jse.fundamentals.oop.models.Vertex2D;
import com.jse.fundamentals.oop.models.Vertex3D;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        
        shapes.add(new Triangle(new Vertex2D(15, 15), new Vertex2D(30, 30),
                new Vertex2D(50, 25)));
        shapes.add(new Sphere(new Vertex3D(5, 8, 19.90), 18.20));
        shapes.add(new Rectangle(new Vertex2D(18.25, 15.30), 18.90, 77.98));
        shapes.add(new Circle(new Vertex2D(16, 18), 3.33));
        shapes.add(new SquarePyramid(new Vertex3D(1, 2, 3), 1, 5));
        shapes.add(new Cuboid(new Vertex3D(5, 8, 7), 3, 5, 8));
        
        System.out.print("all shapes:\n");
        shapes.stream().
            forEach(System.out::println);
        
        System.out.println("\nshapes with volume >= 40:");
        shapes.stream().
            filter(shape -> shape instanceof SpaceShape).
            map(shape1 -> (SpaceShape) shape1).
            filter(spaceShape -> spaceShape.getVolume() >= 40d).
            forEach(System.out::println);
        
        System.out.println("\nall plane shapes, ordered by perimeter, "
                + "ascending:");
        shapes.stream().
            filter(shape -> shape instanceof PlaneShape).
            map(shape1 -> (PlaneShape) shape1).
            sorted((shape1, shape2) -> Double.compare(shape1.getPerimeter(),
                    shape2.getPerimeter())).
            forEach(System.out::println);
    }
}
