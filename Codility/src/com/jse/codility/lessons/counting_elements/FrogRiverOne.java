package com.jse.codility.lessons.counting_elements;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        //int[] A = {5, 5, 8, 6, 7, 4, 5, 4};
        //int[] A = {1};
        //int[] A = {50000, 1};
        //int[] A = {100000};
        //int X = 1;
        int X = 5;
        //int X = 3;
        //int X = 10;
        //int X = 50000;
        //int X = 100000;
        
        int second = new FrogRiverOne().getEarliestTime(X, A);
        
        System.out.println(second);
    }

    private int getEarliestTime(int X, int[] A) {
        int size = A.length;
        int count[] = new int[100000 + 1];
        int sum = X * (X + 1) / 2;
        int check_sum = 0;
        
        if ((size == 1) && (X == 1)) {
            if (A[0] == X) {
                return 0;
            } else {
                return -1;
            }
        }
        
        for (int i = 0; i < size; i++) {
            if (count[A[i]] == 0) {
                count[A[i]] += 1;
                check_sum += A[i];
                
                if (check_sum == sum) {
                    return i;
                }
            }
        }
        
        return -1;
    }
}
