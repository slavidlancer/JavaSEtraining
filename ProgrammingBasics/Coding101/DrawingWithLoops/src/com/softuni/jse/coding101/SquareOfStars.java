package com.softuni.jse.coding101;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (int r = 1; r <= n; r++) {
            System.out.print("*");
            
            for (int c = 1; c < n; c++) {
                System.out.print(" *");
            }
            
            System.out.println();
        }
        
        input.close();
    }
}
