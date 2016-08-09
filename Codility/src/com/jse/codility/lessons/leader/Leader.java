package com.jse.codility.lessons.leader;

import java.util.Arrays;

public class Leader {
    public static void main(String[] args) {
        int[] A = {6, 8, 4, 6, 8, 6, 6};
        
        int leader = new Leader().findLeaderInSequence(A);
        
        System.out.println(leader);
    }

    private int findLeaderInSequence(int[] A) {
        int size = A.length;
        Arrays.sort(A);
        int leader = -1;
        int candidate = A[size / 2];
        int count = 0;
        
        for (int i = 0; i < size; i++) {
            if (A[i] == candidate) {
                count++;
            }
        }
        
        if (count > (size / 2)) {
            leader = candidate;
        }
        
        return leader;
    }
}
