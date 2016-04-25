package com.softuni.jse.coding101;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int min = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i < n - 1; i++) {
            int number = Integer.parseInt(input.nextLine());
            
            if (number < min) {
                min = number;
            }
        }
        
        System.out.println(min);
        
        input.close();
    }
}
