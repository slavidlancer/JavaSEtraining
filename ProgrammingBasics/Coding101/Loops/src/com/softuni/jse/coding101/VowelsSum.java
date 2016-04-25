package com.softuni.jse.coding101;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int sum = 0;
        
        for (int i = 0; i < word.length(); i++) {
            if ('a' == word.charAt(i)) {
                sum += 1;
            }
            
            if ('e' == word.charAt(i)) {
                sum += 2;
            }
            
            if ('i' == word.charAt(i)) {
                sum += 3;
            }
            
            if ('o' == word.charAt(i)) {
                sum += 4;
            }
            
            if ('u' == word.charAt(i)) {
                sum += 5;
            }
        }
        
        System.out.println(sum);
        
        input.close();
    }
}