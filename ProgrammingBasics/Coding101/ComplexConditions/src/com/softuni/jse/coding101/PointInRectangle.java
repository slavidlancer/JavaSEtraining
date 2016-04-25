package com.softuni.jse.coding101;

import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = Double.parseDouble(input.nextLine());
        double y1 = Double.parseDouble(input.nextLine());
        double x2 = Double.parseDouble(input.nextLine());
        double y2 = Double.parseDouble(input.nextLine());
        double x = Double.parseDouble(input.nextLine());
        double y = Double.parseDouble(input.nextLine());
        
        if ((x >= x1) && (x <= x2) && (y >= y1) && (y <= y2)) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
        
        input.close();
    }
}
