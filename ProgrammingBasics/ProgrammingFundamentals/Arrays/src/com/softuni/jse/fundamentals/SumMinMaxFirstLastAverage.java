package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class SumMinMaxFirstLastAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int arrayOfInts[] = new int[n];
        int sum = 0;
        int min = 0;
        int max = 0;
        int first = 0;
        int last = 0;
        double average = 0;
        
        if (n > 0) {
            arrayOfInts[0] = Integer.parseInt(input.nextLine());
            
            min = arrayOfInts[0];
            max = arrayOfInts[0];
            sum += arrayOfInts[0];
        }
        
        for (int i = 1; i < n; i++) {
            arrayOfInts[i] = Integer.parseInt(input.nextLine());
            
            if (arrayOfInts[i] > max) {
                max = arrayOfInts[i];
            } else if (arrayOfInts[i] < min) {
                min = arrayOfInts[i];
            }
            
            sum += arrayOfInts[i];
        }
        
        average = (double) sum / (double) n;
        
        first = arrayOfInts[0];
        last = arrayOfInts[n - 1];
        
        System.out.println("Sum = " + sum);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("First = " + first);
        System.out.println("Last = " + last);
        System.out.println("Average = " + average);
        
        input.close();
    }
}
