package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class OccurrencesInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        String word = input.nextLine().toLowerCase();
        int count = 0;
        int offset = -1;
        
        while (true) {
            offset = text.indexOf(word, offset + 1);
            
            if (offset == -1) {
                break;
            }
            
            count++;
        }
        
        System.out.println("Occurrencies: " + count);
        
        input.close();
    }
}
