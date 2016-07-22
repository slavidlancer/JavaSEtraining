package com.jse.codility.lessons.arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int sizeA = A.length;
        int K = 5;
        
        System.out.print("A:");
        for (int i = 0; i < sizeA; i++) {
            System.out.print(" " + A[i]);
        }
        
        int[] B = new CyclicRotation().rotateCyclic(A, K);
        int sizeB = B.length;
        
        System.out.print("\nB:");
        for (int i = 0; i < sizeB; i++) {
            System.out.print(" " + B[i]);
        }
    }
    
    public int[] rotateCyclic(int[] A, int K) {
        int size = A.length;
        
        if (size <= 1) {
            return A;
        }
        
        int[] B = new int[size];
        
        for (int i = 0; i < size; i++) {
            int shift = i + K;
            
            if (shift >= size) {
                do {
                    shift -= size;
                } while ((shift >= size) || (shift < 0));
            }
            
            B[shift] = A[i];
        }
        
        return B;
    }
}
