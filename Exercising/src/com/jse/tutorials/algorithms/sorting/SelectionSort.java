package com.jse.tutorials.algorithms.sorting;

import java.util.Scanner;

public class SelectionSort {
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
        int minIndex = 0;
        boolean newMinFound = false; //improvement
        
        if (last <= 1) {
            return;
        }
        
        if (first == last) {
            return;
        }
        
        for (int i = first; i < (last - 1); i++) {
            minIndex = i;
            
            for (int j = (i + 1); j < last; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    newMinFound = true; //improvement
                }
            }
            
            //improvement
            if (newMinFound) {
                swap(arr, i, minIndex);
            }
            
            newMinFound = false; //improvement
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
