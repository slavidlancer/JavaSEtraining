package com.softuni.jse.coding101;

import java.util.Scanner;

public class DrawFort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int colSize = n / 2;
        int midSize = 2 * n - 2 * colSize - 4;
        
        System.out.printf("/%s\\%s/%s\\", new String(new char[colSize]).
                replace("\0", "^"), new String(new char[midSize]).
                replace("\0", "_"), new String(new char[colSize]).
                replace("\0", "^"));
        
        for (int row = 1; row <= n - 3; row++) {
            System.out.printf("\n|%s|", new String(new char[2 * n - 2]).
                    replace("\0", " "));
        }
        
        System.out.printf("\n|%s%s%s|", new String(new char[colSize + 1]).
                replace("\0", " "), new String(new char[midSize]).
                replace("\0", "_"), new String(new char[colSize + 1]).
                replace("\0", " "));
        
        System.out.printf("\n\\%s/%s\\%s/", new String(new char[colSize]).
                replace("\0", "_"), new String(new char[midSize]).
                replace("\0", " "), new String(new char[colSize]).
                replace("\0", "_"));
        
        input.close();
    }
}
