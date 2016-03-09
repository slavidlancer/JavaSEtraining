package com.jse.fundamentals.collections;

import java.util.Scanner;
import java.util.TreeSet;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the text: ");
        String inputLine = input.nextLine();
        
        String[] words = inputLine.split("[^a-zA-Z]+");
        
        TreeSet<String> uniqueWords = new TreeSet<>();
        
        for (String word : words) {
            if (!word.equals("")) {
                uniqueWords.add(word.toLowerCase());
            }
        }
        
        for (String string : uniqueWords) {
            System.out.print(string + " ");
        }
        
        input.close();
    }
}
