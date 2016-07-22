package com.jse.tutorials.design_patterns.creational.factory;

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        Shape shape2 = shapeFactory.getShape("rectangle");
        Shape shape3 = shapeFactory.getShape("square");
        //Shape shape4 = shapeFactory.getShape("NaN");
        
        shape1.draw();
        shape2.draw();
        shape3.draw();
        //shape4.draw();
    }
}
