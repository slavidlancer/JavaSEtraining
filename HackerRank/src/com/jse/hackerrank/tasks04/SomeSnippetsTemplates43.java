package com.jse.hackerrank.tasks04;

import java.util.Arrays;
import java.util.Scanner;

public class SomeSnippetsTemplates43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        
        input.close();
        
        boolean isAnagramResult = isAnagram(a, b);
        
        System.out.println(isAnagramResult ? "Anagrams" : "Not Anagrams");
    }
    
    private static boolean isAnagram(String a, String b) {
        char[] aLetters = a.toLowerCase().toCharArray();
        char[] bLetters = b.toLowerCase().toCharArray();
        
        Arrays.sort(aLetters);
        Arrays.sort(bLetters);
        
        String aString = new String(aLetters);
        String bString = new String(bLetters);
        
        return aString.equals(bString);
    }
}
