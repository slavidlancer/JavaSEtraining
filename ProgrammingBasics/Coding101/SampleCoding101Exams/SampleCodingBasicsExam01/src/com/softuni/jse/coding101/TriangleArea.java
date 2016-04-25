package com.softuni.jse.coding101;

import java.util.Scanner;

public class TriangleArea {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = Integer.parseInt(input.nextLine());
        int y1 = Integer.parseInt(input.nextLine());
        int x2 = Integer.parseInt(input.nextLine());
        int y2 = Integer.parseInt(input.nextLine());
        int x3 = Integer.parseInt(input.nextLine());
        int y3 = Integer.parseInt(input.nextLine());
        
        int a = Math.abs(x2 - x3);
        int h = Math.abs(y2 - y1);
        double s = (double) a * (double) h / 2;
        
        System.out.println(s);
        
        input.close();
    }
}
