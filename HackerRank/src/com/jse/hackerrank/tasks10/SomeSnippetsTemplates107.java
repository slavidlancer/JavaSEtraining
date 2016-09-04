package com.jse.hackerrank.tasks10;

class BinaryString3 {
    public BinaryString3(String text, int number) {
        String binaryInteger = Integer.toBinaryString(number);
        
        for (Byte byteElement : text.getBytes()) {
            int temp = byteElement ^ number;
            
            System.out.println(Integer.toBinaryString(byteElement) + " XOR " +
                    Integer.toBinaryString(number) + " = " +
                    Integer.toBinaryString(temp) + " = " + temp);
        }
    }
}

public class SomeSnippetsTemplates107 {
    public static void main(String[] args) {
        new BinaryString3("HackerRank", 8675309);
    }
}
