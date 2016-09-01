package com.jse.hackerrank.tasks09;

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;

public class SomeSnippetsTemplates95 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        findNumbersOfRepetitions("abca", 'a');
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("test: " + duration + " ms");
        
        startTime = System.currentTimeMillis();
        findNumbersOfRepetitions("abcaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("test: " + duration + " ms");
        
        startTime = System.currentTimeMillis();
        findNumbersOfRepetitions2("abca", new char[] {'a', 'b'});
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("test: " + duration + " ms");
        
        startTime = System.currentTimeMillis();
        findNumbersOfRepetitions3("abca", new char[] {'a', 'b'});
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("test: " + duration + " ms");
    }
    
    public static int findNumbersOfRepetitions(String s, char c) {
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum++;
            }
        }
        
        return sum;
    }
    
    public static int[] findNumbersOfRepetitions2(String s, char[] c) {
        int[] sums = new int[c.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), (sum + 1));
            }
        }
        
        for (int i = 0; i < c.length; i++) {
            if (!map.containsKey(c[i])) {
                sums[i] = 0;
            } else {
                sums[i] = map.get(c[i]);
            }
        }
        
        return sums;
    }
    
    public static int[] findNumbersOfRepetitions3(String s, char[] c) {
        //List<Integer> sums = new ArrayList<>();
        int[] sums = new int[c.length];
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < c.length; j++) {
                if (s.charAt(i) == c[j]) {
                    sums[j]++;
                }
            }
        }
        
        return sums;
    }
}
