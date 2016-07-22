package com.jse.tutorials.algorithms.sequences;

import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        System.out.println(calculateFactorialRecursive(n));
        
        input.close();
    }

    private static long calculateFactorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        
        return n * calculateFactorialRecursive(n - 1);
    }
}
