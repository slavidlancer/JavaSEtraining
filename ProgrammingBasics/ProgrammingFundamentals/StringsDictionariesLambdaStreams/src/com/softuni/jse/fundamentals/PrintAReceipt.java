package com.softuni.jse.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAReceipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = Arrays.stream(input.nextLine().split(" ")).
                map(String::trim).mapToDouble(Double::parseDouble).toArray();
        double sum = Arrays.stream(numbers).sum();
        
        System.out.println("/----------------------\\");
        
        for (double number : numbers) {
            System.out.printf("| %20.2f |\n", number);
        }
        
        System.out.println("|----------------------|");
        System.out.printf("| Total: %13.2f |\n", sum);
        System.out.println("\\----------------------/");
        
        input.close();
    }
}
