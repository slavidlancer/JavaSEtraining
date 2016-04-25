package com.softuni.jse.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).
                map(String::trim).mapToInt(Integer::parseInt).toArray();
        List<Integer> numbersList = new ArrayList<>();
        
        for (int number : numbers) {
            if (number >= 0) {
                numbersList.add(number);
            }
        }
        
        Collections.reverse(numbersList);
        
        for (Integer number : numbersList) {
            System.out.print(number);
            
            if (numbersList.size() > 0) {
                System.out.print(" ");
            }
        }
        
        if (numbersList.isEmpty()) {
            System.out.println("empty");
        }
        
        input.close();
    }
}
