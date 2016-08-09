package com.jse.tutorials.design_patterns.structural.flyweight;

public class FlyweightPattern {
    private static final String[] colors = {"Red", "Green", "Blue", "White",
            "Black"};
    
    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomXOrY());
            circle.setY(getRandomXOrY());
            circle.setRadius(100);
            
            circle.draw();
        }
    }
    
    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
    
    private static int getRandomXOrY() {
        return (int) (Math.random() * 100);
    }
}
