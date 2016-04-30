package com.softuni.jse.fundamentals;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split(" ");
        Random random = new Random();
        
        for (int position1 = 0; position1 < words.length; position1++) {
            int position2 = random.nextInt(words.length);
            
            String temp = words[position2];
            words[position2] = words[position1];
            words[position1] = temp;
        }
        
        System.out.println(String.join("\r\n", words));
        
        input.close();
    }
}
