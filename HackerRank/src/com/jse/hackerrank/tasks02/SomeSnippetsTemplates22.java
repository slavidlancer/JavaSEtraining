package com.jse.hackerrank.tasks02;

import java.lang.reflect.Method;

class Printer {
    public <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class SomeSnippetsTemplates22 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        
        printer.printArray(intArray);
        printer.printArray(stringArray);
        
        int count = 0;
        
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            
            if ("printArray".equals(name)) {
                count++;
            }
        }
        
        if (count > 1) {
            System.out.println("method overloading is not allowed");
        }
    }
}
