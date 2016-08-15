package com.jse.hackerrank.tasks05;

import java.util.Scanner;

public class SomeSnippetsTemplates58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] stringArr = new String[n];
        
        for (int i = 0; i < n; i++) {
            stringArr[i] = scanner.nextLine();
        }
        
        int q = Integer.parseInt(scanner.nextLine());
        String[] queries = new String[q];
        
        for (int i = 0; i < q; i++) {
            queries[i] = scanner.nextLine();
            int count = 0;
            
            for (int j = 0; j < n; j++) {
                if (stringArr[j].equals(queries[i])) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
        scanner.close();
    }
}
