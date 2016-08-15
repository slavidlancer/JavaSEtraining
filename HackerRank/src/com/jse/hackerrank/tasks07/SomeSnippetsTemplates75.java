package com.jse.hackerrank.tasks07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomeSnippetsTemplates75 {
    private static int insertionSortShifts = 0;
    private static int quickSortSwaps = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            arr2[i] = arr[i];
        }
        
        insertionSort(arr);
        quickSort(arr2);
        System.out.println(SomeSnippetsTemplates75.insertionSortShifts);
        System.out.println(SomeSnippetsTemplates75.quickSortSwaps);
        int stepsDifference = SomeSnippetsTemplates75.insertionSortShifts -
                SomeSnippetsTemplates75.quickSortSwaps;
        
        System.out.println(stepsDifference);
        
        scanner.close();
    }
    
    private static void quickSort(int[] arr) {
        quickSort(arr, 0, (arr.length - 1));
        
        SomeSnippetsTemplates75.quickSortSwaps++;
    }
    
    private static void quickSort(int[] arr, int minIndex, int maxIndex) {
        if (minIndex >= maxIndex) {
            return;
        }
        
        int index = partition(arr, minIndex, maxIndex);
        
        quickSort(arr, minIndex, index - 1);
        quickSort(arr, index + 1, maxIndex);
    }
    
    private static int partition(int[] arr, int minIndex, int maxIndex) {
        int pivot = arr[minIndex];
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        
        for (int i = minIndex + 1; i <= maxIndex; i++) {
            if (arr[i] > pivot) {
                rightList.add(arr[i]);
            } else {
                leftList.add(arr[i]);
            }
        }
        
        copy(leftList, arr, minIndex);
        
        int pivotIndex = leftList.size() + minIndex;
        arr[pivotIndex] = pivot;
        
        SomeSnippetsTemplates75.quickSortSwaps =
                SomeSnippetsTemplates75.quickSortSwaps + leftList.size();
        
        copy(rightList, arr, (pivotIndex + 1));
        
        return pivotIndex;
    }
    
    private static void copy(List<Integer> list, int[] arr, int minIndex) {
        for (int number : list) {
            arr[minIndex++] = number;
        }
    }
    
    private static void insertionSort(int[] arr) {
        int size = arr.length;
        
        if (size <= 1) {
            return;
        }
        
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, (j - 1));
                    
                    SomeSnippetsTemplates75.insertionSortShifts++;
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
