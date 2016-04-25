package com.softuni.jse.coding101;

import java.util.Scanner;

public class ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1 = Double.parseDouble(input.nextLine());
        double number2 = Double.parseDouble(input.nextLine());
        double number3 = Double.parseDouble(input.nextLine());
        
        if (number1 == number2) {
            if (number1 == number3) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else {
            System.out.println("no");
        }
        
        input.close();
    }
}
