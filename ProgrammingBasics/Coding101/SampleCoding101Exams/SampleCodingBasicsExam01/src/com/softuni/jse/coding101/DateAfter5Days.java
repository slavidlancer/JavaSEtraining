package com.softuni.jse.coding101;

import java.util.Scanner;

public class DateAfter5Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d = Integer.parseInt(input.nextLine());
        int m = Integer.parseInt(input.nextLine());
        
        d += 5;
        
        switch (m) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (d > 30) {
                    d -= 30;
                    m++;
                }
                
                break;
                
            case 2:
                if (d > 28) {
                    d -= 28;
                    m++;
                }
                
                break;
                
            case 12:
                if (d > 31) {
                    d -= 31;
                    m = 1;
                }
                
                break;
                
            default:
                if (d > 31) {
                    d -= 31;
                    m++;
                }
                
                break;
        }
        
        System.out.print(d + ".");
        
        if (m < 10) {
            System.out.print("0" + m);
        } else {
            System.out.print(m);
        }
        
        input.close();
    }
}
