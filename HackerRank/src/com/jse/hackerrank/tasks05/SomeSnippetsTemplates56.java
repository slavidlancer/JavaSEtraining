package com.jse.hackerrank.tasks05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
    boolean check(int number);
}

class MyMath {
    public PerformOperation isOdd() {
        return (a) -> (a % 2 == 0 ? false : true);
    }
    
    public PerformOperation isPrime() {
        return a -> {
            for (int i = 2; i < (a / 2); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            
            return true;
        };
    }
    
    public PerformOperation isPalindrome() {
        return a -> {
            String s = Integer.toString(a);
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    return false;
                }
            }
            
            return true;
        };
    }
    
    public boolean checker(PerformOperation performOperation, int number) {
        return performOperation.check(number);
    }
}

public class SomeSnippetsTemplates56 {
    public static void main(String[] args) {
        MyMath object = new MyMath();
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        int t = -1;
        
        try {
            t = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        PerformOperation performOperation;
        boolean result = false;
        String answer = null;
        
        while (t-- > 0) {
            String s = null;
            
            try {
                s = bufferedReader.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            StringTokenizer stringTokenizer = new StringTokenizer(s);
            int ch = Integer.parseInt(stringTokenizer.nextToken());
            int number = Integer.parseInt(stringTokenizer.nextToken());
            
            if (ch == 1) {
                performOperation = object.isOdd();
                result = object.checker(performOperation, number);
                answer = result ? "ODD" : "EVEN";
            } else if (ch == 2) {
                performOperation = object.isPrime();
                result = object.checker(performOperation, number);
                answer = result ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                performOperation = object.isPalindrome();
                result = object.checker(performOperation, number);
                answer = result ? "PALINDROME" : "NOT PALINDROME";
            }
            
            System.out.println(answer);
        }
    }
}
