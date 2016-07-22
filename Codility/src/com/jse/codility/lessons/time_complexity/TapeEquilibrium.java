package com.jse.codility.lessons.time_complexity;

import java.util.Arrays;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};
        int minDiff = new TapeEquilibrium().calculateMinDiffBetweenParts(A);
        
        System.out.println(minDiff);
    }
    
    public int calculateMinDiffBetweenParts(int[] A) {
        int size = A.length;
        
        if (size <= 1) {
            return 0;
        }
        
        int[] minDiffs = new int[size - 1];
        int index = 0;
        int rightSum = A[size - 1];
        
        for (int i = (size - 2); i > 0; i--) {
            rightSum += A[i];
        }
        
        int leftSum = A[0];
        
        for (int i = 1; i < size; i++) {
            minDiffs[index] = Math.abs(rightSum - leftSum);
            
            rightSum -= A[i];
            leftSum += A[i];
            
            index++;
        }
        
        Arrays.sort(minDiffs);
        
        return minDiffs[0];
    }
}
