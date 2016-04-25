package com.softuni.jse.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).
                map(String::trim).mapToInt(Integer::parseInt).toArray();
        
        for (int i = 0; i < (numbers.length / 2); i++) {
            swapElements(numbers, i, numbers.length - 1 - i);
        }
        
        String numbersAll = Arrays.toString(numbers).replace(", ", " ");
        numbersAll = numbersAll.substring(1, numbersAll.length() - 1);
        System.out.println(numbersAll);
        
        input.close();
    }

    private static void swapElements(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
