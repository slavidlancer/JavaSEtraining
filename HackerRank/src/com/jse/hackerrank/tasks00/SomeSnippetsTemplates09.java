package com.jse.hackerrank.tasks00;

import java.util.Scanner;

class MyCalculator {
    public long power(int n, int p) throws Exception {
        long pow = -1;
        
        if ((n < 0) || (p < 0)) {
            throw new Exception("n and p should be non-negative");
        } else {
            pow = (long) Math.pow(n, p);
        }
        
        return pow;
    }
}

public class SomeSnippetsTemplates09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (input.hasNextInt()) {
            int n = input.nextInt();
            int p = input.nextInt();
            
            MyCalculator myCalculator = new MyCalculator();
            
            try {
                System.out.println(myCalculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        input.close();
    }
}
