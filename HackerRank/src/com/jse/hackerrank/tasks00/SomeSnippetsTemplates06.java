package com.jse.hackerrank.tasks00;

import java.util.ArrayList;
import java.util.Scanner;

class Student {}
class Rockstar {}
class Hacker {}

public class SomeSnippetsTemplates06 {
    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for (int i = 0; i < t; i++) {
            String s = input.next();
            
            if (s.equals("Student")) {
                mylist.add(new Student());
            }
            
            if (s.equals("Rockstar")) {
                mylist.add(new Rockstar());
            }
            
            if (s.equals("Hacker")) {
                mylist.add(new Hacker());
            }
        }
        
        System.out.println(count(mylist));
        
        input.close();
    }
    
    private static String count(ArrayList<Object> mylist) {
        int a = 0, b = 0, c = 0;
        
        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);
            
            if (element instanceof Student) {
                a++;
            }
            
            if (element instanceof Rockstar) {
                b++;
            }
            
            if (element instanceof Hacker) {
                c++;
            }
        }
        
        String result = Integer.toString(a) + " " + Integer.toString(b) + " " +
                Integer.toString(c);
        
        return result;
    }
}
