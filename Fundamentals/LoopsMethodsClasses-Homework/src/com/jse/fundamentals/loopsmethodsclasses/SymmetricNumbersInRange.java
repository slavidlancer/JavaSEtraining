package com.jse.fundamentals.loopsmethodsclasses;

import java.util.Scanner;

public class SymmetricNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[0 <= start <= end <= 999]");
        System.out.print("start = ");
        int start = input.nextInt();
        System.out.print("end = ");
        int end = input.nextInt();

        if ((start < 0) || (start > end) || (end > 999)) {
            System.out.println("invalid input");
        } else {
            boolean found = false;
            
            for (int i = start; i <= end; i++) {
                if (i / 10 == 0) {
                    found = true;
                    System.out.print(i + " ");
                } else if (i / 100 == 0) {
                    if ((i % 10) == (i / 10)) {
                        found = true;
                        System.out.print(i + " ");
                    }
                } else if ((i % 10) == (i / 100)) {
                    found = true;
                    System.out.print(i + " ");
                }
            }
            
            if (!found) {
                System.out.println("no symmetric numbers in the range [" + start
                        + ", " + end + "]");
            }   
        }
        
        input.close();
    }
}
