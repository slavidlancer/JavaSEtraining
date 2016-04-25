package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class PrintStringLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            
            System.out.println("str[" + i + "] -> '" + ch +"'");
        }
        
        
        input.close();
    }
}
