package com.softuni.jse.coding101;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.nextLine());
        double h = Double.parseDouble(input.nextLine());
        double area = a * h / 2;
        
        System.out.printf("%.2f", area);
        
        input.close();
    }
}
