package com.softuni.jse.coding101;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int sum = 0;
        int max = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i < n - 1; i++) {
            if (i == 0) {
                sum += max;
            }
            
            int number = Integer.parseInt(input.nextLine());
            
            if (number > max) {
                max = number;
            }
            
            sum += number;
        }
        
        sum -= max;
        
        if (sum == max) {
            System.out.println("Yes\nSum = " + sum);
        } else {
            int diff = Math.abs(max - sum);
            System.out.println("No\nDiff = " + diff);
        }
        
        input.close();
    }
}
