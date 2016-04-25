package com.softuni.jse.coding101;

import java.util.Scanner;

public class NumberFrom0To100ToText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int firstDigit = 0;
        int secondDigit = 0;
        boolean isTeen = false;
        boolean isTwoDigitsWithZero = false;
        
        if ((number < 0) || (number > 100)) {
            System.out.println("invalid number");
        }
        
        if (number == firstDigit) {
            System.out.println("zero");
        } else if (number == 10) {
            System.out.println("ten");
        } else if (number == 11) {
            System.out.println("eleven");
        } else if (number == 12) {
            System.out.println("twelve");
        }
        
        if ((number > 0) && (number < 20)) {
            if (number < 10) {
                firstDigit = number;
                secondDigit = -1;
            } else if (number > 12) {
                firstDigit = number % 10;
                secondDigit = number / 10;
            }
        } else if (number <= 100) {
            if (number == 100) {
                System.out.println("one hundred");
            } else {
                firstDigit = number % 10;
                secondDigit = number / 10;
            }
        }
        
        if (secondDigit == 1) {
            switch (firstDigit) {
                case 3:
                    System.out.print("thir");
                    
                    break;
                    
                case 4:
                    System.out.print("four");
                    
                    break;
                    
                case 5:
                    System.out.print("fif");
                    
                    break;
                    
                case 6:
                    System.out.print("six");
                    
                    break;
                    
                case 7:
                    System.out.print("seven");
                    
                    break;
                    
                case 8:
                    System.out.print("eight");
                    
                    break;
                    
                case 9:
                    System.out.print("nine");
                    
                    break;
            }
            
            System.out.print("teen");
            isTeen = true;
        } else if ((secondDigit > 1) && (secondDigit < 10)) {
            switch (secondDigit) {
                case 2:
                    System.out.print("twenty");
                    
                    break;
                    
                case 3:
                    System.out.print("thirty");
                    
                    break;
                    
                case 4:
                    System.out.print("fourty");
                    
                    break;
                    
                case 5:
                    System.out.print("fifty");
                    
                    break;
                    
                case 6:
                    System.out.print("sixty");
                    
                    break;
                    
                case 7:
                    System.out.print("seventy");
                    
                    break;
                    
                case 8:
                    System.out.print("eighty");
                    
                    break;
                    
                case 9:
                    System.out.print("ninety");
                    
                    break;
            }
            
            if (firstDigit == 0) {
                isTwoDigitsWithZero = true;
            } else {
                System.out.print(" ");
            }
        }
        
        if ((firstDigit > 0) && (firstDigit < 10) && !isTeen
                && !isTwoDigitsWithZero) {
            switch (firstDigit) {
                case 1:
                    System.out.print("one");
                    
                    break;
                    
                case 2:
                    System.out.print("two");
                    
                    break;
                    
                case 3:
                    System.out.print("three");
                    
                    break;
                    
                case 4:
                    System.out.print("four");
                    
                    break;
                    
                case 5:
                    System.out.print("five");
                    
                    break;
                    
                case 6:
                    System.out.print("six");
                    
                    break;
                    
                case 7:
                    System.out.print("seven");
                    
                    break;
                    
                case 8:
                    System.out.print("eight");
                    
                    break;
                    
                case 9:
                    System.out.print("nine");
                    
                    break;
            }
        }
        
        input.close();
    }
}
