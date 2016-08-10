package com.jse.hackerrank.tasks00;

import java.util.Scanner;
import java.util.Stack;

public class SomeSnippetsTemplates01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        Stack<Integer> stck = new Stack<Integer>();
        Stack<Integer> stckMax = new Stack<Integer>();
        
        for (int i = 0; i < n; i++) {
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    int number = input.nextInt();
                    stck.push(number);
                    
                    if (!stckMax.isEmpty()) {
                        if (number >= stckMax.peek()) {
                            stckMax.push(number);
                        }
                    } else {
                        stckMax.push(number);
                    }
                    
                    break;
                    
                case 2:
                    int value = stck.pop();
                    
                    if (!stckMax.isEmpty()) {
                        if (value == stckMax.peek()) {
                            stckMax.pop();
                        }
                    }
                    
                    break;
                    
                case 3:
                    if (!stckMax.isEmpty()) {
                        System.out.println(stckMax.peek());
                    }
                    
                    break;
                    
                default:
                    System.out.println("wrong choice");
                    
                    break;
                }
            }
        
        input.close();
    }
}
