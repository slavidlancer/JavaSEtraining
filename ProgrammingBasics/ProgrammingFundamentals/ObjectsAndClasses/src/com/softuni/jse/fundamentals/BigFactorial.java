package com.softuni.jse.fundamentals;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        BigInteger factorial = new BigInteger("1");
        
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println(factorial);
        
        input.close();
    }
}
