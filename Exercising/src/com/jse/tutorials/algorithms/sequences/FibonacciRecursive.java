package com.jse.tutorials.algorithms.sequences;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        System.out.println(calculateFibonacciRecursive(n));
        
        input.close();
    }

    private static long calculateFibonacciRecursive(int n) {
        if ((n == 0) || (n == 1)) {
            return n;
        }
        
        return calculateFibonacciRecursive(n - 1) +
                calculateFibonacciRecursive(n - 2);
    }
}
