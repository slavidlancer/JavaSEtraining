package com.softuni.jse.basics;

import java.util.Scanner;

public class WeAllLoveBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        
        for (int i = 1; i <= n; i++) {
            int p = Integer.parseInt(input.nextLine());
            
            int newP = 0;
            
            while (p > 0) {
                newP <<= 1;
                
                if ((p & 1) == 1) {
                    newP |= 1;
                }
                
                p >>= 1;
            }
            
            System.out.println(newP);
        }
        
        input.close();
    }
}
