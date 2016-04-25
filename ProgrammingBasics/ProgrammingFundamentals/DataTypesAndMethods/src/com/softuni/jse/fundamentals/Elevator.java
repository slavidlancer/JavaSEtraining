package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int p = Integer.parseInt(input.nextLine());
        int courses = (int) Math.ceil((double) n / p);
        
        System.out.println(courses);
        
        input.close();
    }
}
