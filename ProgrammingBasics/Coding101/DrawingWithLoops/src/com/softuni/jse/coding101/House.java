package com.softuni.jse.coding101;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int countOfAsterisksRoof = 1;
        
        if (n % 2 == 0) {
            countOfAsterisksRoof++;
        }
        
        String asterisksRoofBase = new String(new char[n]).replace("\0", "*");
        String asterisksBase = new String(new char[n - 2]).replace("\0", "*");
        int countOfDashes = (n - countOfAsterisksRoof) / 2;
        
        for (int i = 0; i < ((n - 1) / 2); i++) {
            System.out.print(new String(new char[countOfDashes]).
                    replace("\0", "-"));
            System.out.print(new String(new char[countOfAsterisksRoof]).
                    replace("\0", "*"));
            System.out.print(new String(new char[countOfDashes]).
                    replace("\0", "-"));
            System.out.println();
            countOfDashes--;
            countOfAsterisksRoof += 2;
        }
        
        System.out.println(asterisksRoofBase);
        
        for (int i = 0; i < (n / 2); i++) {
            System.out.print("|");
            System.out.print(asterisksBase);
            System.out.print("|\n");
        }
        
        input.close();
    }
}
