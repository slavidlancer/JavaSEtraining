package com.softuni.jse.basics;

import java.util.Scanner;

public class SandGlass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String asterisksHeader = new String(new char[n]).replace("\0", "*");
        int countOfAsterisks = n;
        
        System.out.println(asterisksHeader);
        
        for (int i = 0; i < (n / 2); i++) {
            countOfAsterisks -= 2;
            String asterisks = new String(new char[countOfAsterisks]).
                    replace("\0", "*");
            String dots = new String(new char[i + 1]).replace("\0", ".");
            
            System.out.print(dots);
            System.out.print(asterisks);
            System.out.println(dots);
        }
        
        countOfAsterisks = 1;
        
        for (int i = (n / 2); i > 1; i--) {
            countOfAsterisks += 2;
            String asterisks = new String(new char[countOfAsterisks]).
                    replace("\0", "*");
            String dots = new String(new char[i - 1]).replace("\0", ".");
            
            System.out.print(dots);
            System.out.print(asterisks);
            System.out.println(dots);
        }
        
        System.out.println(asterisksHeader);
        
        input.close();
    }
}
