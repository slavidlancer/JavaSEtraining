package com.jse.hackerrank.tasks08;

/**
*   This is a collection of methods we expect and require a polygon to have 
**/
interface Polygon {
    /** @return The number of sides of the Polygon **/
    int getNumberOfSides();
    /** @return The perimeter of the Polygon **/
    double getPerimeter();
    //double getArea(); //to be implemented in Triangle, Rectangle or Square
}

class Triangle implements Polygon {
    private static int numberOfSides = 3;
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public int getNumberOfSides() {
        return Triangle.numberOfSides;
    }
    
    @Override
    public double getPerimeter() {
        double perimeter = this.side1 + this.side2 + this.side3;
        
        return perimeter;
    }
}

class Rectangle implements Polygon {
    private static int numberOfSides = 4;
    private double side1;
    private double side2;
    
    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    
    @Override
    public int getNumberOfSides() {
        return Rectangle.numberOfSides;
    }
    
    @Override
    public double getPerimeter() {
        double perimeter = (2 * this.side1) + (2 * this.side2);
        
        return perimeter;
    }
}

/**
*    This inherits the properties and methods of its superclass, Rectangle.
**/
class Square extends Rectangle implements Polygon {
    public Square(double side) {
        super(side, side);
    }
}

public class SomeSnippetsTemplates84 {
    public static void main(String[] args) {
        Polygon triangle = new Triangle(1, 2, 3);
        print(triangle);
        
        Polygon rectangle = new Rectangle(2, 3);
        print(rectangle);
        
        Polygon square = new Square(2);
        print(square);
    }
    
    public static void print(Polygon polygon) {
        System.out.println("A " + polygon.getClass().getSimpleName() + " has " +
                polygon.getNumberOfSides() + " sides.");
        System.out.println("The perimeter of this shape is: " +
                polygon.getPerimeter() + '\n');
    }
}
