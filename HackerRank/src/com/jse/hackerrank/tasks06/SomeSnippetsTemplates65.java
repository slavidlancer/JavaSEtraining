package com.jse.hackerrank.tasks06;

import java.util.Scanner;

public class SomeSnippetsTemplates65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] counts = new int[100];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            scanner.next();
            
            counts[arr[i]]++;
        }
        
        for (int i = 0; i < 100; i++) {
            int sum = 0;
            
            for (int j = 0; j <= i; j++) {
                sum += counts[j];
            }
            
            System.out.print(sum + " ");
        }
        
        scanner.close();
    }
}
