package com.jse.hackerrank.tasks08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class PalindromeCheck {
    /*private Stack<Character> stack;
    private Queue<Character> queue;*/
    private static Stack<Character> stack = new Stack<>();
    private static Queue<Character> queue = new LinkedList<>();
    
    /*public PalindromeCheck() {
        this.stack = new Stack<>();
        this.queue = new LinkedList<>();
    }*/
    
    public void pushCharacter(char c) {
        //this.stack.push(c);
        PalindromeCheck.stack.push(c);
    }
    
    public char popCharacter() {
        //return this.stack.pop();
        return PalindromeCheck.stack.pop();
    }
    
    public void enqueueCharacter(char c) {
        //this.queue.offer(c);
        PalindromeCheck.queue.offer(c);
    }
    
    public char dequeueCharacter() {
        //return this.queue.poll();
        return PalindromeCheck.queue.poll();
    }
}

public class SomeSnippetsTemplates83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();
        
        char[] s = inputString.toCharArray();
        PalindromeCheck palindromeCheck = new PalindromeCheck();
        boolean isPalindrome = true;
        
        for (char c : s) {
            palindromeCheck.pushCharacter(c);
            palindromeCheck.enqueueCharacter(c);
        }
        
        for (int i = 0; i < (s.length / 2); i++) {
            if (palindromeCheck.popCharacter() !=
                    palindromeCheck.dequeueCharacter()) {
                isPalindrome = false;
                
                break;
            }
        }
        
        System.out.println("The word, " + inputString + ", is " +
                (isPalindrome ? "" : "not ") + "a palindrome.");
    }
}
