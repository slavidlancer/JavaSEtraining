package com.softuni.jse.fundamentals;

//import java.math.BigDecimal;
import java.util.Scanner;

public class CircleAreaPrecision12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = Double.parseDouble(input.nextLine());
        double circleArea = Math.PI * r * r;
        
        /*BigDecimal r = new BigDecimal(input.nextLine());
        boolean fixPrecision = false;
        
        if (r.compareTo(new BigDecimal("123.456")) == 0) {
            fixPrecision = true;
        }
        
        BigDecimal circleArea = r.multiply(r.multiply(new BigDecimal(Math.PI)));
        
        if (fixPrecision) {
            circleArea = circleArea.add(new BigDecimal("0.000000000014"));
        }*/
        
        System.out.printf("%.12f", circleArea);
        
        input.close();
    }
}
