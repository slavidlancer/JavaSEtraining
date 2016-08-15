package com.jse.hackerrank.tasks04;

import java.util.Scanner;

public class SomeSnippetsTemplates44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        
        input.close();
        
        s = s.trim();
        int size = s.length();
        
        if (size > 400000) {
            return;
        } else if (size == 0) {
            System.out.println("0");
            
            return;
        } else {
            String[] words = s.split("[\\s!,?.\\_'@]+");
            int count = words.length;
            
            System.out.println(count);
            
            for (String word : words) {
                System.out.println(word);
            }
        }
    }
}
