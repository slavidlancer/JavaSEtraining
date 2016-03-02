package com.jse;

import java.util.Scanner;

public class TriangleFromCharacters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int lines = Integer.parseInt(console.nextLine());
        
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
        
        console.close();
    }
}
