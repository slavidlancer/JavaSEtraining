package com.softuni.jse.coding101;

import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.MIN_VALUE + 1;
        boolean isEven = false;
        boolean errorOccurred = false;
        
        while (true) {
            System.out.print("Еnter even number: ");
            
            try {
                n = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid number!");
                errorOccurred = true;
            }
            
            if (n % 2 == 0) {
                isEven = true;
                
                break;
            }
            
            if (!errorOccurred) {
                if (!isEven) {
                    System.out.println("The number is not even.");
                }
            }
            
            errorOccurred = false;
        }
        
        if (isEven) {
            System.out.println("Even number entered: " + n);
        }
        
        input.close();
    }
}
