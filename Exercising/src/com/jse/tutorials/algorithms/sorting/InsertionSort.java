package com.jse.tutorials.algorithms.sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i +"] = ");
            arr[i] = input.nextInt();
        }
        
        /*for (int i = 0; i < n; i++) {
            System.out.println("array[" + i +"] = " + arr[i]);
        }*/
        
        sortArray(arr, 0, arr.length);
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            System.out.println("array[" + i +"] = " + arr[i]);
        }
        
        input.close();
    }

    private static void sortArray(int[] arr, int first, int last) {
        if (last <= 1) {
            return;
        }
        
        for (int i = 1; i < last; i++) {
            for (int j = i; j > first; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, (j - 1));
                }
            }
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
