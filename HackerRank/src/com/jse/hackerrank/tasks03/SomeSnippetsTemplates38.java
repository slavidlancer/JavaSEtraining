package com.jse.hackerrank.tasks03;

import java.util.Scanner;
import java.util.Stack;

public class SomeSnippetsTemplates38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for (int i = 0; i < t; i++) {
            String s = input.next();
            
            System.out.println(areBalancedParentheses(s) ? "YES" : "NO");
        }
        
        while (input.hasNext()) {
            String check = input.next();
            
            System.out.println(areBalancedParentheses(check));
        }
        
        input.close();
    }
    
    private static boolean areBalancedParentheses(String check) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < check.length(); i++) {
            char ch = check.charAt(i);
            
            if ((ch == '(') || (ch == '[') || (ch == '{')) {
                stack.push(ch);
            } else if (stack.empty()) {
                return false;
            } else {
                char top = stack.pop();
                
                if (((top == '(') && (ch != ')')) ||
                        ((top == '[') && (ch != ']')) ||
                        ((top == '{') && (ch != '}'))) {
                    return false;
                }
            }
            
        }
        
        return stack.empty();
    }
}
