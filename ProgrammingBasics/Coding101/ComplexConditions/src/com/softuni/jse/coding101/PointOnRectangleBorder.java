package com.softuni.jse.coding101;

import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = Double.parseDouble(input.nextLine());
        double y1 = Double.parseDouble(input.nextLine());
        double x2 = Double.parseDouble(input.nextLine());
        double y2 = Double.parseDouble(input.nextLine());
        double x = Double.parseDouble(input.nextLine());
        double y = Double.parseDouble(input.nextLine());
        boolean isOnLeftSide = (x == x1) && (y >= y1) && (y <= y2);
        boolean isOnRightSide = (x == x2) && (y >= y1) && (y <= y2);
        boolean isOnUpSide = (y == y1) && (x >= x1) && (x <= x2);
        boolean isOnDownSide = (y == y2) && (x >= x1) && (x <= x2);
        
        if (isOnLeftSide || isOnRightSide || isOnUpSide || isOnDownSide) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
        
        input.close();
    }
}
