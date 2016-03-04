package com.jse.fundamentals.introduction;

import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        Double a = Double.parseDouble(input.nextLine());
        System.out.print("b = ");
        Double b = Double.parseDouble(input.nextLine());
        System.out.print("c = ");
        Double c = Double.parseDouble(input.nextLine());
        
        System.out.format("average: %.2f", ((a+ b + c) / 3));
        
        input.close();
    }
}
