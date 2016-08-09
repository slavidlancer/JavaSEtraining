package com.jse.tutorials.algorithms.sorting;

import java.util.Scanner;

public class QuickSort {
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
        
        sortArray(arr, 0, arr.length - 1);
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            System.out.println("array[" + i +"] = " + arr[i]);
        }
        
        input.close();
    }
    
    private static void sortArray(int[] arr, int low, int high) {
        if (low < high) {
            int middle = partition(arr, low, high);
            
            sortArray(arr, low, middle - 1);
            sortArray(arr, middle + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        
        do {
            while ((low < high) && (arr[high] >= pivot)) {
                high--;
            }
            
            if (low < high) {
                arr[low] = arr[high];
                
                while ((low < high) && (arr[low] <= pivot)) {
                    low++;
                }
                
                if (low < high) {
                    arr[high] = arr[low];
                }
            }
        } while (low < high);
        
        arr[low] = pivot;
        
        return low;
    }
}
