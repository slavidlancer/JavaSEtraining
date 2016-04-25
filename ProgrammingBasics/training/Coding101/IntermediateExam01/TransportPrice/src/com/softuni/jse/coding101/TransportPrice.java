package com.softuni.jse.coding101;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String timeOfDay = input.nextLine();
        double initialPrice = 0;
        double additionalPrice = 0;
        double totalPrice = 0;
        boolean isDay = false;
        
        if ("day".equals(timeOfDay)) {
            isDay = true;
        } else if ("night".equals(timeOfDay)) {
            isDay = false;
        }
        
        if (n < 20) {
            initialPrice = 0.70;
            additionalPrice = isDay ? 0.79 : 0.90;
        } else if ((n >= 20) && (n < 100)) {
            initialPrice = 0;
            additionalPrice = 0.09;
        } else if (n >= 100) {
            initialPrice = 0;
            additionalPrice = 0.06;
        }
        
        totalPrice = initialPrice + (n * additionalPrice);
        
        System.out.printf("%.2f", totalPrice);
        
        input.close();
    }
}
