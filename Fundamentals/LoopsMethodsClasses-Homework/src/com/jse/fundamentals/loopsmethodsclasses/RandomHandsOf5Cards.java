package com.jse.fundamentals.loopsmethodsclasses;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class RandomHandsOf5Cards {
    public static void main(String[] args) {
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
                "Q", "K", "A"};
        String[] suits = {"\u2660", "\u2665", "\u2666", "\u2663"};
        Scanner input = new Scanner(System.in);
        System.out.print("hands = ");
        int numberOfHands = input.nextInt();
        Random rand = new Random();
        System.out.println("\nresult:");
        
        for (int i = 0; i < numberOfHands; i++) {
            HashSet<String> hand = new HashSet<>();
            
            while (hand.size() < 5) {
                String face = faces[rand.nextInt(13)];
                String suit = suits[rand.nextInt(4)];
                
                hand.add(face + suit);
            }
            
            for (String card : hand) {
                System.out.print(card + " ");
            }
            
            System.out.println();
        }
        
        input.close();
    }
}
