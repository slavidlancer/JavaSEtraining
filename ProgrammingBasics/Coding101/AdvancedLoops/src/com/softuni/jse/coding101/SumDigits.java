package com.softuni.jse.coding101;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int sum = 0;
        
        do {
            sum += (num % 10);
            num /= 10;
        } while (num > 0);
        
        System.out.println(sum);
        
        input.close();
    }
}
