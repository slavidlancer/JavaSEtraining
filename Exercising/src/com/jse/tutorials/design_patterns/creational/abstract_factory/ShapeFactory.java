package com.jse.tutorials.design_patterns.creational.abstract_factory;

public class ShapeFactory extends AbstractFactory {
    static String CIRCLE = "CIRCLE";
    static String RECTANGLE = "RECTANGLE";
    static String SQUARE = "SQUARE";
    
    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        
        if (CIRCLE.equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if (RECTANGLE.equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if (SQUARE.equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
