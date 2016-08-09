package com.jse.tutorials.algorithms.sorting;

//import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
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
        
        sortArray(arr);
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            System.out.println("array[" + i +"] = " + arr[i]);
        }
        
        input.close();
    }
    
    private static void sortArray(int[] arr) {
        int size = arr.length;
        
        if (size > 1) {
            int middle = size / 2;
            
            /*int[] leftArr = Arrays.copyOfRange(arr, 0, middle);
            int[] rightArr = Arrays.copyOfRange(arr, 0, middle);*/
            
            int[] leftArr = copyLeftHalf(arr, middle);
            int[] rightArr = copyRightHalf(arr, middle);
            
            sortArray(leftArr);
            sortArray(rightArr);
            merge(arr, leftArr, rightArr);
        }
    }
    
    private static int[] copyLeftHalf(int[] arr, int middle) {
        int leftSize = middle;
        int[] left = new int[leftSize];
        
        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[i];
        }
        
        return left;
    }
    
    private static int[] copyRightHalf(int[] arr, int middle) {
        int size = arr.length;
        int leftSize = middle;
        int rightSize = size - leftSize;
        int[] right = new int[rightSize];
        
        for (int i = 0; i < rightSize; i++) {
            right[i] = arr[i + middle];
        }
        
        return right;
    }
    
    private static void merge(int[] resultArr, int[] leftArr, int[] rightArr) {
        int leftArrIndex = 0;
        int rightArrIndex = 0;
        int resultArrSize = resultArr.length;
        int leftArrSize = leftArr.length;
        int rightArrSize = rightArr.length;
        
        for (int i = 0; i < resultArrSize; i++) {
            if ((rightArrIndex >= rightArrSize) ||
                    ((leftArrIndex < leftArrSize) &&
                    (leftArr[leftArrIndex] <= rightArr[rightArrIndex]))) {
                resultArr[i] = leftArr[leftArrIndex];
                leftArrIndex++;
            } else {
                resultArr[i] = rightArr[rightArrIndex];
                rightArrIndex++;
            }
        }
    }
}
