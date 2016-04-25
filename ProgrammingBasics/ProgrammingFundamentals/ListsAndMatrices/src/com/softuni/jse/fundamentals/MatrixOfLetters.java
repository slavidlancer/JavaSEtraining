package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class MatrixOfLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = Integer.parseInt(input.nextLine());
        int cols = Integer.parseInt(input.nextLine());
        char[][] matrix = new char[rows][cols];
        char letter = 'A';
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = letter++;
            }
        }
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols - 1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            
            System.out.println(matrix[row][cols - 1]);
        }
        
        input.close();
    }
}
