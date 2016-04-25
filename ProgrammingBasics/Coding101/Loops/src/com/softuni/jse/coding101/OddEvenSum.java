package com.softuni.jse.coding101;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int oddSum = 0;
        int evenSum = 0;
        int diff = 0;
        
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(input.nextLine());
            
            if (i % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        
        diff = Math.abs(oddSum - evenSum);
        
        System.out.println(oddSum == evenSum ? "Yes\nsum = " + oddSum :
            "No\ndiff = " + diff);
        
        input.close();
    }
}
