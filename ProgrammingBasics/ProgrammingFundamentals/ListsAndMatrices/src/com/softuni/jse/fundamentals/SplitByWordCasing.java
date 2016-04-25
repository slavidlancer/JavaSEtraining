package com.softuni.jse.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SplitByWordCasing {
    private static List<String> lowerCaseWords = new ArrayList<>();
    private static List<String> upperCaseWords = new ArrayList<>();
    private static List<String> mixedCaseWords = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] words = Arrays.asList(
                line.split("[,;:.! \\[\\]\\\\/()\'\"]+")).stream().
                filter(s -> !s.isEmpty()).collect(Collectors.toList()).
                toArray(new String[0]);
        
        for (String word : words) {
            processWord(word);
        }
        
        System.out.print("Lower-case: ");
        printWords(lowerCaseWords);
        
        System.out.print("Mixed-case: ");
        printWords(mixedCaseWords);
        
        System.out.print("Upper-case: ");
        printWords(upperCaseWords);
        
        input.close();
    }

    private static void processWord(String word) {
        int lowerCaseChars = 0;
        int upperCaseChars = 0;
        
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                lowerCaseChars++;
            } else if (Character.isUpperCase(word.charAt(i))) {
                upperCaseChars++;
            }
        }
        
        if (lowerCaseChars == word.length()) {
            lowerCaseWords.add(word);
        } else if (upperCaseChars == word.length()) {
            upperCaseWords.add(word);
        } else {
            mixedCaseWords.add(word);
        }
    }

    private static void printWords(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i));
            
            if ((i >= 0) && (i != words.size() - 1)) {
                System.out.print(", ");
            }
        }
        
        System.out.println();
    }
}
