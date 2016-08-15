package com.jse.hackerrank.tasks06;

import java.util.Scanner;

public class SomeSnippetsTemplates67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        int pairsCount = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i < j) && ((arr[i] + arr[j]) % k == 0)) {
                    pairsCount++;
                }
            }
        }
        
        System.out.println(pairsCount);
        
        scanner.close();
    }
}
