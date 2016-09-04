package com.jse.hackerrank.tasks09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SomeSnippetsTemplates99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> emailsTable = new ArrayList<>();
        String emailRegEx = "[a-z.]+@gmail.com";
        
        for (int i = 0; i < n; i++){
            String firstName = scanner.next();
            String email = scanner.next();
            
            if (email.matches(emailRegEx)) {
                emailsTable.add(firstName);
            }
        }
        
        Collections.sort(emailsTable);
        
        for (String name : emailsTable) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}
