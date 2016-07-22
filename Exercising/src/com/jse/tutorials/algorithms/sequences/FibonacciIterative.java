package com.jse.tutorials.algorithms.sequences;

import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        System.out.println(calculateFibonacciIterative(n));
        
        input.close();
    }

    private static long calculateFibonacciIterative(int n) {
        if (n == 0) {
            return 0;
        }
        
        long a = 0;
        long b = 1;
        long sum = 1;
        
        for (int i = 2; i < n; i++) {
            a = b;
            b = sum;
            sum = a + b;
        }
        
        return sum;
    }
}
