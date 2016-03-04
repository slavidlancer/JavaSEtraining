package com.jse.fundamentals.syntax;

import java.util.Scanner;

public class FormatNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("int a [0 <= a <= 500] = ");
        int a = input.nextInt();

        System.out.print("double b = ");
        double b = input.nextDouble();

        System.out.print("double c = ");
        double c = input.nextDouble();

        String unpaddedBinary = Integer.toBinaryString(a);
        StringBuilder stringBuilder = new StringBuilder();

        for (int toPrepend = 10 - unpaddedBinary.length(); toPrepend > 0;
                toPrepend--) {
            stringBuilder.append('0');
        }

        stringBuilder.append(unpaddedBinary);
        String paddedBinary = stringBuilder.toString();

        System.out.printf("%n|%-10X|%s|%10.2f|%-10.3f|", a, paddedBinary, b, c);

        input.close();
    }
}
