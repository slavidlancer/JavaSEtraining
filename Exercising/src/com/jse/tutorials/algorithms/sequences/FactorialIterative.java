package com.jse.tutorials.algorithms.sequences;

import java.util.Scanner;

public class FactorialIterative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        System.out.println(calculateFactorialIterative(n));
        
        input.close();
    }

    private static long calculateFactorialIterative(int n) {
        long prod = 1;
        
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        
        return prod;
    }
}
