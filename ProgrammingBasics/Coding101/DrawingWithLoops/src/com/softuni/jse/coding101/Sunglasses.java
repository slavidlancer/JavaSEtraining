package com.softuni.jse.coding101;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String asterisks = new String(new char[n * 2]).replace("\0", "*");
        String spaces = new String(new char[n]).replace("\0", " ");
        String slashes = new String(new char[(2 * n) - 2]).replace("\0", "/");
        String frame = new String(new char[n]).replace("\0", "|");
        
        System.out.print(asterisks);
        System.out.print(spaces);
        System.out.print(asterisks);
        System.out.println();
        
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            System.out.print(slashes);
            System.out.print("*");
            
            if (i == (((n - 1) / 2) - 1)) {
                System.out.print(frame);
            } else {
                System.out.print(spaces);
            }
            
            System.out.print("*");
            System.out.print(slashes);
            System.out.print("*");
            System.out.println();
        }
        
        System.out.print(asterisks);
        System.out.print(spaces);
        System.out.print(asterisks);
        
        input.close();
    }
}
