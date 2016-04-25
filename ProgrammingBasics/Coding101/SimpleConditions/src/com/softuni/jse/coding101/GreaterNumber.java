package com.softuni.jse.coding101;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = Integer.parseInt(input.nextLine());
        int number2 = Integer.parseInt(input.nextLine());
        
        if (number1 > number2) {
            System.out.println(number1);
        } else if (number1 <= number2) {
            System.out.println(number2);
        }
        
        input.close();
    }
}
