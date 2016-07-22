package com.jse.tutorials.design_patterns.structural.facade;

public class FacadePattern {
    public static void main(String[] args) {
        ShapeMakerFacade shapeMakerFacade = new ShapeMakerFacade();
        
        shapeMakerFacade.drawCircle();
        shapeMakerFacade.drawRectangle();
        shapeMakerFacade.drawSquare();
    }
}
