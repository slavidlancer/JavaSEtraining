package com.jse.hackerrank.tasks10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SomeSnippetsTemplates101 {
    public static void main(String[] args) {
        String regExString = "[a-zA-Z\\s]+";
        String checkString = "The quick, brown fox-jumpedover the lazy dog...";
        Pattern pattern = Pattern.compile(regExString);
        Matcher matcher = pattern.matcher(checkString);
        
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
