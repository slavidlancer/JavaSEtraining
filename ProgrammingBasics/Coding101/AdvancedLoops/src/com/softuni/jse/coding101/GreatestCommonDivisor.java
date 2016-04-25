package com.softuni.jse.coding101;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        
        while (b != 0) {
            int oldB = b;
            b = a % b;
            a = oldB;
        }
        
        System.out.println(a);
        
        input.close();
    }
}
