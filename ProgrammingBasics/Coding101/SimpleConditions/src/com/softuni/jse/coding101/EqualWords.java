package com.softuni.jse.coding101;

import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1 = input.nextLine().toLowerCase();
        String word2 = input.nextLine().toLowerCase();
        
        if (word1.equals(word2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
        input.close();
    }
}
