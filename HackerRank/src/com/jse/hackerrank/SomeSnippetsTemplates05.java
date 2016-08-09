package com.jse.hackerrank;

import java.util.Scanner;

public class SomeSnippetsTemplates05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        boolean isChanged = false;
        
        do {
            isChanged = false;
            
            StringBuilder stringBuilder = new StringBuilder();
            
            for (int i = 0; i < S.length(); i++) {
                if (((i + 1) < S.length()) &&
                        (S.charAt(i) == S.charAt(i + 1))) {
                    i++;
                    isChanged = true;
                } else {
                    stringBuilder.append(S.charAt(i));
                }
            }
            
            S = stringBuilder.toString();
        } while (isChanged);
        
        if (S.length() > 0) {
            System.out.println(S);
        } else {
            System.out.println("Empty String");
        }
        
        input.close();
    }
}
