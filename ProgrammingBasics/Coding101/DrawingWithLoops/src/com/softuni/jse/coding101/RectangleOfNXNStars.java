package com.softuni.jse.coding101;

import java.util.Scanner;

public class RectangleOfNXNStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(new String(new char[n]).replace("\0", "*"));
        }
        
        input.close();
    }
}
