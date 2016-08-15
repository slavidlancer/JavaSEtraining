package com.jse.hackerrank.tasks06;

import java.util.Arrays;
import java.util.Scanner;

public class SomeSnippetsTemplates66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            //boolean hasBalancedIndex = false;
            /*long leftSum = 0;
            long rightSum = 0;*/
            
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            
            /*for (int j = 1; j < n; j++) {
                for (int j2 = 0; j2 < j; j2++) {
                    leftSum += arr[j2];
                }
                
                for (int j2 = j + 1; j2 < n; j2++) {
                    rightSum += arr[j2];
                }
                
                if (leftSum == rightSum) {
                    hasBalancedIndex = true;
                    
                    break;
                }
            }*/
            
            System.out.println(hasBalancedIndex(arr) ? "YES" : "NO");
        }
        
        scanner.close();
    }
    
    private static boolean hasBalancedIndex(int[] arr) {
        int n = arr.length;
        
        if (n == 0) {
            return true;
        }
        
        int difference = arr[0] - Arrays.stream(arr).sum();
        
        if (difference == 0) {
            return true;
        }
        
        for (int i = 1; i < n; i++) {
            difference += arr[i - 1];
            difference += arr[i];
            
            if (difference == 0) {
                return true;
            }
        }
        
        return false;
    }
}
