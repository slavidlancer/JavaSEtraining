package com.jse.fundamentals.syntax;

import java.util.Scanner;

public class Count1Bits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number = ");
        int number = input.nextInt();
        int countBits = Integer.bitCount(number);
        
        System.out.printf("%n%d \"1\"-bit(s)", countBits);
        
        input.close();
    }
}
