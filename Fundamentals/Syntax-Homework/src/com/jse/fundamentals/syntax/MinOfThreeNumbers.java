package com.jse.fundamentals.syntax;

import java.util.Scanner;

public class MinOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        double minNumber = Math.min(a, b);
        System.out.print("c = ");
        double c = input.nextDouble();
        minNumber = Math.min(minNumber, c);

        String stringResult = String.valueOf(minNumber);

        System.out.printf("\nmin of (%.2f, %.2f, %.2f ): %s", a, b, c,
                stringResult);
        
        input.close();
    }
}
