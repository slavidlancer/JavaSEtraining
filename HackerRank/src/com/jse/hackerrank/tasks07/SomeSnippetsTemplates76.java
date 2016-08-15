package com.jse.hackerrank.tasks07;

import java.util.Scanner;

public class SomeSnippetsTemplates76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int maxSumOfElements = Integer.MIN_VALUE;
            int maxSumOfContiguousElements = Integer.MIN_VALUE;
            int sumOfPreviousContiguousElements = 0;
            
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
                
                if (sumOfPreviousContiguousElements < 0) {
                    sumOfPreviousContiguousElements = 0;
                }
                
                sumOfPreviousContiguousElements += arr[j];
                
                if (sumOfPreviousContiguousElements >
                        maxSumOfContiguousElements) {
                    maxSumOfContiguousElements =
                            sumOfPreviousContiguousElements;
                }
                
                if (arr[j] > 0) {
                    if (maxSumOfElements < 0) {
                        maxSumOfElements = arr[j];
                    } else {
                        maxSumOfElements += arr[j];
                    }
                } else {
                    if (maxSumOfElements < 0) {
                        maxSumOfElements = Math.max(arr[j], maxSumOfElements);
                    }
                }
            }
            
            System.out.println(maxSumOfContiguousElements + " " +
                    maxSumOfElements);
        }
        
        scanner.close();
    }
}
