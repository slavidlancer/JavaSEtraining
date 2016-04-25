package com.softuni.jse.coding101;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String product = input.nextLine().toLowerCase();
        String town = input.nextLine().toLowerCase();
        double quantity = Double.parseDouble(input.nextLine());
        double price = 0;
        
        if ("sofia".equals(town)) {
            if ("coffee".equals(product)) {
                price = quantity * 0.50;
            } else if ("water".equals(product)) {
                price = quantity * 0.80;
            } else if ("beer".equals(product)) {
                price = quantity * 1.20;
            } else if ("sweets".equals(product)) {
                price = quantity * 1.45;
            } else if ("peanuts".equals(product)) {
                price = quantity * 1.60;
            }
        } else if ("varna".equals(town)) {
            if ("coffee".equals(product)) {
                price = quantity * 0.45;
            } else if ("water".equals(product)) {
                price = quantity * 0.70;
            } else if ("beer".equals(product)) {
                price = quantity * 1.10;
            } else if ("sweets".equals(product)) {
                price = quantity * 1.35;
            } else if ("peanuts".equals(product)) {
                price = quantity * 1.55;
            }
        } else if ("plovdiv".equals(town)) {
            if ("coffee".equals(product)) {
                price = quantity * 0.40;
            } else if ("water".equals(product)) {
                price = quantity * 0.70;
            } else if ("beer".equals(product)) {
                price = quantity * 1.15;
            } else if ("sweets".equals(product)) {
                price = quantity * 1.30;
            } else if ("peanuts".equals(product)) {
                price = quantity * 1.50;
            }
        }
        
        System.out.printf("%.4f", price);
        
        input.close();
    }
}
