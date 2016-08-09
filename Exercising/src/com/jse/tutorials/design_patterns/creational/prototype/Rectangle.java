package com.jse.tutorials.design_patterns.creational.prototype;

public class Rectangle extends Shape {
    public Rectangle() {
        this.type = "Rectangle";
    }
    
    @Override
    void draw() {
        System.out.println("inside Rectangle::draw() method");
    }
}
