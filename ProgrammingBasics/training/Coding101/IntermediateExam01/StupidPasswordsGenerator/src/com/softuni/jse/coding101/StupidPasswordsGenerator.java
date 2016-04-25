package com.softuni.jse.coding101;

import java.util.Scanner;

public class StupidPasswordsGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int l = input.nextInt();
        
        for (int num1 = 1; num1 <= n; num1++) {
            for (int num2 = 1; num2 <= n; num2++) {
                for (char letter1 = 'a'; letter1 < ('a' + l); letter1++) {
                    for (char letter2 = 'a'; letter2 < ('a' + l); letter2++) {
                        for (int num3 = Math.max(num1, num2) + 1; num3 <= n;
                                num3++) {
                            System.out.print(num1);
                            System.out.print(num2);
                            System.out.print(letter1);
                            System.out.print(letter2);
                            System.out.print(num3);
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
        
        System.out.println();
        
        input.close();
    }
}
