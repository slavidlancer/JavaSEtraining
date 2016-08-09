package com.jse.tutorials.design_patterns.creational.prototype;

public class Circle extends Shape {
    public Circle() {
        this.type = "Circle";
    }
    
    @Override
    void draw() {
        System.out.println("inside Circle::draw() method");
    }
}
