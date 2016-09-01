package com.jse.hackerrank.tasks09;

import java.util.Scanner;

public class SomeSnippetsTemplates92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }
        
        scanner.close();
    }
    
    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        
        if (number == 2) {
            return true;
        }
        
        if ((number % 2) == 0) {
            return false;
        }
        
        for (int i = 3; (i * i) < number; i += 2) { //i <= Math.sqrt(number);
            if ((number % i) == 0) {
                return false;
            }
        }
        
        return true;
    }
}
