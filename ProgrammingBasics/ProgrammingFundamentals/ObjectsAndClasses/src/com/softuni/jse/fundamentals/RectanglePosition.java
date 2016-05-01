package com.softuni.jse.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class RectanglePosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle1 = readRectangle(input);
        Rectangle rectangle2 = readRectangle(input);
        
        System.out.println(rectangle1.isInside(rectangle2) ? "Inside" :
                "Not inside");
        
        input.close();
    }
    
    private static Rectangle readRectangle(Scanner input) {
        Rectangle rectangle = null;
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).
                map(String::trim).mapToInt(Integer::parseInt).toArray();
        int left = numbers[0];
        int top = numbers[1];
        int width = numbers[2];
        int height = numbers[3];
        rectangle = new Rectangle(left, top, width, height);
        
        return rectangle;
    }
}
