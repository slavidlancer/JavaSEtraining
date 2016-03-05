package com.jse.fundamentals.introduction;

import java.util.Scanner;

public class SumFrom1ToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = Integer.parseInt(input.nextLine());
        int sum = 0;
        
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("sum: " + sum);
        
        input.close();
    }
}
