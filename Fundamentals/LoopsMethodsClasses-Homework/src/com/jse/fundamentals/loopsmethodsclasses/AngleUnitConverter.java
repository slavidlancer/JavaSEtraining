package com.jse.fundamentals.loopsmethodsclasses;

import java.util.Scanner;

public class AngleUnitConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n (entries) = ");
        int n = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i < n; i++) {
            System.out.print("[value] [deg/rad] = ");
            String[] conversion = input.nextLine().split(" ");
            double value = Double.parseDouble(conversion[0]);
            String measure = conversion[1];
            
            System.out.print("result: ");
            
            switch (measure) {
                case "deg":
                    System.out.printf("%.6f rad\n", degreesToRadians(value));
                    break;
                    
                case "rad":
                    System.out.printf("%.6f deg\n", radiansToDegrees(value));
                    break;

                default:
                    System.out.println("invalid unit");
                    break;
            }
        }
        
        input.close();
    }
    
    private static double radiansToDegrees(double radians) {
        double degrees = radians * 180.0 / Math.PI;
        
        return degrees;
    }
    
    private static double degreesToRadians(double degrees) {
        double radians = degrees * Math.PI / 180.0;
        
        return radians;
    }
}
