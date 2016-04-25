package com.softuni.jse.coding101;

import java.util.Scanner;

public class Increasing4Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        
        boolean toCalculate = false;
        
        if (Math.abs(b - a) >= 3) {
            toCalculate = true;
        }
        
        if (toCalculate) {
            for (int i = a; i <= b; i++) {
                for (int j = i + 1; j < b; j++) {
                    for (int k = j + 1; k < b; k++) {
                        for (int p = k + 1; p <= b; p++) {
                            System.out.println(i + " " + j + " " + k + " " + p);
                        }
                    }
                }
            }
        } else {
            System.out.println("No");
        }
        
        
        input.close();
    }
}
