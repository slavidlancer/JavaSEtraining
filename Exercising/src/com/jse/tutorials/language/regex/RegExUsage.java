package com.jse.tutorials.language.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExUsage {
    public static final String INPUT = "example for pattern matching";
    
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(INPUT);
        
        while (matcher.find()) {
            System.out.print(matcher.start() + "-" + matcher.end() + ": ");
            System.out.println(matcher.group() + "\n");
        }
    }
}
