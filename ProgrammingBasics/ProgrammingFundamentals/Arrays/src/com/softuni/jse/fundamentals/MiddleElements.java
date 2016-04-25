package com.softuni.jse.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class MiddleElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).
                map(String::trim).mapToInt(Integer::parseInt).toArray();
        
        int[] middle = extractMiddleElements(numbers);
        String numbersMiddle = Arrays.toString(middle).replace(", ", " ");
        numbersMiddle = numbersMiddle.substring(1, numbersMiddle.length() - 1);
        System.out.println(numbersMiddle);
        
        input.close();
    }

    private static int[] extractMiddleElements(int[] numbers) {
        int n = numbers.length;
        int start = (n / 2) - 1;
        int end = start + 2;
        
        if (n == 1) {
            start = end = 0;
        } else if (n % 2 == 0) {
            end--;
        }
        
        int[] middle = new int[end - start + 1];
        int temp = start;
        
        for (int i = 0; i < middle.length; i++) {
            if (temp <= end) {
                middle[i] = numbers[temp];
                temp++;
            }
        }
        
        return middle;
    }
}
