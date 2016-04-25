package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        boolean[] primes = new boolean[n + 1];
        
        for (int i = 0; i <= n; i++) {
            primes[i] = true;
        }
        
        primes[0] = primes[1] = false;
        
        for (int p = 2; p <= n; p++) {
            if (primes[p]) {
                fillPrimes(primes, p);
            }
        }
        
        printPrimes(primes);
        
        input.close();
    }

    private static void fillPrimes(boolean[] primes, int step) {
        for (int i = 2 * step; i < primes.length; i += step) {
            primes[i] = false;
        }
    }

    private static void printPrimes(boolean[] primes) {
        int countPrimes = 0;
        
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i);
                countPrimes++;
                
                if (countPrimes > 0) {
                    System.out.print(" ");
                }
            }
        }
    }
}
