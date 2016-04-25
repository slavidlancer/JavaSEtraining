package com.softuni.jse.coding101;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String product = input.nextLine();
        String[] fruits = {"banana", "apple", "kiwi", "cherry", "lemon",
                "grapes"};
        String[] vegetables = {"tomato", "cucumber", "pepper", "carrot"};
        boolean isUnknown = false;
        boolean isFruit = false;
        boolean isVegetable = false;
        
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(product)) {
                System.out.println("fruit");
                isUnknown = false;
                isFruit = true;
            } else {
                isUnknown = true;
            }
        }
        
        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i].equals(product)) {
                System.out.println("vegetable");
                isUnknown = false;
                isVegetable = true;
            } else {
                isUnknown = true;
            }
        }
        
        if (isUnknown && !isFruit && !isVegetable) {
            System.out.println("unknown");
        }
        
        input.close();
    }
}
