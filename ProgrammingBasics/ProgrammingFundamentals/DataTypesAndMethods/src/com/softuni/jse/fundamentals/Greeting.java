package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String lastName = input.nextLine();
        String ageString = input.nextLine();
        int age = Integer.parseInt(ageString);
        
        System.out.println("Hello, " + firstName + " " + lastName +
                ".\r\nYou are " + age + " years old.");
        
        input.close();
    }
}
