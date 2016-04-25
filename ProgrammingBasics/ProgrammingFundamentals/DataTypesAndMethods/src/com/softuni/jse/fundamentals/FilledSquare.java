package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class FilledSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        
        printHeaderRow(n);
        
        for (int i = 0; i < (n - 2); i++) {
            printMiddleRow(n);
        }
        
        printHeaderRow(n);
        
        input.close();
    }
    
    private static void printHeaderRow(int n) {
        String dashes = new String(new char[2 * n]).replace("\0", "-");
        
        System.out.println(dashes);
    }
    
    private static void printMiddleRow(int n) {
        System.out.print("-");
        
        for (int i = 1; i < n; i++) {
            System.out.print("\\/");
        }
        
        System.out.println("-");
    }
}
