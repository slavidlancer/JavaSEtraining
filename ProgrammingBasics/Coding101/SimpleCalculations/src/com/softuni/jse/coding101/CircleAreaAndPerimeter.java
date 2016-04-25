package com.softuni.jse.coding101;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = Double.parseDouble(input.nextLine());
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        
        input.close();
    }
}
