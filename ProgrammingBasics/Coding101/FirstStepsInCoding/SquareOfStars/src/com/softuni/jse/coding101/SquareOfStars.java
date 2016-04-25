package com.softuni.jse.coding101;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        String asterisks = new String(new char[n]).replace("\0", "*");
        System.out.println(asterisks);
        
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            String spaces = new String(new char[n - 2]).replace("\0",
                    " ");
            System.out.print(spaces);
            System.out.print("*\n");
        }
        
        System.out.println(asterisks);
        
        input.close();
    }
}
