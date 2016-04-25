package com.softuni.jse.coding101;

public class TriangleOf55Stars {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            String asterisks = new String(new char[i]).replace("\0", "*");
            System.out.println(asterisks);
        }
    }
}
