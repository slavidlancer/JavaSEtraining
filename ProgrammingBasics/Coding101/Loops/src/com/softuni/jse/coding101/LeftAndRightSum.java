package com.softuni.jse.coding101;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        int diff = 0;
        
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(input.nextLine());
            
            leftSum += number;
        }
        
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(input.nextLine());
            
            rightSum += number;
        }
        
        diff = Math.abs(leftSum - rightSum);
        
        System.out.println(leftSum == rightSum ? "Yes, sum = " + leftSum :
            "No, diff = " + diff);
        
        input.close();
    }
}
