package com.jse.hackerrank.tasks08;

import java.util.Scanner;

public class SomeSnippetsTemplates86 {
    //private static int[] arr;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n]; //arr = new int[n];
        int numberOfSwaps = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                    //swap(arr[j], arr[j + 1]); //wrong
                    
                    numberOfSwaps++;
                }
            }
            
            if (numberOfSwaps == 0) {
                break;
            }
        }
        
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[n - 1]);
        
        scanner.close();
    }
    
    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
    
    /* wrong
    private static void swap(int arr1, int arr2) {
        int temp = arr1;
        arr1 = 2;
        arr2 = temp;
    }*/
}
