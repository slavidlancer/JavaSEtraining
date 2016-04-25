package com.softuni.jse.coding101;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int factorial = 1;
        
        do {
            factorial *= n;
            n--;
        } while (n > 1);
        
        System.out.println(factorial);
        
        input.close();
    }
}
