package com.jse.fundamentals.syntax;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("height = ");
        int height = input.nextInt();
        System.out.print("width = ");
        int width = input.nextInt();
        long rectangleArea = height * width;
        
        System.out.println("Area of rectangle: " + rectangleArea);
        
        input.close();
    }
}
