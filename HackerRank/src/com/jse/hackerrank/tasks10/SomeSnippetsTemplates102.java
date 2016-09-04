package com.jse.hackerrank.tasks10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SomeSnippetsTemplates102 {
    public static void main(String[] args) {
        String checkString = "Hello, Goodbye, Farewell";
        String regExString = "\\p{Alpha}+";
        Pattern pattern = Pattern.compile(regExString);
        Matcher matcher = pattern.matcher(checkString);
        
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
