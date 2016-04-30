package com.softuni.jse.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        numbers = Arrays.stream(input.nextLine().split(" ")).
                map(String::trim).mapToDouble(Double::parseDouble).boxed().
                collect(Collectors.toList());
        Map<Double, Integer> counts = new TreeMap<>();
        
        for (Double number : numbers) {
            if (counts.containsKey(number)) {
                int count = counts.get(number);
                counts.put(number, ++count);
            } else {
                counts.put(number, 1);
            }
        }
        
        for (Double number : counts.keySet()) {
            System.out.println(number + " -> " + counts.get(number));
        }
        
        input.close();
    }
}
