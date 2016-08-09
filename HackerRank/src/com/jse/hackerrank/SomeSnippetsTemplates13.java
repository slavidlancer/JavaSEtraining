package com.jse.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class SomeSnippetsTemplates13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        
        insertionSortPart2(arr);
        System.out.println();
        
        int[] arr2 = Arrays.copyOfRange(arr, 0, size);
        arr2[arr2.length - 1] = (int) Math.PI * 2 - size / 2 - 3;
        System.out.println(Arrays.toString(arr2));
        insertIntoSorted(arr2);
        System.out.println();
        
        int[] arr3 = {0, 9, 8, 1, 7, 6, 2, 4, 3, 5};
        insertionSort(arr3);
        
        input.close();
    }
    
    private static void insertIntoSorted(int[] arr) {
        int size = arr.length;
        int V = arr[size - 1];
        boolean isPlaced = false;
        
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] > V) {
                arr[i + 1] = arr[i];
            } else if (arr[i] <= V) {
                arr[i + 1] = V;
                isPlaced = true;
                
                break;
            }
            
            printArray(arr);
        }
        
        if (!isPlaced) {
            arr[0] = V;
        }
        
        printArray(arr);
    }
    
    private static void insertionSortPart2(int[] arr) {
        int size = arr.length;
        
        if (size <= 1) {
            return;
        }
        
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            
            printArray(arr);
        }
    }
    
    private static void insertionSort(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            int j = i + 1;
            
            while (j > 0) {
                if (A[j] < A[j - 1]) {
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                    
                    j = j - 1;
                } else {
                    break;
                }
            }
        }
        
        printArray(A);
    }

    
    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        
        System.out.println();
    }
}
