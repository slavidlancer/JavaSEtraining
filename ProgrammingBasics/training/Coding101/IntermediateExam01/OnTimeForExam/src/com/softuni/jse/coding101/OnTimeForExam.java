package com.softuni.jse.coding101;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hourExam = Integer.parseInt(input.nextLine());
        int minutesExam = Integer.parseInt(input.nextLine());
        int hourArrival = Integer.parseInt(input.nextLine());
        int minutesArrival = Integer.parseInt(input.nextLine());
        int timeExam = hourExam * 60 + minutesExam;
        int timeArrival = hourArrival * 60 + minutesArrival;
        int timeDiff = timeArrival - timeExam;
        int hourDiff = 0;
        int minutesDiff = 0;
        
        if (timeDiff > 0) {
            System.out.println("Late");
        } else if ((timeDiff == 0) || (timeDiff >= -30)) {
            System.out.println("On time");
        } else if (timeDiff < -30) {
            System.out.println("Early");
        }
        
        hourDiff = Math.abs(timeDiff / 60);
        minutesDiff = Math.abs(timeDiff % 60);
        
        if (timeDiff != 0) {
            if (hourDiff > 0) {
                if (minutesDiff < 10) {
                    System.out.print(hourDiff + ":0" + minutesDiff +
                            " hours");
                } else {
                    System.out.print(hourDiff + ":" + minutesDiff + " hours");
                }
            } else {
                System.out.print(minutesDiff + " minutes");
            }
            
            if (timeDiff > 0) {
                System.out.print(" after the start");
            } else if (timeDiff < 0) {
                System.out.print(" before the start");
            }
        }
        
        input.close();
    }
}
