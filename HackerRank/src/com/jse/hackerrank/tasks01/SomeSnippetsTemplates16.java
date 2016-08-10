package com.jse.hackerrank.tasks01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SomeSnippetsTemplates16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        StringBuilder stringBuilder = new StringBuilder();
        
        for (int i = A.length() - 1; i >= 0; i--) {
            stringBuilder.append(A.charAt(i));
        }
        
        String aReversed = stringBuilder.toString();
        
        if (A.equals(aReversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        try {
            int x = input.nextInt();
            int y = input.nextInt();
            int result = x / y;
            
            System.out.println(result);
        } catch (InputMismatchException ime) {
            System.out.println("java.util.InputMismatchException");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        input.close();
    }
}
