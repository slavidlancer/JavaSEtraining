package com.jse.tutorials.design_patterns.structural.facade;

public class ShapeMakerFacade {
    private Square square;
    private Rectangle rectangle;
    private Circle circle;
    
    public ShapeMakerFacade() {
        square = new Square();
        rectangle = new Rectangle();
        circle = new Circle();
    }
    
    public void drawSquare() {
        square.draw();
    }
    
    public void drawRectangle() {
        rectangle.draw();
    }
    
    public void drawCircle() {
        circle.draw();
    }
}
