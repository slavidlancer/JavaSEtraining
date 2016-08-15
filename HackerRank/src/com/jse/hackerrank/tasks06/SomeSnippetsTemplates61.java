package com.jse.hackerrank.tasks06;

import java.util.Scanner;

public class SomeSnippetsTemplates61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;
        int tempN = n - 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
                
                if (i == j) {
                    sumFirstDiagonal += arr[i][j];
                }
            }
            
            sumSecondDiagonal += arr[i][tempN];
            tempN--;
        }
        
        int diagonalSumsDifference = Math.abs(sumFirstDiagonal -
                sumSecondDiagonal);
        
        System.out.println(diagonalSumsDifference);
        
        scanner.close();
    }
}
