package com.softuni.jse.coding101;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String year = input.nextLine();
        int p = Integer.parseInt(input.nextLine());
        int h = Integer.parseInt(input.nextLine());
        int weekendsSofia = 48 - h;
        double holidayPlays = (p * 2) / (double) 3;
        double hometownPlays = h;
        double sofiaPlays = (weekendsSofia * 3) / (double) 4;
        double allPlays = holidayPlays + hometownPlays + sofiaPlays;
        
        if ("leap".equals(year)) {
            allPlays += (0.15 * allPlays);
        }
        
        System.out.println((int) allPlays);
        
        input.close();
    }
}
