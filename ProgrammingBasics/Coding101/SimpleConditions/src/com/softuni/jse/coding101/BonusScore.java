package com.softuni.jse.coding101;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = Integer.parseInt(input.nextLine());
        double bonus = 0;
        
        if (score <= 100) {
            bonus = 5;
        } else if ((score > 100) && (score <= 1000)) {
            bonus = score * 0.20;
        } else if (score > 1000) {
            bonus = score * 0.10;
        }
        
        if (score % 2 == 0) {
            bonus += 1;
        }
        
        if (score % 10 == 5) {
            bonus += 2;
        }
        
        double totalScore = score + bonus;
        
        System.out.println("Bonus score: " + bonus);
        System.out.println("Total score: " + totalScore);
        
        input.close();
    }
}
