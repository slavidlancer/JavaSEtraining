package com.jse.tutorials.algorithms.sequences;

import java.util.Scanner;

public class PowerRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("n = ");
        int n = input.nextInt();
        
        System.out.println(calculatePower(a, n));
        
        input.close();
    }

    private static long calculatePower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        
        return a * calculatePower(a, n - 1);
    }
}
