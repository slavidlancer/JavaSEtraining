package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class LastKNumbersSums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int k = Integer.parseInt(input.nextLine());
        
        long[] sequence = new long[n];
        sequence[0] = 1;
        
        for (int current = 1; current < n; current++) {
          int start = Math.max(0, current - k);
          int end = current - 1;
          long sum = sumSequenceInInterval(sequence, start, end);
          sequence[current] = sum;
        }
        
        printSequence(sequence);
        
        input.close();
    }

    private static long sumSequenceInInterval(long[] sequence, int start,
            int end) {
        long sum = sequence[start];
        
        for (int i = start + 1; i <= end; i++) {
            sum += sequence[i];
        }
        
        return sum;
    }

    private static void printSequence(long[] sequence) {
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i]);
            
            if (i < (sequence.length - 1)) {
                System.out.print(" ");
            }
        }
    }
}
