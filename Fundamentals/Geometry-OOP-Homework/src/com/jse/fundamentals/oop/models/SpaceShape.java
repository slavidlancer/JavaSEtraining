package com.jse.fundamentals.oop.models;

import com.jse.fundamentals.oop.interfaces.AreaMeasurable;
import com.jse.fundamentals.oop.interfaces.VolumeMeasurable;

public abstract class SpaceShape extends Shape
        implements AreaMeasurable, VolumeMeasurable {
    protected SpaceShape(Vertex3D... vertices) {
        super.addVertices(vertices);
    }
}
