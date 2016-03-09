package com.jse.fundamentals.collections;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter text: ");
        String inputLine = input.nextLine();
        
        String regex = "[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9]"
                + "(?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9]"
                + "(?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*";
        Pattern email = Pattern.compile(regex);
        Matcher matcher = email.matcher(inputLine);
        
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        
        input.close();
    }
}
