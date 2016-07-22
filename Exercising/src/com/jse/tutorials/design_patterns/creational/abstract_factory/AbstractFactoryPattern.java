package com.jse.tutorials.design_patterns.creational.abstract_factory;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color1 = colorFactory.getColor("red");
        Color color2 = colorFactory.getColor("blue");
        Color color3 = colorFactory.getColor("green");
        //Color color4 = colorFactory.getColor("NaN");
        
        color1.fill();
        color2.fill();
        color3.fill();
        //color4.fill();
        
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
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
