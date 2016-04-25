package com.softuni.jse.coding101;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        System.out.print("+ ");
        
        for (int i = 0; i < n - 2; i++) {
            System.out.print("- ");
        }
        
        System.out.print("+\n");
        
        for (int row = 0; row < n - 2; row++) {
            System.out.print("| ");
            
            for (int col = 0; col < n - 2; col++) {
                System.out.print("- ");
            }
            
            System.out.print("|");
            System.out.println();
        }
        
        System.out.print("+ ");
        
        for (int i = 0; i < n - 2; i++) {
            System.out.print("- ");
        }
        
        System.out.print("+\n");
        
        input.close();
    }
}
