package com.jse.tutorials.language.string;

import java.util.Arrays;

public class StringBufferUsage {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] elements = new char[] {'a', 'b', 'c', 'd', 'e'};
        
        stringBuffer.append(Arrays.toString(elements));
        
        System.out.println(stringBuffer);
    }
}
