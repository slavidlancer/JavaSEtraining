package com.softuni.jse.coding101;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstTime = Integer.parseInt(input.nextLine());
        int secondTime = Integer.parseInt(input.nextLine());
        int thirdTime = Integer.parseInt(input.nextLine());
        int sumOfTimesInSeconds = firstTime + secondTime + thirdTime;
        
        if ((sumOfTimesInSeconds >= 0) && (sumOfTimesInSeconds < 60)) {
            System.out.print("0:");
            
            if (sumOfTimesInSeconds < 10) {
                System.out.println("0" + sumOfTimesInSeconds);
            } else {
                System.out.print(sumOfTimesInSeconds);
            }
        }
        
        if ((sumOfTimesInSeconds >= 60) && (sumOfTimesInSeconds < 120)) {
            System.out.print("1:");
            
            int tempTime = sumOfTimesInSeconds - 60;
            
            if (tempTime < 10) {
                System.out.println("0" + tempTime);
            } else {
                System.out.print(tempTime);
            }
        }
        
        if ((sumOfTimesInSeconds >= 120) && (sumOfTimesInSeconds < 179)) {
            System.out.print("2:");
            
            int tempTime = sumOfTimesInSeconds - 120;
            
            if (tempTime < 10) {
                System.out.println("0" + tempTime);
            } else {
                System.out.print(tempTime);
            }
        }
        
        input.close();
    }
}
