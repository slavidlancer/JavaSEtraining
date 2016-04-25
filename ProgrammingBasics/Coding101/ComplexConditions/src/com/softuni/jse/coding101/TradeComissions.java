package com.softuni.jse.coding101;

import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String town = input.nextLine().toLowerCase();
        double sales = Double.parseDouble(input.nextLine());
        double comission = -1;
        
        if ("sofia".equals(town)) {
            if ((0 <= sales) && (sales <= 500)) {
                comission = 0.05 * sales;
            } else if ((500 < sales) && (sales <= 1000)) {
                comission = 0.07 * sales;
            } else if ((1000 < sales) && (sales <= 10000)) {
                comission = 0.08 * sales;
            } else if (sales > 10000) {
                comission = 0.12 * sales;
            }
        } else if ("plovdiv".equals(town)) {
            if ((0 <= sales) && (sales <= 500)) {
                comission = 0.055 * sales;
            } else if ((500 < sales) && (sales <= 1000)) {
                comission = 0.08 * sales;
            } else if ((1000 < sales) && (sales <= 10000)) {
                comission = 0.12 * sales;
            } else if (sales > 10000) {
                comission = 0.145 * sales;
            }
        } else if ("varna".equals(town)) {
            if ((0 <= sales) && (sales <= 500)) {
                comission = 0.045 * sales;
            } else if ((500 < sales) && (sales <= 1000)) {
                comission = 0.075 * sales;
            } else if ((1000 < sales) && (sales <= 10000)) {
                comission = 0.10 * sales;
            } else if (sales > 10000) {
                comission = 0.13 * sales;
            }
        }
        
        if (comission != -1) {
            System.out.printf("%.2f", comission);
        } else {
            System.out.println("error");
        }
        
        input.close();
    }
}
