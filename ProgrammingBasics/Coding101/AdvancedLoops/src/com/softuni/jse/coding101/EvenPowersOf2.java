package com.softuni.jse.coding101;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int number = 1;
        
        for (int i = 0; i <= n; i += 2) {
            System.out.println(number);
            number *= 4;
        }
        
        input.close();
    }
}
