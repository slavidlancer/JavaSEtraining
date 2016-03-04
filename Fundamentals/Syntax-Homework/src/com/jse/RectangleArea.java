package com.jse;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int width = input.nextInt();
        long rectangleArea = height * width;
        
        System.out.println(rectangleArea);
        
        input.close();
    }
}
