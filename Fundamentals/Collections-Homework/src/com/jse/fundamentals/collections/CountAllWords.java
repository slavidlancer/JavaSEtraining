package com.jse.fundamentals.collections;

import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter words: ");
        String inputLine = input.nextLine();
        String[] words = inputLine.split("\\W+");
        int countOfWords = words.length;
        
        System.out.println("result: count of words = " + countOfWords);
        
        input.close();
    }
}
