package com.jse.hackerrank.tasks10;

public class SomeSnippetsTemplates103 {
    public static void main(String[] args) {
        String string1 = "Hello, Goodbye, Farewell";
        String string2 = "Hola, Adios, Hasta Luego";
        String delimiter = ", ";
        String[] string1Arr = string1.split(delimiter);
        String[] string2Arr = string2.split(delimiter);
        
        for (int i = 0; i < string1Arr.length; i++) {
            System.out.println(string1Arr[i]);
        }
        
        System.out.println();
        
        for (int i = 0; i < string2Arr.length; i++) {
            System.out.println(string2Arr[i]);
        }
    }
}
