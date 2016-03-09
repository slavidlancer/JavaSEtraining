package com.jse.fundamentals.collections;

import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("strings on 1 line, space separator:");
        String inputLine = input.nextLine();
        
        String[] strings = inputLine.split(" ");
        int currentSequenceStartIndex = 0;
        int currentSequenceLength = 1;
        int bestSequenceStartIndex = 0;
        int bestSequenceLength = 1;
        
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].equals(strings[i - 1])) {
                currentSequenceLength++;
            } else {
                currentSequenceLength = 1;
                currentSequenceStartIndex = i;
            }
            
            if (currentSequenceLength > bestSequenceLength) {
                bestSequenceLength = currentSequenceLength;
                bestSequenceStartIndex = currentSequenceStartIndex;
            }
        }
        
        System.out.println("\nresult:");
        System.out.print(strings[bestSequenceStartIndex]);
        
        for (int i = bestSequenceStartIndex + 1;
                i < bestSequenceStartIndex + bestSequenceLength; i++) {
            System.out.print(" " + strings[i]);
        }
        
        input.close();
    }
}
