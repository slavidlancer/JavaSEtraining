package com.softuni.jse.fundamentals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        List<BigDecimal> numbers = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            numbers.add(input.nextBigDecimal());
        }
        
        BigDecimal sum = numbers.stream().reduce(
                BigDecimal.ZERO, BigDecimal::add);
        
        /*double sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += Double.parseDouble(input.nextLine());
        }*/
        
        System.out.println(sum);
        
        input.close();
    }
}
