package com.jse.hackerrank.tasks09;

import java.util.Scanner;

public class SomeSnippetsTemplates93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayReturned = scanner.nextInt();
        int monthReturned = scanner.nextInt();
        int yearReturned = scanner.nextInt();
        int dayDue = scanner.nextInt();
        int monthDue = scanner.nextInt();
        int yearDue = scanner.nextInt();
        long fine = 0;
        
        if (yearReturned > yearDue) {
            fine = 10000;
        } else if (yearReturned == yearDue) {
            if (monthReturned == monthDue) {
                int daysLate = dayReturned - dayDue;
                
                if (daysLate <= 0) {
                    daysLate = 1;
                }
                
                fine = 15 * daysLate;
            } else if (monthReturned > monthDue) {
                int monthsLate = monthReturned - monthDue;
                fine = 500 * monthsLate;
            }
        }
        
        System.out.println(fine);
        
        scanner.close();
    }
}
