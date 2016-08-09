package com.jse.tutorials.design_patterns.structural.flyweight;

public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;
    
    public Circle(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getX() {
        return this.x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getRadius() {
        return this.radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + this.color + ", x : " +
                this.x + ", y :" + this.y + ", radius :" + this.radius + "]");
    }
}
