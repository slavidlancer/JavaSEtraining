package com.jse.fundamentals.introduction;

import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        String[] ghettoNumbers = {
                "Gee", "Bro", "Zuz", "Ma", "Duh",
                "Yo", "Dis", "Hood", "Jam", "Mack"
        };
        Scanner console = new Scanner(System.in);
        System.out.print("number = ");
        String input = console.nextLine();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int number = Character.getNumericValue(input.charAt(i));
            output.append(ghettoNumbers[number]);
        }

        System.out.print("transformed: " + output);
        console.close();
    }
}
