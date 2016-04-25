package com.softuni.jse.coding101;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        
        if ("s3cr3t!P@ssw0rd".equals(password)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
        
        input.close();
    }
}
