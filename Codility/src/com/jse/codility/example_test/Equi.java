package com.jse.codility.example_test;

public class Equi {
    public static void main(String[] args) {
        int[] A = {-1, 3, -4, 5, 1, -6, 2, 1};
        
        int index = new Equi().getAnyEquilibriumIndex(A);
        
        System.out.println(index);
    }

    private int getAnyEquilibriumIndex(int[] A) {
        int size = A.length;
        
        if (size == 0) {
            return -1;
        }
        
        long sum = 0;
        long left_sum = 0;
        long right_sum = 0;
        
        for (int i = 0; i < size; i++) {
            sum += A[i];
        }
        
        for (int i = 0; i < size; i++) {
            right_sum = sum - left_sum - A[i];
            
            if (left_sum == right_sum) {
                return i;
            }
            
            left_sum += A[i];
        }
        
        return -1;
    }
}
