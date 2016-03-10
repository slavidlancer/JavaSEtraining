package com.jse.fundamentals.oop.items;

import com.jse.fundamentals.oop.interfaces.AreaMeasurable;
import com.jse.fundamentals.oop.interfaces.VolumeMeasurable;
import com.jse.fundamentals.oop.models.SpaceShape;
import com.jse.fundamentals.oop.models.Vertex3D;

public class Cuboid extends SpaceShape
        implements AreaMeasurable, VolumeMeasurable {
    private double width;
    private double height;
    private double depth;
    
    public Cuboid(Vertex3D vertex, double width, double height, double depth) {
        super(vertex);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
    
    @Override
    public double getVolume() {
        return this.height * this.width * this.depth;
    }

    @Override
    public double getArea() {
        return (this.height * this.width * 2) + (this.height * this.depth * 2) +
                (this.width * this.depth * 2);
    }
    
    @Override
    public String toString() {
        return String.format("Cuboid {width=%.2f, height=%.2f, depth=%.2f, "
                + "volume=%.2f, area=%.2f, vertices=%s", this.width,
                this.height, this.depth, this.getVolume(), this.getArea(),
                this.getVertices());
    }
}
