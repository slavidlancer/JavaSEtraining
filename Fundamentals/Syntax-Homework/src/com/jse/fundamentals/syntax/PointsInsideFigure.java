package com.jse.fundamentals.syntax;

import java.util.Scanner;

public class PointsInsideFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        double x = input.nextDouble();
        System.out.print("y = ");
        double y = input.nextDouble();
        boolean isInside = false;
        
        if ((y >= 6.00) && (y <= 8.50) && (x >= 12.50) && (x <= 22.50)) {
            isInside = true;
        } else if (((y >= 8.50) && (y <= 13.50)) &&
                ((x >= 12.5) && (x <= 17.50))) {
            isInside = true;
        } else if (((y >= 8.50) && (y <= 13.50)) &&
                ((x >= 20) && (x <= 22.50))) {
            isInside = true;
        }
        
        String result = isInside ? "inside" : "outside";
        System.out.printf("\npoint (%.2f; %.2f) is %s the figure", x, y,
                result);
        
        input.close();
    }
}
