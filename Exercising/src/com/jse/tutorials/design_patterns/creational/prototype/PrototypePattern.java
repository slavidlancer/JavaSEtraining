package com.jse.tutorials.design_patterns.creational.prototype;

public class PrototypePattern {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        
        try {
            Shape clonedShape = ShapeCache.getShape("1");
            
            System.out.println("Shape: " + clonedShape.getType());
            
            Shape clonedShape2 = ShapeCache.getShape("2");
            
            System.out.println("Shape: " + clonedShape2.getType());
            
            Shape clonedShape3 = ShapeCache.getShape("3");
            
            System.out.println("Shape: " + clonedShape3.getType());
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }
    }
}
