package com.softuni.jse.coding101;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.nextLine().toLowerCase();
        String dayOfWeek = input.nextLine().toLowerCase();
        double quantity = Double.parseDouble(input.nextLine());
        double totalPrice = 0;
        boolean isCorrect = false;
        
        if ("saturday".equals(dayOfWeek) || "sunday".equals(dayOfWeek)) {
            if ("banana".equals(fruit)) {
                totalPrice = 2.70 * quantity;
                isCorrect = true;
            } else if ("apple".equals(fruit)) {
                totalPrice = 1.25 * quantity;
                isCorrect = true;
            } else if ("orange".equals(fruit)) {
                totalPrice = 0.90 * quantity;
                isCorrect = true;
            } else if ("grapefruit".equals(fruit)) {
                totalPrice = 1.60 * quantity;
                isCorrect = true;
            } else if ("kiwi".equals(fruit)) {
                totalPrice = 3 * quantity;
                isCorrect = true;
            } else if ("pineapple".equals(fruit)) {
                totalPrice = 5.60 * quantity;
                isCorrect = true;
            } else if ("grapes".equals(fruit)) {
                totalPrice = 4.20 * quantity;
                isCorrect = true;
            } else {
                isCorrect = false;
                System.out.println("error");
            }
        } else if ("monday".equals(dayOfWeek) || "tuesday".equals(dayOfWeek) ||
                "wednesday".equals(dayOfWeek) || "thursday".equals(dayOfWeek)
                || "friday".equals(dayOfWeek)) {
            if ("banana".equals(fruit)) {
                totalPrice = 2.50 * quantity;
                isCorrect = true;
            } else if ("apple".equals(fruit)) {
                totalPrice = 1.20 * quantity;
                isCorrect = true;
            } else if ("orange".equals(fruit)) {
                totalPrice = 0.85 * quantity;
                isCorrect = true;
            } else if ("grapefruit".equals(fruit)) {
                totalPrice = 1.45 * quantity;
                isCorrect = true;
            } else if ("kiwi".equals(fruit)) {
                totalPrice = 2.70 * quantity;
                isCorrect = true;
            } else if ("pineapple".equals(fruit)) {
                totalPrice = 5.50 * quantity;
                isCorrect = true;
            } else if ("grapes".equals(fruit)) {
                totalPrice = 3.85 * quantity;
                isCorrect = true;
            } else {
                isCorrect = false;
                System.out.println("error");
            }
        } else {
            isCorrect = false;
            System.out.println("error");
        }
        
        if (isCorrect) {
            System.out.printf("%.2f", totalPrice);
        }
        
        input.close();
    }
}
