package com.tutorials.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
    private static void sortByMergeSort(int[] arr, int first, int last) {
        if (first >= last) {
            return;
        }
        
        int mid = (first + last) / 2;
        
        sortByMergeSort(arr, first, mid);
        sortByMergeSort(arr, mid + 1, last);
        
        merge(arr, first, last);
    }
    
    private static void merge(int[] arr, int first, int last) {
        int[] temp = new int[last - first + 1];
        int mid = (first + last) / 2;
        int i = first;
        int j = mid + 1;
        int k = 0;
        
        while (i <= mid && j <= last) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        while (j <= last) {
            temp[k++] = arr[j++];
        }
        
        for (i = first; i <= last; i++) {
            arr[i] = temp[i - first];
        }
    }

    public static void main(String[] args) {
        int[] arrayToBeSorted = new int[] {38, 27, 43, 3, 9, 82, 10};
        int size = arrayToBeSorted.length;
        
        System.out.println(Arrays.toString(arrayToBeSorted));
        
        sortByMergeSort(arrayToBeSorted, 0, size - 1);
        
        System.out.println(Arrays.toString(arrayToBeSorted));
    }
}
