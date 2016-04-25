package com.softuni.jse.coding101;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = Double.parseDouble(input.nextLine());
        String inputMetric = input.nextLine().toLowerCase();
        String outputMetric = input.nextLine().toLowerCase();
        
        if (inputMetric.equals("mm")) {
            number /= 1000;
        }
        
        if (inputMetric.equals("cm")) {
            number /= 100;
        }
        
        if (inputMetric.equals("m")) {
            number /= 1;
        }
        
        if (inputMetric.equals("mi")) {
            number /= 0.000621371192;
        }
        
        if (inputMetric.equals("in")) {
            number /= 39.3700787;
        }
        
        if (inputMetric.equals("km")) {
            number /= 0.001;
        }
        
        if (inputMetric.equals("ft")) {
            number /= 3.2808399;
        }
        
        if (inputMetric.equals("yd")) {
            number /= 1.0936133;
        }
        
        if (outputMetric.equals("mm")) {
            number *= 1000;
            System.out.println(number + " mm");
            //System.out.printf("%.7f mm", number);
        }
        
        if (outputMetric.equals("cm")) {
            number *= 100;
            System.out.println(number + " cm");
        }
        
        if (outputMetric.equals("m")) {
            number *= 1;
            System.out.println(number + " m");
        }
        
        if (outputMetric.equals("mi")) {
            number *= 0.000621371192;
            System.out.println(number + " mi");
        }
        
        if (outputMetric.equals("in")) {
            number *= 39.3700787;
            System.out.println(number + " in");
        }
        
        if (outputMetric.equals("km")) {
            number *= 0.001;
            System.out.println(number + " km");
        }
        
        if (outputMetric.equals("ft")) {
            number *= 3.2808399;
            System.out.println(number + " ft");
        }
        
        if (outputMetric.equals("yd")) {
            number *= 1.0936133;
            System.out.println(number + " yd");
        }
        
        input.close();
    }
}
