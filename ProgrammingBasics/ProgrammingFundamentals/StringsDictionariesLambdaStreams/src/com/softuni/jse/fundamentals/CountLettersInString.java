package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class CountLettersInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine().toLowerCase();
        int[] counts = new int[Character.MAX_VALUE];
        
        for (int i = 0; i < inputString.length(); i++) {
            char charAt = inputString.charAt(i);
            counts[charAt]++;
        }
        
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) i + " -> " + counts[i]);
            }
        }
        
        /*int[] alphabetArray = new int[26];
        
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            int value = ch;
            
            if ((value >= 97) && (value <= 122)) {
                alphabetArray[ch - 'a']++;
            }
        }
        
        for (int i = 0; i < alphabetArray.length; i++) {
            if (alphabetArray[i] > 0) {
                char ch = (char) (i + 97);
                
                System.out.println(ch + " -> " + alphabetArray[i]);
            }
        }*/
        
        input.close();
    }
}
