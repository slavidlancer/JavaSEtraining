package com.softuni.jse.coding101;

public class RectangleOf10X10Stars {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(new String(new char[10]).replace("\0", "*"));
        }
    }
}
