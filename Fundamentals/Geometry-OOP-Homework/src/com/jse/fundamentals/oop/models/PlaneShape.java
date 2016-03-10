package com.jse.fundamentals.oop.models;

import com.jse.fundamentals.oop.interfaces.AreaMeasurable;
import com.jse.fundamentals.oop.interfaces.PerimeterMeasurable;

public abstract class PlaneShape extends Shape
        implements PerimeterMeasurable, AreaMeasurable {
    protected PlaneShape(Vertex2D... vertices) {
        super.addVertices(vertices);
    }
}
