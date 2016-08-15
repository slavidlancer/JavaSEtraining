package com.jse.hackerrank.tasks07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SomeSnippetsTemplates71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        
        boolean areCutsLeft = true;
        int countCuts = 0;
        int smallestStick = Collections.min(arr);
        int size = arr.size();
        
        do {
            countCuts = 0;
            
            for (int i = 0; i < size; i++) {
                int value = arr.get(i);
                
                if (value != Integer.MAX_VALUE) {
                    value -= smallestStick;
                    countCuts++;
                }
                
                if (value < 1) {
                    arr.set(i, Integer.MAX_VALUE);
                } else {
                    arr.set(i, value);
                }
            }
            
            smallestStick = Collections.min(arr);
            
            if (countCuts == 0) {
                areCutsLeft = false;
                
                break;
            }
            
            System.out.println(countCuts);
        } while (areCutsLeft);
        
        scanner.close();
    }
}
