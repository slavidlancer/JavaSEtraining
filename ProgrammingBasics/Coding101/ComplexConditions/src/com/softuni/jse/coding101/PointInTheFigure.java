package com.softuni.jse.coding101;

import java.util.Scanner;

public class PointInTheFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = Integer.parseInt(input.nextLine());
        int x = Integer.parseInt(input.nextLine());
        int y = Integer.parseInt(input.nextLine());
        
        if ((x >= 0) && (x <= 3 * h) && (y >= 0) && (y <= h)) {
            if ((x > 0) && (x < 3 * h) && (y > 0) && (y < h)) {
                System.out.println("inside");
            } else if ((x > h) && (x < 2 * h) && (y == h)) {
                System.out.println("inside");
            } else {
                System.out.println("border");
            }
        } else if ((x >= h) && (x <= 2 * h) && (y >= h) && (y <= 4 * h)) {
            if ((x > h) && (x < 2 * h) && (y > h) && (y < 4 * h)) {
                System.out.println("inside");
            } else if ((x > h) && (x < 2 * h) && (y == h)) {
                System.out.println("inside");
            } else {
                System.out.println("border");
            }
        } else {
            System.out.println("outside");
        }
        
        input.close();
    }
}
