package com.jse.fundamentals.syntax;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number (decimal) = ");
        int decimalNumber = input.nextInt();
        
        System.out.printf("\nnumber (hexadecimal): %X", decimalNumber);
        
        input.close();
    }
}
