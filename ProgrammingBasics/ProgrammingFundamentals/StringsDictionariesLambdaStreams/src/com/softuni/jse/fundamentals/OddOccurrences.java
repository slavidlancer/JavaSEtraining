package com.softuni.jse.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().toLowerCase().split(" ");
        Map<String, Integer> counts = new LinkedHashMap<>();
        
        for (String word : words) {
            if (counts.containsKey(word)) {
                int count = counts.get(word);
                counts.put(word, ++count);
            } else {
                counts.put(word, 1);
            }
        }
        
        List<String> result = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result.add(entry.getKey());
            }
        }
        
        String printResult = String.join(", ", result);
        
        System.out.println(printResult);
        
        input.close();
    }
}
