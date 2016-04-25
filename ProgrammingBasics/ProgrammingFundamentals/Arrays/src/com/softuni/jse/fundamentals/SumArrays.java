package com.softuni.jse.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class SumArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers1 = Arrays.stream(input.nextLine().split(" ")).
                map(String::trim).mapToInt(Integer::parseInt).toArray();
        int[] numbers2 = Arrays.stream(input.nextLine().split(" ")).
                map(String::trim).mapToInt(Integer::parseInt).toArray();
        
        int n = Math.max(numbers1.length, numbers2.length);
        int[] sumArray = new int[n];
        
        for (int i = 0; i < n; i++) {
            sumArray[i] = numbers1[i % numbers1.length] +
                    numbers2[i % numbers2.length];
        }
        
        String numbersAll = Arrays.toString(sumArray).replace(", ", " ");
        numbersAll = numbersAll.substring(1, numbersAll.length() - 1);
        System.out.println(numbersAll);
        
        input.close();
    }
}
