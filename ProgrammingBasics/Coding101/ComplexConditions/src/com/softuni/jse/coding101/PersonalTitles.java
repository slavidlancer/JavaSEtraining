package com.softuni.jse.coding101;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double age = Double.parseDouble(input.nextLine());
        String gender = input.nextLine();
        
        if (age < 16) {
            if ("m".equals(gender)) {
                System.out.println("Mister");
            } else if ("f".equals(gender)) {
                System.out.println("Miss");
            }
        } else {
            if ("m".equals(gender)) {
                System.out.println("Mr.");
            } else if ("f".equals(gender)) {
                System.out.println("Ms.");
            }
        }
        
        input.close();
    }
}
