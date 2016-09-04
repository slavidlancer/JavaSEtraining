package com.jse.hackerrank.tasks10;

class BinaryString {
    public BinaryString(String text) {
        for (Byte byteElement : text.getBytes()) {
            System.out.print(Integer.toBinaryString(byteElement) + " ");
        }
        
        System.out.println();
    }
    
    public BinaryString(int number) {
        System.out.println(Integer.toBinaryString(number));
    }
}

public class SomeSnippetsTemplates105 {
    public static void main(String[] args) {
        new BinaryString("HackerRank");
        new BinaryString(8675309);
    }
}
