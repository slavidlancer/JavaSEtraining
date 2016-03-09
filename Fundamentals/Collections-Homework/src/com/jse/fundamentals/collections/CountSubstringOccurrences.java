package com.jse.fundamentals.collections;

import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter text: ");
        String textLine = input.nextLine().toLowerCase();
        System.out.print("enter substring to look for = ");
        String substringToLookFor = input.nextLine().trim().toLowerCase();
        int countOfOccurences = 0;
        int index = 0;
        
        while ((index = textLine.indexOf(substringToLookFor, index)) != -1) {
            countOfOccurences++;
            index++;
        }
        
        System.out.println("result: count of the substring '" +
                substringToLookFor + "' = " + countOfOccurences);
        
        input.close();
    }
}
