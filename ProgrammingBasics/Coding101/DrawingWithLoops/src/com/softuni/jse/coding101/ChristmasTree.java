package com.softuni.jse.coding101;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (int i = 0; i <= n; i++) {
            String spaces = new String(new char[n - i]).replace("\0", " ");
            String asterisks = new String(new char[i]).replace("\0", "*");
            System.out.print(spaces);
            System.out.print(asterisks);
            System.out.print(" | ");
            System.out.print(asterisks);
            System.out.print(spaces);
            System.out.println();
        }
        
        input.close();
    }
}
