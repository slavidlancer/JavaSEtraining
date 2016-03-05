package com.jse.fundamentals.syntax;

import java.util.Scanner;

public class CountEqualBitPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number = ");
        int number = input.nextInt();
        int mask = 3;
        int pairsCount = 0;
        
        while (number > 2) {
            if ((number & mask) == 3 || (number & mask) == 0) {
                pairsCount++;
            }
            
            number >>= 1;
        }
        
        System.out.printf("%nequal bit pairs (00 or 11): %d", pairsCount);
        
        input.close();
    }
}
