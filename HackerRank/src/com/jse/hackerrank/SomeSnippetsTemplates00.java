package com.jse.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class SomeSnippetsTemplates00 {
    private static int B3;
    private static int H;
    private static boolean flag;
    
    static {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        B3 = scanner.nextInt();
        H = scanner.nextInt();
        
        if ((B3 > 0) && (H > 0)) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must "
                    + "be positive");
        }
        
        //scanner.close();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Random random = new Random();
        int max = 100;
        int number = random.nextInt(1000);
        System.out.println(number);
        
        do {
            number = Math.abs(random.nextInt()) % (max + 1);
            System.out.println(number);
        } while (number != 0);
        
        String A = input.next();
        String B = input.next();
        int length = A.length() + B.length();
        System.out.println(length);
        boolean isLexicographicallyLarger = (A.compareTo(B) > 1) ? true : false;
        System.out.println(isLexicographicallyLarger ? "Yes" : "No");
        String A2 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String B2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A2 + " " + B2);
        String answer = "";
        Double d = input.nextDouble();
        input.nextLine();
        String s = input.nextLine();
        System.out.printf("%-15s%03d\n", s, n);
        int expr = ((int) Math.pow(2.00, length)) * n;
        
        System.out.println(answer + expr + d);
        
        for (int i = 0; i < n; i++) {
            try {
                long x = input.nextLong();
                
                System.out.println(x + " can be fitted in:");
                
                if ((x >= -128) && (x <= 127)) {
                    System.out.println("* byte");
                }
                
                if ((x >= Short.MIN_VALUE) && (x <= Short.MAX_VALUE)) {
                    System.out.println("* short");
                }
                
                if ((x >= Integer.MIN_VALUE) && (x <= Integer.MAX_VALUE)) {
                    System.out.println("* int");
                }
                
                if ((x >= Long.MIN_VALUE) && (x <= Long.MAX_VALUE)) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(input.next() + " can't be fitted anywhere.");
            }
        }
        
        if (flag) {
            int area = B3 * H;
            
            System.out.println(area);
        }
        
        String month = input.next();
        String day = input.next();
        String year = input.next();
        
        try {
            SimpleDateFormat sDF = new SimpleDateFormat("dd.MM.yyyy");
            Date date = sDF.parse(day + "." + month + "." + year);
            sDF.applyPattern("EEEE");
            String dayOfWeek = sDF.format(date);
            
            System.out.println(dayOfWeek.toUpperCase());
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
        
        Integer n2 = n;
        String s2 = n2.toString();
        
        System.out.println(s2);
        
        int i = 1;
        
        do {
            String line = input.nextLine();
            
            System.out.println(i + " " + line);
            
            i++;
        } while (input.hasNext());
        
        input.close();
    }
}
