package com.softuni.jse.coding101;

import java.util.Scanner;

public class ExcellentOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade = Double.parseDouble(input.nextLine());
        
        if (grade >= 5.50) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent.");
        }
        
        input.close();
    }
}
