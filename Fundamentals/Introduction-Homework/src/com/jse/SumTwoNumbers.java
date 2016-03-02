package com.jse;

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("first number: ");
        int firstNumber = input.nextInt();
        System.out.print("second number: ");
        int secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("sum: " + sum);
        
        input.close();
    }
}
