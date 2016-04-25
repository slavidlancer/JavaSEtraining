package com.softuni.jse.coding101;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int max = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i < n - 1; i++) {
            int number = Integer.parseInt(input.nextLine());
            
            if (number > max) {
                max = number;
            }
        }
        
        System.out.println(max);
        
        input.close();
    }
}
