package com.jse.codility.lessons.arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A = {-5, 1, -5, 1, 1};
        
        int i = new OddOccurrencesInArray().findIndexOfUnpairedElement(A);
        
        System.out.println(i);
    }
    
    public int findIndexOfUnpairedElement(int A[]) {
        int size = A.length;
        int[] B = A.clone();
        Arrays.sort(B);
        
        if (size == 1) {
            return A[0];
        }
        
        int value = B[0];
        int counter = 1;
        
        for (int i = 1; i < size; i++) {
            if (value == B[i]) {
                counter++;
            } else {
                if ((counter == 1) || (counter % 2 == 1)) {
                    int index = findIndexOfValue(A, value);
                    
                    return A[index];
                }
                
                value = B[i];
                counter = 1;
            }
        }
        
        if ((counter == 1) || (counter % 2 == 1)) {
            int index = findIndexOfValue(A, value);
            
            return A[index];
        }
        
        return -1;
    }
    
    private int findIndexOfValue(int[] A, int value) {
        int size = A.length;
        
        for (int i = 0; i < size; i++) {
            if (value == A[i]) {
                return i;
            }
        }
        
        return -1;
    }
}
