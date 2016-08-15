package com.jse.hackerrank.tasks04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SomeSnippetsTemplates42 {
    public static void main(String[] args) {
        String pattern = "(?<!\\w)(\\w+)( \\1)*(?!\\w)";
        Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Scanner input = new Scanner(System.in);
        int testCases = Integer.parseInt(input.nextLine());
        
        while (testCases > 0) {
            String inputString = input.nextLine();
            Matcher m = r.matcher(inputString);
            boolean findMatch = true;
            
            while (m.find()) {
                inputString = inputString.replaceAll(
                        String.format("(?<!\\w)%s(?!\\w)", m.group()),
                            m.group(1));
                System.out.print("pattern: ");
                System.out.println(String.format("(?<!\\w)%s(?!\\w)", m.group()));
                System.out.println("all: "+ m.group());
                System.out.println("1: " + m.group(1));
                findMatch = false;
            }
            
            System.out.println(inputString);
            
            testCases--;
        }
        
        input.close();
    }
}
