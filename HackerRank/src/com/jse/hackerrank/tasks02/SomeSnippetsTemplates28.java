package com.jse.hackerrank.tasks02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SomeSnippetsTemplates28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        String[] pair_left = new String[T];
        String[] pair_right = new String[T];
        String[] pairs = new String[T];
        Set<String> setOfPairs = new HashSet<>();
        
        for (int i = 0; i < T; i++) {
            pair_left[i] = input.next();
            pair_right[i] = input.next();
            pairs[i] = pair_left[i] + " " + pair_right[i];
            setOfPairs.add(pairs[i]);
            System.out.println(setOfPairs.size());
        }
        
        input.close();
    }
}
