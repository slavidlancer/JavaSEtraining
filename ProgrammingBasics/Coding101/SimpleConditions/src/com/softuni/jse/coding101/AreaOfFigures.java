package com.softuni.jse.coding101;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String figure = input.nextLine();
        double area = 0;
        
        if (figure.equals("square")) {
            double side = Double.parseDouble(input.nextLine());
            area = side * side;
        } else if (figure.equals("rectangle")) {
            double sideA = Double.parseDouble(input.nextLine());
            double sideB = Double.parseDouble(input.nextLine());
            
            area = sideA * sideB;
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(input.nextLine());
            
            area = Math.PI * radius * radius;
        } else if (figure.equals("triangle")) {
            double side = Double.parseDouble(input.nextLine());
            double height = Double.parseDouble(input.nextLine());
            
            area = side * height / 2;
        }
        
        System.out.printf("%.3f", area);
        
        input.close();
    }
}