package com.jse.fundamentals.introduction;

import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        String[] ghettoNumbers = {
                "Gee", "Bro", "Zuz", "Ma", "Duh",
                "Yo", "Dis", "Hood", "Jam", "Mack"
        };
        Scanner input = new Scanner(System.in);
        System.out.print("number = ");
        String inputString = input.nextLine();
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < inputString.length(); i++) {
            int number = Character.getNumericValue(inputString.charAt(i));
            output.append(ghettoNumbers[number]);
        }
        
        System.out.print("transformed: " + output);
        
        input.close();
    }
}
