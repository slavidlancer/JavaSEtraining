package com.jse.hackerrank.tasks06;

import java.util.Scanner;

public class SomeSnippetsTemplates68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int number = n;
            int evenlyDivisibleDigits = 0;
            
            do {
                int digit = number % 10;
                
                try {
                    if (n % digit == 0) {
                        evenlyDivisibleDigits++;
                    }
                } catch (Exception e) {}
                
                
                number /= 10;
            } while (number != 0);
            
            System.out.println(evenlyDivisibleDigits);
        }
        
        scanner.close();
    }
}
