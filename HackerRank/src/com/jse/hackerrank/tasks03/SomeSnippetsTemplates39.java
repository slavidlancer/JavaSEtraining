package com.jse.hackerrank.tasks03;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class SomeSnippetsTemplates39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = input.nextInt();
        int m = input.nextInt();
        int uniqueNumber = 0;
        int maxUniqueNumber = 0;
        
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            
            if (deque.size() == (m - 1)) {
                uniqueNumber = computeUniqueNumber(deque);
            }
            
            if (deque.size() >= (m - 1)) {
                if (!deque.contains(number)) {
                    uniqueNumber++;
                }
            }
            
            deque.offerLast(number);
            
            if (deque.size() > m) {
                int polled = deque.pollFirst();
                
                if (!deque.contains(polled)) {
                    uniqueNumber--;
                }
            }
            
            maxUniqueNumber = Math.max(maxUniqueNumber, uniqueNumber);
        }
        
        System.out.println(maxUniqueNumber);
        
        input.close();
    }

    private static int computeUniqueNumber(Deque<Integer> deque) {
        return new HashSet<Integer>(deque).size();
    }
}
