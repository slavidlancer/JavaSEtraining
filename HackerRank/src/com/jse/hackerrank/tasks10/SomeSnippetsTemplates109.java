package com.jse.hackerrank.tasks10;

import java.util.Random;

public class SomeSnippetsTemplates109 {
    public static void main(String[] args) {
        int t = 5;
        System.out.println(t);
        
        for (int i = 0; i < t; i++) {
            Random random = new Random();
            int minN = 3;
            int maxN = 200;
            int n = random.nextInt((maxN - minN) + 1) + minN;
            
            int minK = 0;
            int maxK = 0;
            
            if (i % 2 == 0) {
                minK = 4;
                maxK = n;
            } else {
                minK = 1;
                maxK = 2;
            }
            
            int k = random.nextInt((maxK - minK) + 1) + minK;
            
            //System.out.println(n + " " + k);
            
            int[] A = new int[n];
            A[0] = 0;
            A[1] = -1;
            A[2] = 1;
            int minA = -100;
            int maxA = 10000;
            
            for (int j = 3; j < n; j++) {
                A[j] = random.nextInt((maxA - minA) + 1) + minA;
            }
            
            for (int j = 0; j < n; j++) {
                //System.out.print(A[j]);
                
                if (j < (n - 1)) {
                    //System.out.print(" ");
                }
            }
            
            //System.out.println();
        }
        
        /* System.out.println("4 3");
        System.out.println("-1 3 0 2");
        System.out.println("5 1");
        System.out.println("0 -1 2 1 4");
        System.out.println("8 6");
        System.out.println("-1 0 1 2 3 4 5 6");
        System.out.println("7 5");
        System.out.println("-3 0 -1 -2 -3 -4 -5");
        System.out.println("6 4");
        System.out.println("-3 0 2 4 6 8"); */
        
        int n = 4;
        int k = 3;
        
        for (int i = 0; i < t; i++) {
            //System.out.println(n + " " + k);
            Random random = new Random();
            int[] A = new int[n];
            A[0] = 0;
            A[1] = -1;
            A[2] = 1;
            int minA = -100;
            int maxA = 10000;
            
            for (int j = 3; j < n; j++) {
                A[j] = random.nextInt((maxA - minA) + 1) + minA;
            }
            
            for (int j = 0; j < n; j++) {
                //System.out.print(A[j]);
                
                if (j < (n - 1)) {
                    //System.out.print(" ");
                }
            }
            
            //System.out.println();
            
            if (((i + 1) % 2) == 0) {
                n = 2 * i + 1;
                k = n;
            } else {
                n = 20 * i + 10;
                k = 2;
            }
        }
        
        System.out.println("5 3");
        System.out.println("-1 90 999 100 0");
        System.out.println("4 2");
        System.out.println("0 -1 2 1");
        System.out.println("3 3");
        System.out.println("-1 0 1");
        System.out.println("6 1");
        System.out.println("-1 0 1 -1 2 3");
        System.out.println("7 3");
        System.out.println("-1 0 1 2 3 4 5");
    }
}
