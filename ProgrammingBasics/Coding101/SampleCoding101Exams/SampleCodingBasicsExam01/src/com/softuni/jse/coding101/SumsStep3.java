package com.softuni.jse.coding101;

import java.util.Scanner;

public class SumsStep3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for (int i = 1; i <= n; i += 3) {
            sum1 += Integer.parseInt(input.nextLine());
            
            if (i + 1 <= n) {
                sum2 += Integer.parseInt(input.nextLine());
                
                if (i + 2 <= n) {
                    sum3 += Integer.parseInt(input.nextLine());
                }
            }
        }
        
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
        
        input.close();
    }
}
