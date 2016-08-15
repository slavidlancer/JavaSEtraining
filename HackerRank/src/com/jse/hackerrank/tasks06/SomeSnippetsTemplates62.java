package com.jse.hackerrank.tasks06;

import java.util.Scanner;

public class SomeSnippetsTemplates62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int countStudentsOnTime = 0;
            
            for (int j = 0; j < n; j++) {
                int[] arr = new int[n];
                arr[i] = scanner.nextInt();
                
                if (arr[i] <= 0) {
                    countStudentsOnTime++;
                }
            }
            
            if (countStudentsOnTime < k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
