package com.jse.fundamentals.collections;

import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("strings on 1 line, space separator:");
        String inputLine = input.nextLine();
        
        String[] strings = inputLine.split(" ");
        
        System.out.println("\nresult:");
        System.out.print(strings[0]);
        
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].equals(strings[i - 1])) {
                System.out.print(" " + strings[i]);
            } else {
                System.out.print("\n" + strings[i]);
            }
        }
        
        input.close();
    }
}
