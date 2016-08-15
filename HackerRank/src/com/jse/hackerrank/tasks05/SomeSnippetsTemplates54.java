package com.jse.hackerrank.tasks05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SomeSnippetsTemplates54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        String stringPattern = "(<|</)[^<>/]+>";
        Pattern pattern = Pattern.compile(stringPattern);
        
        while (testCases > 0) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);
            int index = 0;
            List<String> contents = new ArrayList<>();
            Stack<String> tagStack = new Stack<>();
            String content = null;
            boolean isLastStartOrEnd = false;
            
            while (matcher.find()) {
                String tag = matcher.group();
                boolean isStartOrEnd = false;
                String tagName = "";
                
                if (tag.startsWith("</")) {
                    isStartOrEnd = false;
                    tagName = tag.substring(2, tag.length() - 1);
                } else {
                    isStartOrEnd = true;
                    tagName = tag.substring(1, tag.length() - 1);
                }
                
                if (isStartOrEnd) {
                    tagStack.push(tagName);
                } else {
                    if (!tagStack.empty() && tagStack.pop().equals(tagName)) {
                        if (isLastStartOrEnd) {
                            content = line.substring(index, matcher.start());
                            
                            if (!content.isEmpty()) {
                                contents.add(content);
                            }
                        }
                    }
                }
                
                index = matcher.end();
                isLastStartOrEnd = isStartOrEnd;
            }
            
            System.out.println(contents.isEmpty() ? "None" :
                    String.join("\n", contents));
            
            testCases--;
        }
        
        scanner.close();
    }
}
