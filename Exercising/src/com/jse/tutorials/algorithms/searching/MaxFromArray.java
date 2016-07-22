package com.jse.tutorials.algorithms.searching;

import java.util.Scanner;

public class MaxFromArray {
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
        
        System.out.println(findMaxFromArray(arr));
        
        input.close();
    }

    private static int findMaxFromArray(int[] arr) {
        int max = arr[0];
        int size = arr.length;
        
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
}
