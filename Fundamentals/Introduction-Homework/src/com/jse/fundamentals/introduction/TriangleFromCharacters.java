package com.jse.fundamentals.introduction;

import java.util.Scanner;

public class TriangleFromCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number of lines = ");
        int lines = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i < lines * 2; i++) {
            if (i <= lines) {
                for (char j = 'a'; j < ('a' + i); j++) {
                    System.out.print(j + " ");
                }
                
                System.out.println();
            } else {
                for (char j = 'a'; j <= ('a' + ((lines * 2) - i) - 1); j++) {
                    System.out.print(j + " ");
                }
                
                System.out.println();
            }
        }
        
        input.close();
    }
}
