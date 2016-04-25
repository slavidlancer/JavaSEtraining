package com.softuni.jse.coding101;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int currentSum = 0;
        int previousSum = 0;
        int diff = 0;
        int maxDiff = 0;
        
        for (int i = 0; i < n; i++) {
            previousSum = currentSum;
            currentSum = 0;
            
            currentSum += Integer.parseInt(input.nextLine());
            currentSum += Integer.parseInt(input.nextLine());
            
            if (i != 0) {
                diff = Math.abs(currentSum - previousSum);
                
                if ((diff != 0) && (diff > maxDiff)) {
                    maxDiff = diff;
                }
            }
        }
        
        if ((previousSum == currentSum) || (n == 1)) {
            System.out.println("Yes, value =" + currentSum);
        } else {
            System.out.println("No, maxdiff =" + maxDiff);
        }
        
        input.close();
    }
}
