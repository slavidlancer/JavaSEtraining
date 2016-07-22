package com.jse.tutorials.algorithms.searching;

import java.util.Scanner;

public class MaxOf3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        System.out.println(findMaxOf3(a, b, c));
        
        input.close();
    }

    private static int findMaxOf3(int a, int b, int c) {
        int max = a;
        
        if (b > max) {
            max = b;
        }
        
        if (c > max) {
            max = c;
        }
        
        return max;
    }
}
