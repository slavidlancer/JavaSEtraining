package com.jse.codility.example_test;

import java.util.Arrays;

public class BugfixingLeader {
    public static void main(String[] args) {
        //int[] A = {4, 2, 2, 3, 2, 4, 2, 2, 6, 4};
        int[] A = {1, 1, 1, 50, 1};
        
        int leader = getLeader(A);
        
        System.out.println(leader);
    }

    private static int getLeader(int[] A) {
        int sizeA = A.length;
        int[] L = new int[sizeA + 1];
        int sizeL = L.length;
        L[0] = -1;
        
        for (int i = 0; i < sizeA; i++) {
            L[i + 1] = A[i];
        }
        
        Arrays.sort(L);
        
        int count = 0;
        int position = (sizeA + 1) / 2;
        int candidate = L[position];
        
        for (int i = 1; i < sizeL; i++) {
            if (L[i] == candidate) {
                count++;
            }
        }
        
        if ((2 * count) > sizeA) { //fixed here
            return candidate;
        }
        
        return -1;
    }
}
