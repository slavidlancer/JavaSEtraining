package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class RotateAMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = Integer.parseInt(input.nextLine());
        int cols = Integer.parseInt(input.nextLine());
        String[][] matrix = new String[rows][cols];
        
        for (int row = 0; row < rows; row++) {
            String[] cells = input.nextLine().split(" ");
            
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = cells[col];
            }
        }
        
        for (int col = 0; col < cols; col++) {
            for (int row = rows - 1; row >= 0; row--) {
                System.out.print(matrix[row][col] + " ");
            }
            
            System.out.println();
        }
        
        input.close();
    }
}
