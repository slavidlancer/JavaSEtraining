package com.softuni.jse.coding101;

import java.util.Scanner;

public class NumberInRangeFrom1To100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Еnter a number in the range [1...100]: ");
        int n = Integer.parseInt(input.nextLine());
        
        while ((n < 1) || (n > 100)) {
            System.out.println("Invalid number!");
            n = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("The number is: " + n);
        
        input.close();
    }
}
