package com.jse.codility.lessons.prefix_sums;

public class PassingCars {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};
        //int[] A = {0};
        //int[] A = {1};
        //int[] A = {0, 1};
        //int[] A = {1, 0};
        //int[] A = {1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0};
        
        int number = new PassingCars().getPairsNumber(A);
        
        System.out.println(number);
    }

    private int getPairsNumber(int[] A) {
        int goingEast = 0;
        int passingCars = 0;
        int size = A.length;
        
        if (size == 1) {
            return 0;
        }
        
        for (int i = 0; i < size; i++) {
            if (A[i] == 0) {
                goingEast++;
            } else {
                passingCars += goingEast;
            }
            
            if (passingCars > 1000000000) {
                return -1;
            }
        }
        
        return passingCars;
    }
}
