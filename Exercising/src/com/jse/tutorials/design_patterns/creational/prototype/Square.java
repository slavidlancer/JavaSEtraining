package com.jse.tutorials.design_patterns.creational.prototype;

public class Square extends Shape {
    public Square() {
        this.type = "Square";
    }
    
    @Override
    void draw() {
        System.out.println("inside Square::draw() method");
    }
}
