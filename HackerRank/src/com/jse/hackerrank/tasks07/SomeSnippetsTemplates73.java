package com.jse.hackerrank.tasks07;

import java.util.Scanner;

public class SomeSnippetsTemplates73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int pivot = 0;
        int[] left = new int[n];
        int[] equal = new int[n];
        int[] right = new int[n];
        int leftI = 0;
        int equalI = 0;
        int rightI = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            
            if (i == 0) {
                pivot = arr[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > pivot) {
                right[rightI] = arr[i];
                rightI++;
            } else if (arr[i] < pivot) {
                left[leftI] = arr[i];
                leftI++;
            } else if (arr[i] == pivot) {
                equal[equalI] = arr[i];
                equalI++;
            }
        }
        
        for (int i = 0; i < leftI; i++) {
            System.out.print(left[i] + " ");
        }
        
        for (int i = 0; i < equalI; i++) {
            System.out.print(equal[i] + " ");
        }
        
        for (int i = 0; i < rightI; i++) {
            System.out.print(right[i]);
            
            if (i < (rightI - 1)) {
                System.out.print(" ");
            }
        }
        
        scanner.close();
    }
}
