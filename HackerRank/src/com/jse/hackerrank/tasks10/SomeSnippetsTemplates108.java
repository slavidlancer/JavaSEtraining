package com.jse.hackerrank.tasks10;

import java.util.Scanner;

public class SomeSnippetsTemplates108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int max = 0;
            
            for (int j = 1; j < n; j++) {
                for (int p = j + 1; p <= n; p++) {
                    int temp = j & p;
                    
                    if (temp < k) {
                        max = Math.max(max, temp);
                    }
                }
            }
            
            System.out.println(max);
        }
        
        scanner.close();
    }
}
