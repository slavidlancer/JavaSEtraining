package com.jse.codility.lessons.maximum_slice_problem;

public class MaximumSlice {
    public static void main(String[] args) {
        int[] A = {5, -7, 3, 5, -2, 4, -1};
        
        int sum = new MaximumSlice().calculateLargestSumOfSlice(A);
        
        System.out.println(sum);
    }

    private int calculateLargestSumOfSlice(int[] A) {
        int result = 0;
        int size = A.length;
        
        for (int p = 0; p < size; p++) {
            int sum = 0;
            
            for (int q = p; q < size; q++) {
                sum += A[q];
                result = Math.max(result, sum);
            }
        }
        
        return result;
    }
}
