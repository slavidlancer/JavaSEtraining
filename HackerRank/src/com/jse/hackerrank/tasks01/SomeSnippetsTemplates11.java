package com.jse.hackerrank.tasks01;

import java.util.Scanner;

public class SomeSnippetsTemplates11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        String[] S = new String[T];
        
        for (int i = 0; i < T; i++) {
            S[i] = input.nextLine();
            int size = S[i].length();
            StringBuilder odd = new StringBuilder();
            StringBuilder even = new StringBuilder();
            
            for (int j = 0; j < size; j++) {
                if (j % 2 == 0) {
                    even.append(S[i].charAt(j));
                } else {
                    odd.append(S[i].charAt(j));
                }
            }
            
            System.out.println(even + " " + odd);
        }
        
        String S2 = "This is String example.";
        char[] S2CharArray = S2.toCharArray();
        
        for (int i = 0; i < S2.length(); i++) {
            System.out.print(S2CharArray[i]);
        }
        
        System.out.println();
        
        input.close();
    }
}
