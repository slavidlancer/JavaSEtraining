package com.jse.hackerrank.tasks08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.util.*;
import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;
    
    public Difference(int[] arr) {
        this.elements = arr;
    }
    
    public void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                int currentMaximumDifference = Math.abs(elements[i] -
                        elements[j]);
                
                this.maximumDifference = Math.max(this.maximumDifference,
                        currentMaximumDifference);
            }
        }
    }
}

public class SomeSnippetsTemplates80 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 0);
        
        System.out.println(calendar.getTime());
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = simpleDateFormat.format(calendar.getTime());
        
        System.out.println(formatted);
        
        Date date = new Date();
        
        System.out.println(date.getTime());
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        Difference difference = new Difference(arr);
        difference.computeDifference();
        
        System.out.println(difference.maximumDifference);
    }
}
