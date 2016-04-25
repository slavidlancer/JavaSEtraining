package com.softuni.jse.coding101;

import java.util.Scanner;

public class PerfectDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        
        int leftRight = n - 1;
        
        if (n >= 2) {
            for (int i = 1; i <= n; i++) {
                System.out.print(new String(new char[leftRight]).
                        replace("\0", " "));
                System.out.print("*");
                
                for (int j = 1; j < i; j++) {
                    System.out.print("-*");
                }
                
                System.out.println(new String(new char[leftRight]).
                        replace("\0", " "));
                
                leftRight--;
            }
        }
        
        leftRight = 1;
        
        if (n > 2) {
            for (int i = 1; i < n; i++) {
                System.out.print(new String(new char[leftRight]).
                        replace("\0", " "));
                System.out.print("*");
                
                for (int j = 1; j < n - i; j++) {
                    System.out.print("-*");
                }
                
                System.out.println(new String(new char[leftRight]).
                        replace("\0", " "));
                
                leftRight++;
            }
        } else {
            leftRight = n - 1;
            
            System.out.print(new String(new char[leftRight]).
                    replace("\0", " "));
            System.out.print("*");
        }
        
        input.close();
    }
}
