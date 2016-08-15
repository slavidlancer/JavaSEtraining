package com.jse.hackerrank.tasks05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SomeSnippetsTemplates53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        
        while (testCases > 0) {
            String username = scanner.nextLine();
            String stringPattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
            Pattern pattern = Pattern.compile(stringPattern);
            Matcher matcher = pattern.matcher(username);
            
            if (matcher.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            
            testCases--;
        }
        
        
        scanner.close();
    }
}
