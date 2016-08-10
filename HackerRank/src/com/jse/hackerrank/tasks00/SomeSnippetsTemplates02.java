package com.jse.hackerrank.tasks00;

import java.util.Scanner;

public class SomeSnippetsTemplates02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int size = s.length();
        int count = 1;
        int A = 'A';
        int Z = 'Z';
        
        for (int i = 0; i < size; i++) {
            int letter = s.charAt(i);
            
            if ((letter >= A) && (letter <= Z)) {
                count++;
            }
        }
        
        System.out.println(count);

        input.close();
    }
}
