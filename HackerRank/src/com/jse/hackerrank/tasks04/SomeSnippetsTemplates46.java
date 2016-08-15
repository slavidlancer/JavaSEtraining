package com.jse.hackerrank.tasks04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomeSnippetsTemplates46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int q = input.nextInt();
        List<List<Integer>> sequencesList = new ArrayList<>(n);
        int lastAnswer = 0;
        
        for (int i = 0; i < n; i++) {
            sequencesList.add(new ArrayList<Integer>());
        }
        
        for (int i = 0; i < q; i++) {
            int query = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();
            
            switch (query) {
                case 1:
                    x = (x ^ lastAnswer) % n;
                    sequencesList.get(x).add(y);
                    
                    break;
                    
                case 2:
                    x = (x ^ lastAnswer) % n;
                    y = y % sequencesList.get(x).size();
                    lastAnswer = sequencesList.get(x).get(y);
                    System.out.println(lastAnswer);
                    
                    break;
                    
                default:
                    System.out.println("wrong query");
                    
                    break;
            }
        }
        
        input.close();
    }
}
