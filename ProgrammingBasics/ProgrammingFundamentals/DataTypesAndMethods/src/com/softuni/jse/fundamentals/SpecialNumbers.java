package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        
        for (int number = 1; number <= n; number++) {
            int sumOfDigits = 0;
            int digits = number;
            
            while (digits > 0) {
                sumOfDigits += digits % 10;
                digits /= 10;
            }
            
            boolean isSpecial = (sumOfDigits == 5) || (sumOfDigits == 7) ||
                    (sumOfDigits == 11);
            
            System.out.println(number + " -> " + isSpecial);
        }
        
        input.close();
    }
}
