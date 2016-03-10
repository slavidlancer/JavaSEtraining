package com.jse.fundamentals.oop;

import java.util.ArrayList;
import java.util.List;
import com.jse.fundamentals.oop.items.Sphere;
import com.jse.fundamentals.oop.items.Triangle;
import com.jse.fundamentals.oop.models.Shape;
import com.jse.fundamentals.oop.models.Vertex2D;
import com.jse.fundamentals.oop.models.Vertex3D;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        
        shapes.add(new Triangle(new Vertex2D(15, 15), new Vertex2D(30, 30),
                new Vertex2D(50, 25)));
        shapes.add(new Sphere(new Vertex3D(5, 8, 19.90), 18.20));
        
        System.out.print("all shapes:\n");
        shapes.stream().
            forEach(System.out::println);
    }
}
