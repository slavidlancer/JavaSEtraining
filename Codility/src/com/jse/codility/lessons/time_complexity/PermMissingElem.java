package com.jse.codility.lessons.time_complexity;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        
        int missingElement = new PermMissingElem().findMissingElement(A);
        
        System.out.println(missingElement);
    }
    
    public int findMissingElement(int[] A) {
        int size = A.length;
        
        if (size == 0) {
            return 1;
        }
        
        Arrays.sort(A);
        
        if (A[0] != 1) {
            return 1;
        }
        
        int value = A[0];
        
        for (int i = 1; i < size; i++) {
            if ((A[i] - value) > 1) {
                value = A[i] - 1;
                
                return value;
            }
            
            value = A[i];
        }
        
        return (A[size - 1] + 1);
    }
}
