package com.jse.fundamentals.oop.models;

public abstract class Vertex {
    private double x;
    private double y;
    private double z;
    
    protected Vertex(double x, double y, double z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public double getZ() {
        return this.z;
    }
}
