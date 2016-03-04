package com.jse.fundamentals.introduction;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number of strings = ");
        int numberOfStrings = Integer.parseInt(input.nextLine());
        String[] arrayToSort = new String[numberOfStrings];
        
        System.out.println(numberOfStrings + " strings: ");
        
        for (int i = 0; i < numberOfStrings; i++) {
            arrayToSort[i] = input.nextLine();
        }
        
        Arrays.sort(arrayToSort);
        
        System.out.println("\nsorted:");
        
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
        
        input.close();
    }
}
