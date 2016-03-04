package com.jse;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("A(x) = ");
        int aX = input.nextInt();
        System.out.print("A(y) = ");
        int aY = input.nextInt();
        System.out.print("B(x) = ");
        int bX = input.nextInt();
        System.out.print("B(y) = ");
        int bY = input.nextInt();
        System.out.print("C(x) = ");
        int cX = input.nextInt();
        System.out.print("C(y) = ");
        int cY = input.nextInt();
        
        double area = 0;
        area += aX * (bY - cY);
        area += bX * (cY - aY);
        area += cX * (aY - bY);
        area /= 2.0;
        area = Math.abs(area);
        
        if (area != 0) {
            System.out.printf("\nArea: %.2f", area);
        } else {
            System.out.printf("\nArea: 0.\nnot a triangle");
        }
        
        input.close();
    }
}
