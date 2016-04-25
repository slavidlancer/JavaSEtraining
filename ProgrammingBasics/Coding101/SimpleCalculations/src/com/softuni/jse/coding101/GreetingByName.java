package com.softuni.jse.coding101;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: "); //might be commented (for correct check by the judge system)
        String name = input.nextLine();
        System.out.printf("Hello, %s!\n", name);
        
        input.close();
    }
}
