package com.jse.tutorials.design_patterns.creational.abstract_factory;

public class ColorFactory extends AbstractFactory {
    static String RED = "RED";
    static String BLUE = "BLUE";
    static String GREEN = "GREEN";
    
    @Override
    Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        
        if (RED.equalsIgnoreCase(colorType)) {
            return new Red();
        } else if (BLUE.equalsIgnoreCase(colorType)) {
            return new Blue();
        } else if (GREEN.equalsIgnoreCase(colorType)) {
            return new Green();
        }
        
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
