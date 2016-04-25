package com.softuni.jse.coding101;

import java.util.Scanner;

public class TwoDRectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = Double.parseDouble(input.nextLine());
        double y1 = Double.parseDouble(input.nextLine());
        double x2 = Double.parseDouble(input.nextLine());
        double y2 = Double.parseDouble(input.nextLine());
        double sideA = Math.abs(x2 - x1);
        double sideB = Math.abs(y2 - y1);
        double area = sideA * sideB;
        double perimeter = 2 * (sideA + sideB);
        
        System.out.println(area);
        System.out.println(perimeter);
        
        input.close();
    }
}
