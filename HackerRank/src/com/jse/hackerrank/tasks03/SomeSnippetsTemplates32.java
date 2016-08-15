package com.jse.hackerrank.tasks03;

public class SomeSnippetsTemplates32 {
    public static void main(String[] args) {
        int rowSize = 3;
        int colSize = 5;
        int[][] arr2D = new int[rowSize][colSize];
        int count = 0;
        
        for (int i = 0; i < arr2D.length; i++) { //rowSize
            for (int j = 0; j < arr2D[0].length; j++) { //colSize
                arr2D[i][j] = count;
                
                count++;
            }
        }
        
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(arr2D[i][j]);
                
                if (j < (colSize - 1)) {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}
