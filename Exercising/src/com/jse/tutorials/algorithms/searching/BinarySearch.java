package com.jse.tutorials.algorithms.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
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
        
        System.out.print("look for element = ");
        int value = input.nextInt();
        Arrays.sort(arr);
        
        for (int i = 0; i < n; i++) {
            System.out.println("array[" + i +"] = " + arr[i]);
        }
        
        int index = searchInArrayForElement(value, arr, 0, arr.length);
        
        if (index != -1) {
            System.out.println("found at : array[" + index +"] = " +
                    arr[index]);
        } else {
            System.out.println("not found");
        }
        
        input.close();
    }

    private static int searchInArrayForElement(int value, int[] arr, int first,
            int last) {
        int index = -1;
        int low = first;
        int high = last - 1;
        int middle = 0;
        
        while (low <= high) {
            middle = (low + high) / 2;
            
            if (value > arr[middle]) {
                low = middle + 1;
            } else if (value < arr[middle]) {
                high = middle - 1;
            } else {
                index = middle;
                
                break;
            }
        }
        
        return index;
    }
}
