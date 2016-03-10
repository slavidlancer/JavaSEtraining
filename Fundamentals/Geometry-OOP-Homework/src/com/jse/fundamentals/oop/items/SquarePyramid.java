package com.jse.fundamentals.oop.items;

import com.jse.fundamentals.oop.interfaces.AreaMeasurable;
import com.jse.fundamentals.oop.interfaces.VolumeMeasurable;
import com.jse.fundamentals.oop.models.SpaceShape;
import com.jse.fundamentals.oop.models.Vertex3D;

public class SquarePyramid extends SpaceShape
        implements AreaMeasurable, VolumeMeasurable {
    private double baseWidth;
    private double height;
    
    public SquarePyramid(Vertex3D vertex, double baseWidth, double height) {
        super(vertex);
        this.baseWidth = baseWidth;
        this.height = height;
    }
    
    public double getBaseWidth() {
        return baseWidth;
    }
    
    public double getHeight() {
        return height;
    }
    
    @Override
    public double getVolume() {
        return ((this.baseWidth * this.baseWidth) * (this.height / 3));
    }

    @Override
    public double getArea() {
        return ((this.baseWidth * this.baseWidth) + ((this.baseWidth * 2) *
                Math.sqrt(((this.baseWidth * this.baseWidth) / 4) +
                        (this.height * this.height))));
    }
    
    @Override
    public String toString() {
        return String.format("Square Pyramid {baseWidth=%.2f, height=%.2f, "
                + "volume=%.2f, area=%.2f, vertices=%s", this.baseWidth,
                this.height, this.getVolume(), this.getArea(),
                this.getVertices());
    }
}
