package com.jse.hackerrank.tasks02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

class Add {
    public void add(int... numbers) {
        int result = 0;
        
        result += numbers[0];
        System.out.print(numbers[0]);
        
        for (int i = 1; i < numbers.length; i++) {
            result += numbers[i];
            
            System.out.print("+" + numbers[i]);
        }
        
        System.out.println("=" + result);
    }
    
    /*public void add(int n1, int n2) {
        int result = n1 + n2;
        System.out.println(n1 + "+" + n2 + "=" + result);
    }
    
    public void add(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        System.out.println(n1 + "+" + n2 + "+" + n3 + "=" + result);
    }
    
    public void add(int n1, int n2, int n3, int n4, int n5) {
        int result = n1 + n2 + n3 + n4 + n5;
        System.out.println(n1 + "+" + n2 + "+" + n3 + "+" + n4 + "+" + n5 + "="
                + result);
    }
    
    public void add(int n1, int n2, int n3, int n4, int n5, int n6) {
        int result = n1 + n2 + n3 + n4 + n5 + n6;
        System.out.println(n1 + "+" + n2 + "+" + n3 + "+" + n4 + "+" + n5 + "+"
                + n6 + "=" + result);
    }*/
}

public class SomeSnippetsTemplates29 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(System.in));
            int n1 = Integer.parseInt(bufferedReader.readLine());
            int n2 = Integer.parseInt(bufferedReader.readLine());
            int n3 = Integer.parseInt(bufferedReader.readLine());
            int n4 = Integer.parseInt(bufferedReader.readLine());
            int n5 = Integer.parseInt(bufferedReader.readLine());
            int n6 = Integer.parseInt(bufferedReader.readLine());
            
            Add object = new Add();
            object.add(n1, n2);
            object.add(n1, n2, n3);
            object.add(n1, n2, n3, n4, n5);
            object.add(n1, n2, n3, n4, n5, n6);
            
            Method[] methods = Add.class.getDeclaredMethods();
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
