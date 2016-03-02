package com.jse;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number of strings: ");
        int numberOfStrings = input.nextInt();
        String[] arrayToSort = new String[numberOfStrings];
        
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
