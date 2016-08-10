package com.jse.hackerrank.tasks01;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class SomeSnippetsTemplates18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        
        System.out.println(phoneBook.isEmpty() + ", " + phoneBook.size());
        
        for (int i = 0; i < n; i++) {
            String name = input.next();
            int phone = input.nextInt();
            
            phoneBook.put(name, phone);
        }
        
        while (input.hasNext()) {
            String s = input.next();
            
            if (phoneBook.get(s) != null) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        
        input.close();
        input = new Scanner(System.in);
        
        System.out.println(phoneBook.isEmpty() + ", " + phoneBook.size());
        System.out.println(phoneBook.toString());
        
        System.out.println(phoneBook.containsKey("sam"));
        System.out.println(phoneBook.containsValue(11122222));
        
        phoneBook.remove("tom");
        System.out.println(phoneBook.toString());
        phoneBook.remove("harry", 12299933);
        System.out.println(phoneBook.toString());
        phoneBook.replace("sam", 99912222, 12345678);
        System.out.println(phoneBook.toString());
        phoneBook.replace("sam", 345678);
        System.out.println(phoneBook.toString());
        phoneBook.replace("s", 345678);
        System.out.println(phoneBook.toString());
        
        phoneBook = new LinkedHashMap<>();
        
        for (int i = n + 2; i > 0; i--) {
            char symbol = (char) (i + 100);
            String name = Character.toString(symbol);
            
            phoneBook.put(name, (i * i + i) / i);
        }
        
        phoneBook.put("wp", 34);
        phoneBook.put("bd", 123);
        phoneBook.put("aw", 1234);
        
        System.out.println(phoneBook.toString());
        
        for (Entry<String, Integer> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        Map<String, Integer> orderedPhoneBook = new TreeMap<>(phoneBook);
        
        phoneBook.clear();
        System.out.println(phoneBook.toString());
        System.out.println(orderedPhoneBook.toString());
        
        for (String key : orderedPhoneBook.keySet()) {
            System.out.println(key);
        }
        
        System.out.println(orderedPhoneBook.values());
        
        input.close();
    }
}
