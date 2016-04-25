package com.softuni.jse.coding101;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String projection = input.nextLine().toLowerCase();
        int r = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());
        double ticketPrice = 0;
        double fullHallIncomes = 0;
        
        if ("premiere".equals(projection)) {
            ticketPrice = 12;
        } else if ("normal".equals(projection)) {
            ticketPrice = 7.50;
        } else if ("discount".equals(projection)) {
            ticketPrice = 5;
        }
        
        fullHallIncomes = (double) r * (double) c * ticketPrice;
        
        System.out.printf("%.2f leva", fullHallIncomes);
        
        input.close();
    }
}
