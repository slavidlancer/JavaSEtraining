package com.jse.tutorials.data_structures.stack;

import java.util.Arrays;

public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }
    
    public void push(long value) {
        if (!this.isFull()) {
            stackArray[++this.top] = value;
        } else {
            System.out.println("cannot add element " + value +
                    " (stack is full) [size: " + this.maxSize + "]");
        }
    }
    
    public long pop() {
        if (!this.isEmpty()) {
            long value = stackArray[this.top];
            stackArray[this.top] = 0;
            this.top--;
            
            return value;
        } else {
            return -1;
        }
    }
    
    public long peek() {
        if (!this.isEmpty()) {
            return stackArray[this.top];
        } else {
            return -1;
        }
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == (maxSize - 1));
    }
    
    @Override
    public String toString() {
        return Arrays.toString(stackArray);
    }
    
    public static void main(String[] args) {
        Stack stackExample = new Stack(3);
        
        System.out.println("empty: " + stackExample.isEmpty());
        System.out.println("full: " + stackExample.isFull());
        
        System.out.println(stackExample);
        
        System.out.println(stackExample.pop());
        System.out.println(stackExample.peek());
        
        System.out.println("push 10");
        stackExample.push(10);
        
        System.out.println(stackExample);
        
        System.out.println("push 20");
        stackExample.push(20);
        
        System.out.println(stackExample);
        
        System.out.println("push 30");
        stackExample.push(30);
        
        System.out.println(stackExample);
        
        System.out.println("push 40");
        stackExample.push(40);
        
        System.out.println(stackExample);
        
        System.out.println("empty: " + stackExample.isEmpty());
        System.out.println("full: " + stackExample.isFull());
        
        System.out.println("element at top: " + stackExample.peek());
        
        System.out.println(stackExample);
        
        while (!stackExample.isEmpty()) {
            long value = stackExample.pop();
            
            System.out.println("pop " + value);
            System.out.println(stackExample);
        }
        
        System.out.println(stackExample.pop());
        System.out.println(stackExample.peek());
        
        System.out.println("empty: " + stackExample.isEmpty());
        System.out.println("full: " + stackExample.isFull());
        
        System.out.println(stackExample);
    }
}
