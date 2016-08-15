package com.jse.hackerrank.tasks07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomeSnippetsTemplates74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        quickSort(arr);
        
        scanner.close();
    }
    
    private static void quickSort(int[] arr) {
        quickSort(arr, 0, (arr.length - 1));
    }
    
    private static void quickSort(int[] arr, int minIndex, int maxIndex) {
        if (minIndex >= maxIndex) {
            return;
        }
        
        int index = partition(arr, minIndex, maxIndex);
        
        quickSort(arr, minIndex, index - 1);
        quickSort(arr, index + 1, maxIndex);
        
        printArray(arr, minIndex, maxIndex);
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
        
        copy(rightList, arr, (pivotIndex + 1));
        
        return pivotIndex;
    }
    
    private static void copy(List<Integer> list, int[] arr, int minIndex) {
        for (int number : list) {
            arr[minIndex++] = number;
        }
    }
    
    private static void printArray(int[] arr, int minIndex, int maxIndex) {
        for (int i = minIndex; i <= maxIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
}
