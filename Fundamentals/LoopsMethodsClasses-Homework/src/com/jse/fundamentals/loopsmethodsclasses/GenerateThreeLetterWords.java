package com.jse.fundamentals.loopsmethodsclasses;

import java.util.Scanner;

public class GenerateThreeLetterWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("letters = ");
        String inputString = input.nextLine().trim().toLowerCase();
        char[] letters = inputString.toCharArray();

        System.out.println("\nresult:");
        
        for (int ch1 = 0; ch1 < letters.length; ch1++) {
            for (int ch2 = 0; ch2 < letters.length; ch2++) {
                for (int ch3 = 0; ch3 < letters.length; ch3++) {
                    System.out.print(" " + letters[ch1] + letters[ch2] +
                            letters[ch3] + " ");
                }
            }
        }
        
        input.close();
    }
}
