package com.softuni.jse.fundamentals;

import java.math.BigInteger;
import java.util.Scanner;

public class CenturiesToNanoseconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Centuries = ");
        byte centuries = input.nextByte();
        short years = (short) (centuries * 100);
        int days = (int) (years * 365.2422);
        long hours = 24 * days;
        long minutes = 60 * hours;
        long seconds = 60 * minutes;
        long milliseconds = 1000 * seconds;
        long microseconds = 1000 * milliseconds;
        String microsecondsText = String.valueOf(microseconds);
        BigInteger thousandBig = new BigInteger("1000");
        BigInteger microsecondsBig = new BigInteger(microsecondsText);
        BigInteger nanoseconds = thousandBig.multiply(microsecondsBig);
        
        System.out.println(centuries + " centuries = " + years + " years = " +
                days + " days = " + hours + " hours = " + minutes +
                " minutes = " + seconds + " seconds = " + milliseconds +
                " milliseconds = " + microseconds + " microseconds = " +
                nanoseconds + " nanoseconds");
        
        input.close();
    }
}
