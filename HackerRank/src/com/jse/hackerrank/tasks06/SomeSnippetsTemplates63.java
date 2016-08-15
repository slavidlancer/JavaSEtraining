package com.jse.hackerrank.tasks06;

import java.util.Scanner;

public class SomeSnippetsTemplates63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        insertionSortPart2(arr);
        printArray(arr);
        
        scanner.close();
    }
    
    private static void insertionSortPart2(int[] arr) {
        int size = arr.length;
        int countOfShifts = 0;
        
        if (size <= 1) {
            return;
        }
        
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, (j - 1));
                    
                    countOfShifts++;
                }
            }
        }
        
        System.out.println(countOfShifts);
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        
        System.out.println();
    }
}
