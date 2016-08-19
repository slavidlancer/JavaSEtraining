package com.jse.hackerrank.tasks07;

import java.util.Scanner;

public class SomeSnippetsTemplates78 {
    boolean b = true;
    int x = 88;
    
    public SomeSnippetsTemplates78() {
        double doubleValue = 9.0;
        
        showLocalVariables(doubleValue);
        showInstanceVariables();
    }
    
    private void showInstanceVariables() {
        /*System.out.println("instance variable 'b': " + b);
        System.out.println("instance variable 'x': " + x);*/
        
        System.out.println("instance variable 'b': " + this.b);
        System.out.println("instance variable 'x': " + this.x);
    }
    
    private void showLocalVariables(double x) {
        System.out.println("local variable 'x': " + x);
        x = 4.4;
        System.out.println("local variable 'x': " + x);
        
        for (int b = 0; b < 4; b++) {
            int i = b + 4;
            
            System.out.println("local variable 'b': " + b);
            System.out.println("local variable 'i': " + i);
            System.out.println("local variable 'x': " + x);
        }
        
        for (int b = 0; b < 4; b++) {
            x = b;
            
            System.out.println("local variable 'b': " + b);
            System.out.println("local variable 'x': " + x);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int number = 0;
        
        try {
            number = Integer.parseInt(s);
            
            System.out.println(number);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
        
        scanner.close();
        
        SomeSnippetsTemplates78 instance = new SomeSnippetsTemplates78();
    }
}
