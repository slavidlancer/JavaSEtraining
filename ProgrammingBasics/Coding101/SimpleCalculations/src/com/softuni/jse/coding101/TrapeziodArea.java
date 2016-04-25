package com.softuni.jse.coding101;

import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double b1 = Double.parseDouble(input.nextLine());
        double b2 = Double.parseDouble(input.nextLine());
        double h = Double.parseDouble(input.nextLine());
        double area = ((b1 + b2) * h) / 2;
        
        System.out.println("Trapezoid area = " + area);
        
        input.close();
    }
}
