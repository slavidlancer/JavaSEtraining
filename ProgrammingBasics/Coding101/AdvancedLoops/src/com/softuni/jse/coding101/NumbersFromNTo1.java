package com.softuni.jse.coding101;

import java.util.Scanner;

public class NumbersFromNTo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        
        input.close();
    }
}
