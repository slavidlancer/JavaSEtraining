package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class TriplesOfLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        
        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = 0; i2 < n; i2++) {
                for (int i3 = 0; i3 < n; i3++) {
                    char letter1 = (char) ('a' + i1);
                    char letter2 = (char) ('a' + i2);
                    char letter3 = (char) ('a' + i3);
                    
                    System.out.println(letter1 + "" + letter2 + "" + letter3);
                }
            }
        }
        
        input.close();
    }
}
