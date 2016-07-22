package com.jse.codility.test;

import java.util.Arrays;

public class MinValueInBothArrays {
    public static void main(String[] args) {
        /*int[] A = {1, 3, 2, 1};
        int[] B = {4, 2, 5, 3, 2};*/
        
        int[] A = {3, 2};
        int[] B = {1, 1, 1, 1, 1, 3, 3, 3, 2};
        
        /*int[] A = {2, 1};
        int[] B = {3, 3};*/
        
        /*int[] A = {10000, 0};
        int[] B = {10000, 10000};*/
        
        /*int[] A = {1, 2, 3, 4, 0};
        int[] B = {0};*/
        
        int minValue = new MinValueInBothArrays().getMinValueInBothArrays(A, B);
        
        System.out.println(minValue);
    }
    
    int getMinValueInBothArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        Arrays.sort(B);
        System.out.println(Arrays.toString(B));
        int i = 0;
        
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && B[i] < A[k])
                i += 1;
            
            if (Arrays.binarySearch(B, A[k]) != -1)
                return A[k];
        }
        
        return -1;
    }
}
