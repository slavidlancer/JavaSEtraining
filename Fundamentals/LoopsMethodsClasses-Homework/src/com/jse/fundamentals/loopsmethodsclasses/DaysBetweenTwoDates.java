package com.jse.fundamentals.loopsmethodsclasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenTwoDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("start (dd-MM-yyyy) = ");
        String startInput = input.nextLine();
        int startLength = startInput.length();
        
        if (startLength == 9) {
            startInput = "0" + startInput;
        }
        
        System.out.print("end (dd-MM-yyyy) = ");
        String endInput = input.nextLine();
        int endLength = endInput.length();
        
        if (endLength == 9) {
            endInput = "0" + endInput;
        }
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        LocalDate start = LocalDate.parse(startInput, formatter);
        LocalDate end = LocalDate.parse(endInput, formatter);   
        
        long daysBetween = ChronoUnit.DAYS.between(start, end);
        
        System.out.println(daysBetween);
        
        input.close();
    }
}
