package com.softuni.jse.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = Arrays.stream(input.nextLine().split(" ")).
                map(String::trim).mapToDouble(Double::parseDouble).toArray();
        int[] roundedNumbers = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            double numberToRound = numbers[i];
            
            if (numbers[i] - (int) numbers[i] == -0.50) {
                numberToRound -= 0.01;
            } else if (numbers[i] - (int) numbers[i] == 0.50) {
                numberToRound += 0.01;
            }
            
            roundedNumbers[i] = (int) Math.rint(numberToRound);
        }
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " -> " + roundedNumbers[i]);
        }
        
        input.close();
    }
}
