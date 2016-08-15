package com.jse.hackerrank.tasks07;

import java.util.Scanner;

public class SomeSnippetsTemplates72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int height = 1;
            int n = scanner.nextInt();
            
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    height *= 2;
                } else {
                    height += 1;
                }
            }
            
            System.out.println(height);
        }
        
        scanner.close();
    }
}
