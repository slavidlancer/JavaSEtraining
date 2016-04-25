package com.softuni.jse.coding101;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = Integer.parseInt(input.nextLine());
        int area = a * a;
        
        System.out.print("Square = ");
        System.out.println(area);
        
        input.close();
    }
}
