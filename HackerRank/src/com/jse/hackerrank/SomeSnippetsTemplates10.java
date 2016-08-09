package com.jse.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomeSnippetsTemplates10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int[] numberOfIntegersOnLine = new int[n];
        List<List<Integer>> numbers = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            numberOfIntegersOnLine[i] = input.nextInt();
            List<Integer> tempList = new ArrayList<>();
            
            for (int j = 0; j < numberOfIntegersOnLine[i]; j++) {
                tempList.add(input.nextInt());
            }
            
            numbers.add(tempList);
        }
        
        int numberOfQueries = input.nextInt();
        
        for (int i = 0; i < numberOfQueries; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            
            try {
                System.out.println(numbers.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        
        input.close();
    }
}
