package com.jse.hackerrank.tasks07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SomeSnippetsTemplates77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Integer[][] edges = new Integer[m][2];
        int[] count = new int[n];
        count[0] = n;
        
        for (int i = 0; i < m; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
            
            if (edges[i][0] > edges[i][1]) {
                int temp = edges[i][0];
                edges[i][0] = edges[i][1];
                edges[i][1] = temp;
            }
        }
        
        Arrays.sort(edges, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] int1, Integer[] int2) {
                Integer v1 = int1[0];
                Integer v2 = int2[0];
                
                return v1.compareTo(v2);
            }
        });
        
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(i + 1);
            int j = 0;
            
            while (j < list.size()) {
                for (int j2 = 0; j2 < m; j2++) {
                    if (edges[j2][0] == list.get(j)) {
                        if (!list.contains(edges[j2][1])) {
                            list.add(edges[j2][1]);
                        }
                    }
                }
                
                j++;
            }
            
            count[i] = list.size();
        }
        
        int remove = 0;
        
        for (int c : count) {
            if (c % 2 == 0) {
                remove++;
            }
        }
        
        System.out.println(remove - 1);
        
        scanner.close();
    }
}
