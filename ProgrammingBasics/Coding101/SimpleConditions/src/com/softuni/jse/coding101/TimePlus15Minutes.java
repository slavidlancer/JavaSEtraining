package com.softuni.jse.coding101;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = Integer.parseInt(input.nextLine());
        int minutes = Integer.parseInt(input.nextLine());
        int newMinutes = minutes + 15;
        
        if (newMinutes > 59) {
            hour++;
            newMinutes -= 60;
            
            if (hour == 24) {
                hour = 0;
            }
        }
        
        System.out.print(hour + ":");
        
        if (newMinutes < 10) {
            System.out.print("0" + newMinutes);
        } else {
            System.out.print(newMinutes);
        }
        
        input.close();
    }
}
