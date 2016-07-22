package com.jse.codility.lessons.sorting;

import java.util.Arrays;

public class Distinct {
    public static void main(String[] args) {
        int[] A = {2, 1, 1, 2, 3, 1};
        //int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        //int[] A = {5, 5, 8, 6, 7, 4, 5, 4};
        //int[] A = {1};
        //int[] A = {50000, 1};
        //int[] A = {100000};
        //int[] A = {};
        
        int number = new Distinct().getDistinctValues(A);
        
        System.out.println(number);
    }

    private int getDistinctValues(int[] A) {
        int size = A.length;
        int count = 0;
        
        if (size == 0) {
            return count;
        }
        
        count++;
        
        if (size == 1) {
            return count;
        }
        
        Arrays.sort(A);
        
        for (int i = 1; i < size; i++) {
            if (A[i] != A[i - 1]) {
                count++;
            }
        }
        
        return count;
    }
}
