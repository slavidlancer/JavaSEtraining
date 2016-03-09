package com.jse.fundamentals.collections;

import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter text: ");
        String inputLine = input.nextLine();
        String[] words = inputLine.split("\\W+");
        System.out.print("enter word to look for = ");
        String wordToLookFor = input.nextLine().trim().toLowerCase();
        int countOfOccurences = 0;
        
        for (String word : words) {
            if (wordToLookFor.equals(word.toLowerCase())) {
                countOfOccurences++;
            }
        }
        
        System.out.println("result: count of the word '" + wordToLookFor +
                "' = " + countOfOccurences);
        
        input.close();
    }
}
