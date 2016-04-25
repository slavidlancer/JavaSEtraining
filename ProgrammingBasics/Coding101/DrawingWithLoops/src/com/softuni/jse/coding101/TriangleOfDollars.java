package com.softuni.jse.coding101;

import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            System.out.print("$");
            
            for (int col = 1; col < row; col++) {
                System.out.print(" $");
            }
            
            System.out.println();
        }
        
        input.close();
    }
}
