package com.jse.hackerrank;

import java.util.Scanner;

public class SomeSnippetsTemplates14 {
    static class Singleton {
        private static Singleton instance = null;
        public String str;
        
        private Singleton() {}
        
        public static Singleton getSingleInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            
            return instance;
        }
    }
    
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleInstance();
        singleton.str = "check";
        System.out.println(singleton.str);
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            String spaces = new String(new char[n - i]).replace("\0", " ");
            String hashes = new String(new char[i]).replace("\0", "#");
            
            System.out.println(spaces + hashes);
        }
        
        input.close();
    }
}
