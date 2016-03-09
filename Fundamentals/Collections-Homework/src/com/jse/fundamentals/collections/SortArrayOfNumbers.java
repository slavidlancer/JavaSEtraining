package com.jse.fundamentals.collections;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("n = ");
        int numbersSize = input.nextInt();
        
        int[] numbers = new int[numbersSize];
        
        for (int i = 0; i < numbersSize; i++) {
            System.out.printf("number[%d] = ", i);
            numbers[i] = input.nextInt();
        }
        
        Arrays.sort(numbers);
        
        System.out.println("%nsorted: ");
        
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        input.close();
    }
}
