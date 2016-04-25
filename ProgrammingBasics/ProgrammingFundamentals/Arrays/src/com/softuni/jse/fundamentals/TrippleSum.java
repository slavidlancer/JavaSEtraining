package com.softuni.jse.fundamentals;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TrippleSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] numbers = IntStream.of(Arrays.stream(input.nextLine().
                split(" ")).map(String::trim).mapToInt(Integer::parseInt).
                toArray()).boxed().toArray(Integer[]::new);
        boolean doesNotContainSum = true;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
              int a = numbers[i];
              int b = numbers[j];
              Integer sum = a + b;
              
              boolean containsSum = Arrays.stream(numbers).anyMatch(
                      sum::equals);
              
              if (containsSum) {
                  doesNotContainSum = false;
                  System.out.printf("%d + %d == %d\n", a, b, sum);
              }
            }
        }
        
        if (doesNotContainSum) {
            System.out.println("No");
        }
        
        input.close();
    }
}
