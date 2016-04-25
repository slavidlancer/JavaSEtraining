package com.softuni.jse.coding101;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("inches = ");
        double inches = Double.parseDouble(input.nextLine());
        double centimeters = inches * 2.54;
        
        System.out.println("Centimeters = " + centimeters);
        
        input.close();
    }
}
