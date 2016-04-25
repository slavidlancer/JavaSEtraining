package com.softuni.jse.coding101;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int num = 1;
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (col > 1) {
                    System.out.print(" ");
                }
                
                System.out.print(num);
                num++;
                
                if (num > n) {
                    break;
                }
            }
            
            System.out.println();
            
            if (num > n) {
                break;
            }
        }
        
        input.close();
    }
}
