package com.jse.tutorials.design_patterns.creational.abstract_factory;

public class FactoryProducer {
    static String COLOR = "COLOR";
    static String SHAPE = "SHAPE";
    
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        }
        
        if (COLOR.equalsIgnoreCase(factoryType)) {
            return new ColorFactory();
        } else if (SHAPE.equalsIgnoreCase(factoryType)) {
            return new ShapeFactory();
        }
        
        return null;
    }
}
