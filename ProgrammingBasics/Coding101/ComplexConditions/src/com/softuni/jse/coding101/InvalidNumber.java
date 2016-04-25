package com.softuni.jse.coding101;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        
        if ((number < 100) || (number > 200)) {
            if (number != 0) {
                System.out.println("invalid");
            }
        }
        
        input.close();
    }
}
