package com.jse.hackerrank.tasks05;

import java.util.Scanner;

class MyRegEx {
    /* (255.255.255.255)
     * 000.12.12.034
       121.234.12.12
       23.45.12.56 */
    public final String pattern = "(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\."
            + "(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\."
            + "(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\."
            + "(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)";
}

public class SomeSnippetsTemplates52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()) {
            String IP = scanner.next();
            
            System.out.println(IP.matches(new MyRegEx().pattern));
        }
        
        scanner.close();
    }
}
