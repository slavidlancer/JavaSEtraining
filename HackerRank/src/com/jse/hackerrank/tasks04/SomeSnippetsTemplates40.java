package com.jse.hackerrank.tasks04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import static java.lang.System.in;

class Prime {
    public void checkPrime(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (BigInteger.valueOf(numbers[i]).isProbablePrime(1)) {
                System.out.print(numbers[i] + " ");
            }
        }
        
        System.out.println();
    }
}

public class SomeSnippetsTemplates40 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(in));
            int n1 = Integer.parseInt(bufferedReader.readLine());
            int n2 = Integer.parseInt(bufferedReader.readLine());
            int n3 = Integer.parseInt(bufferedReader.readLine());
            int n4 = Integer.parseInt(bufferedReader.readLine());
            int n5 = Integer.parseInt(bufferedReader.readLine());
            
            Prime object = new Prime();
            object.checkPrime(n1);
            object.checkPrime(n1, n2);
            object.checkPrime(n1, n2, n3);
            object.checkPrime(n1, n2, n3, n4, n5);
            
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    
                    break;
                }
                
                set.add(methods[i].getName());
            }
            
            if (overload) {
                throw new Exception("overloading is not allowed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
