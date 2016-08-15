package com.jse.hackerrank.tasks06;

//import java.util.Arrays;
import java.util.Scanner;

public class SomeSnippetsTemplates64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] counts = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            
            counts[arr[i]]++;
        }
        
        for (int i = 0; i < 100; i++) {
            System.out.print(counts[i]);
            
            if (i < (n - 1)) {
                System.out.print(" ");
            }
        }
        
        //Arrays.sort(arr);
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            while (counts[i] != 0) {
                System.out.print(i);
                
                if (i < n) {
                    System.out.print(" ");
                }
                
                counts[i]--;
            }
        }
        
        scanner.close();
    }
}
