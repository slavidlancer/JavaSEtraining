package com.softuni.jse.coding101;

import java.util.Scanner;

public class Number100200 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        
        if (number < 100) {
            System.out.println("Less than 100");
        } else if ((number >= 100) && (number <= 200)) {
            System.out.println("Between 100 and 200");
        } else if (number > 200) {
            System.out.println("Greater than 200");
        }
        
        input.close();
    }
}
