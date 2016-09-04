package com.jse.hackerrank.tasks10;

class BinaryString2 {
    public BinaryString2(String text, int number) {
        String binaryInteger = Integer.toBinaryString(number);
        
        for (Byte byteElement : text.getBytes()) {
            int temp = byteElement | number;
            
            System.out.println(Integer.toBinaryString(byteElement) + " OR " +
                    Integer.toBinaryString(number) + " = " +
                    Integer.toBinaryString(temp) + " = " + temp);
        }
    }
}

public class SomeSnippetsTemplates106 {
    public static void main(String[] args) {
        new BinaryString2("HackerRank", 8675309);
    }
}
