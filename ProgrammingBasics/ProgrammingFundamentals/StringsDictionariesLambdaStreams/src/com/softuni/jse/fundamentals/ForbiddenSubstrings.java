package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class ForbiddenSubstrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] words = input.nextLine().split(" ");
        
        for (String word : words) {
            text = text.replace(word,
                    new String(new char[word.length()]).replace("\0", "*"));
        }
        
        System.out.println(text);
        
        input.close();
    }
}
