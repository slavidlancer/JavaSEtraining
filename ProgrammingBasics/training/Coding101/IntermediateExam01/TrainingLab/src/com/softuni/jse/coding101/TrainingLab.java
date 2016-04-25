package com.softuni.jse.coding101;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heightM = Double.parseDouble(input.nextLine());
        double widthM = Double.parseDouble(input.nextLine());
        double heightCm = heightM * 100;
        double widthCm = widthM * 100;
        double rows = Math.floor(heightCm / 120);
        double seatsOnRow = Math.floor((widthCm - 100) / 70);
        double seats = rows * seatsOnRow - 3;
        
        System.out.println(seats);
        
        input.close();
    }
}
