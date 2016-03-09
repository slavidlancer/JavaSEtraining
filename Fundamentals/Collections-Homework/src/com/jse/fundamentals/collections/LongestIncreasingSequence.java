package com.jse.fundamentals.collections;

import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("numbers on 1 line, space separator:");
        String[] inputLine = input.nextLine().split(" ");
        
        int[] numbers = new int[inputLine.length];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputLine[i]);
        }
        
        int currentSequenceStartIndex = 0;
        int currentSequenceLength = 1;
        int bestSequenceStartIndex = 0;
        int bestSequenceLength = 1;
        
        System.out.print(" " + numbers[0]);
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                currentSequenceLength++;
                
                System.out.print(" " + numbers[i]);
            } else {
                currentSequenceLength = 1;
                currentSequenceStartIndex = i;
                
                System.out.print("\n " + numbers[i]);
            }
            
            if (currentSequenceLength > bestSequenceLength) {
                bestSequenceLength = currentSequenceLength;
                bestSequenceStartIndex = currentSequenceStartIndex;
            }
        }
        
        System.out.println("\nresult:");
        System.out.print(numbers[bestSequenceStartIndex]);
        
        for (int i = bestSequenceStartIndex + 1;
                i < bestSequenceStartIndex + bestSequenceLength; i++) {
            System.out.print(" " + numbers[i]);
        }
        
        input.close();
    }
}
