package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class MasterNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        
        for (int number = 1; number <= n; number++) {
            if (isPalindrome(number) && isDisibleBy7(number) &&
                    holdsAtLeastOneEvenDigit(number)) {
                System.out.println(number);
            }
        }
        
        input.close();
    }
    
    private static boolean isPalindrome(int number) {
        String digits = "" + number;
        int length = digits.length();
        
        for (int i = 0; i < (length / 2); i++) {
            if (digits.charAt(i) != digits.charAt(length - i - 1)) {
                return false;
            }
        }
        
        return true;
    }
    
    private static int sumOfDigits(int number) {
        int sum = 0;
        int digits = number;
        
        while (digits > 0) {
            sum += digits % 10;
            digits /= 10;
        }
        
        return sum;
    }
    
    private static boolean isDisibleBy7(int number) {
        if (sumOfDigits(number) % 7 == 0) {
            return true;
        }
        
        return false;
    }
    
    private static boolean holdsAtLeastOneEvenDigit(int number) {
        /*int digits = number;
        int count = 0;
        
        while (digits > 0) {
            int digit = digits % 10;
            
            if (digit % 2 != 0) {
                count++;
            }
            
            digits /= 10;
        }
        
        if (count == 0) {
            return false;
        }
        
        return true;*/
        
        String digits = "" + number;
        int length = digits.length();
        
        for (int i = 0; i < length; i++) {
            int digit = digits.charAt(i) - '0';
            
            if (digit % 2 == 0) {
                return true;
            }
        }
        
        return false;
    }
}
