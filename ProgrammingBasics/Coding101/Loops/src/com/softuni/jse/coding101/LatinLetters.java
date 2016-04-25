package com.softuni.jse.coding101;

public class LatinLetters {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i);
            
            if ('z' == i) {
                System.out.print(".");
            } else {
                System.out.print(", ");
            }
        }
    }
}
