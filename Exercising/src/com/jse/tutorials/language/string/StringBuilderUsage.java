package com.jse.tutorials.language.string;

public class StringBuilderUsage {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0");
        
        for (int i = 1; i <= 256; i++) {
            stringBuilder.append("+" + i);
        }
        
        stringBuilder.append("=?");
        
        System.out.println(stringBuilder.toString());
    }
}
