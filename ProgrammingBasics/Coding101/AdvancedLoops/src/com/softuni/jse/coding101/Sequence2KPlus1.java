package com.softuni.jse.coding101;

import java.util.Scanner;

public class Sequence2KPlus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int number = 1;
        
        while (number <= n) {
            System.out.println(number);
            number = (number * 2) + 1;
        }
        
        input.close();
    }
}
