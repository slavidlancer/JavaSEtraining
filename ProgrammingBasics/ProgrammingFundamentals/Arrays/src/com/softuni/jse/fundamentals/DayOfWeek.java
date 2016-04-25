package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] days = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"
        };
        
        int day = Integer.parseInt(input.nextLine());
        
        if ((day >= 1) && (day <= 7)) {
           System.out.println(days[day - 1]);
        } else {
           System.out.println("Invalid day!");
        }
        
        input.close();
    }
}
