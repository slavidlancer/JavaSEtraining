package com.jse.hackerrank.tasks02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SomeSnippetsTemplates27 {
    static class Inner {
        private class Private {
            private String powerOf2(int number) {
                return (number & (number - 1)) == 0 ? "power of 2" :
                    "not a power of 2";
            }
        }
    }
    
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        int number = 0;
        
        try {
            number = Integer.parseInt(bufferedReader.readLine().trim());
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
        
        Object o;
        o = new Inner().new Private();
        
        System.out.println(number + " is " +
                ((Inner.Private) o).powerOf2(number)); //Inner.Private.class.newInstance().powerOf2(number);
        System.out.println("An instance of class: " +
                o.getClass().getCanonicalName() + " has been created");
    }
}
