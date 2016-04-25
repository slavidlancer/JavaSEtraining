package com.softuni.jse.coding101;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int leftRight = (n - 1) / 2;
        
        for (int i = 1; i <= ((n - 1) / 2); i++) {
            System.out.print(new String(new char[leftRight]).
                    replace("\0", "-"));
            System.out.print("*");
            
            int mid = n - (2 * leftRight) - 2;
            
            if (mid >= 0) {
                System.out.print(new String(new char[mid]).replace("\0", "-"));
                System.out.print("*");
            }
            
            System.out.println(new String(new char[leftRight]).
                    replace("\0", "-"));
            leftRight--;
        }
        
        leftRight = 0;
        
        for (int i = ((n - 1) / 2); i >= 0; i--) {
            System.out.print(new String(new char[leftRight]).
                    replace("\0", "-"));
            System.out.print("*");
            
            int mid = n - (2 * leftRight) - 2;
            
            if (mid >= 0) {
                System.out.print(new String(new char[mid]).replace("\0", "-"));
                System.out.print("*");
            }
            
            System.out.println(new String(new char[leftRight]).
                    replace("\0", "-"));
            leftRight++;
        }
        
        input.close();
    }
}
