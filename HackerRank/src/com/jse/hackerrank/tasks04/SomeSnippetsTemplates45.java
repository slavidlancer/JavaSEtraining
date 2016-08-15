package com.jse.hackerrank.tasks04;

import java.util.Scanner;

public class SomeSnippetsTemplates45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = input.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                int shift = i + (n - d);
                
                if (shift >= n) {
                    do {
                        shift -= n;
                    } while ((shift >= n) || (shift < 0));
                }
                
                arr2[shift] = arr[i];
            }
        } else {
            arr2 = arr;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i]);
            
            if (i < (n - 1)) {
                System.out.print(" ");
            }
        }
        
        System.out.println();
        
        input.close();
    }
}
