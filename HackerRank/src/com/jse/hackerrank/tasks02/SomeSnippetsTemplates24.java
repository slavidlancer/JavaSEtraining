package com.jse.hackerrank.tasks02;

public class SomeSnippetsTemplates24 {
    public static void main(String[] args) {
        long result = nTimesK(4, 4);
        
        System.out.println("result: " + result);
        
        System.out.println("sum: " + summation(2000));
        System.out.println("factorial: " + factorial(12));
        System.out.println("exponentiation: " + exponentiation(2, 8));
    }
    
    private static long nTimesK(int n, int k) {
        System.out.println("n: " + n);
        
        if (n > 1) {
            return k + nTimesK(n - 1, k);
        } else {
            return k;
        }
    }
    
    private static int summation(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + summation(n - 1);
        }
    }
    
    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    private static int exponentiation(int n, int p) {
        if (p <= 0) {
            return 1;
        } else {
            return n * exponentiation(n, p - 1);
        }
    }
}
