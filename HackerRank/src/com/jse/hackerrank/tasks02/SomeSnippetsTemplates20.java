package com.jse.hackerrank.tasks02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SomeSnippetsTemplates20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double initialSize = n / 0.75 + 1;
        Map<String, Integer> phoneBook = new HashMap<>((int) initialSize);
        in.nextLine();
        
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        
        while (in.hasNext()) {
            String s = in.nextLine();
            
            if (phoneBook.get(s) != null) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        
        in.close();
    }
}
