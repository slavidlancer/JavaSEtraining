package com.softuni.jse.coding101;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c = Double.parseDouble(input.nextLine());
        double f = c * 1.80 + 32;
        
        System.out.printf("%.2f", f);
        
        input.close();
    }
}
