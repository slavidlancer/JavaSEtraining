package com.jse.tutorials.design_patterns.structural.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        
        Shape square = new Square();
        Shape redSquare = new RedShapeDecorator(new Square());
        
        Shape rectangle = new Rectangle();
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        
        circle.draw();
        System.out.println("----");
        redCircle.draw();
        System.out.println();
        square.draw();
        System.out.println("----");
        redSquare.draw();
        System.out.println();
        rectangle.draw();
        System.out.println("----");
        redRectangle.draw();
    }
}
