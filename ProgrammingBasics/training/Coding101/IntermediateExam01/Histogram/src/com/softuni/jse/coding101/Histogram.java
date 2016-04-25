package com.softuni.jse.coding101;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        int countP1 = 0;
        int countP2 = 0;
        int countP3 = 0;
        int countP4 = 0;
        int countP5 = 0;
        
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(input.nextLine());
            
            if (number < 200) {
                countP1++;
            } else if (number < 400) {
                countP2++;
            } else if (number < 600) {
                countP3++;
            } else if (number < 800) {
                countP4++;
            } else if (number >= 800) {
                countP5++;
            }
        }
        
        p1 = (countP1 * 100) / (double) n;
        p2 = (countP2 * 100) / (double) n;
        p3 = (countP3 * 100) / (double) n;
        p4 = (countP4 * 100) / (double) n;
        p5 = (countP5 * 100) / (double) n;
        
        System.out.printf("%.2f ", p1);
        System.out.print("%\n");
        System.out.printf("%.2f ", p2);
        System.out.print("%\n");
        System.out.printf("%.2f ", p3);
        System.out.print("%\n");
        System.out.printf("%.2f ", p4);
        System.out.print("%\n");
        System.out.printf("%.2f ", p5);
        System.out.print("%\n");
        
        input.close();
    }
}
