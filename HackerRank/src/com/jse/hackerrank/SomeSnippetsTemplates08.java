package com.jse.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class SomeSnippetsTemplates08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger a = new BigInteger(input.next());
        BigInteger b = new BigInteger(input.next());
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);
        
        System.out.println(sum);
        System.out.println(product);
        
        BigInteger n = input.nextBigInteger();
        
        if (n.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        
        input.close();
    }
}
