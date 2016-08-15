package com.jse.hackerrank.tasks03;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SomeSnippetsTemplates36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] S = new String[n + 2];
        
        for (int i = 0; i < n; i++) {
            S[i] = input.next();
        }
        
        input.close();
        
        /*Arrays.sort(S, 0, n, ((number1, number2) -> new BigDecimal(number2).compareTo(
                new BigDecimal(number1))));*/
        
        Arrays.sort(S, 0, n, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal a = new BigDecimal(o1);
                BigDecimal b = new BigDecimal(o2);
                
                return a.compareTo(b);
            }
        }));
        
        for (int i = 0; i < n; i++) {
            System.out.println(S[i]);
        }
    }
}
