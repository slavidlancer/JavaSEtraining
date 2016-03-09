package com.jse.fundamentals.collections;

import java.util.Scanner;
import java.util.TreeMap;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        
        System.out.println("enter text: ");
        String inputLine = input.nextLine();
        
        String[] words = inputLine.split("\\W+");
        TreeMap<String, Integer> wordFrequencies = new TreeMap<>();
        int maxOccurences = 0;
        
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i].toLowerCase();
            
            if (!wordFrequencies.containsKey(currentWord)) {
                wordFrequencies.put(currentWord, 1);
            } else {
                wordFrequencies.put(currentWord,
                        (wordFrequencies.get(currentWord) + 1));
            }
            
            int currentCount = wordFrequencies.get(currentWord);
            
            if (currentCount > maxOccurences) {
                maxOccurences = currentCount;
            }
        }
        
        System.out.println("result: ");
        
        for (String word : wordFrequencies.keySet()) {
            if (wordFrequencies.get(word) == maxOccurences) {
                System.out.println(word + " -> " + maxOccurences + " time(s)");
                
                //break;
            }
        }
        
        input.close();
    }
}
