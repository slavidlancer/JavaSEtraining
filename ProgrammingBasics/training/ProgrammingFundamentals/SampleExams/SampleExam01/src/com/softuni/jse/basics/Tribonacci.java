package com.softuni.jse.basics;

import java.math.BigInteger;
import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger t1 = BigInteger.valueOf((Long.parseLong(input.nextLine())));
        BigInteger t2 = BigInteger.valueOf((Long.parseLong(input.nextLine())));
        BigInteger t3 = BigInteger.valueOf((Long.parseLong(input.nextLine())));
        int n = Integer.parseInt(input.nextLine());
        BigInteger tNext = BigInteger.ZERO;
        
        if (n == 1) {
            System.out.println(t1);
        } else if (n == 2) {
            System.out.println(t2);
        } else if (n == 3) {
            System.out.println(t3);
        } else {
            for (int i = 4; i <= n; i++) {
                tNext = BigInteger.ZERO;
                tNext = tNext.add(t1.add(t2.add(t3)));
                t1 = t2;
                t2 = t3;
                t3 = tNext;
            }
            
            System.out.println(t3);
        }
        
        input.close();
    }
}
