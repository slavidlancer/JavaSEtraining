package com.jse.hackerrank.tasks01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomeSnippetsTemplates19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        List<Integer> L = new ArrayList<>(N);
        
        for (int i = 0; i < N; i++) {
            int number = input.nextInt();
            L.add(number);
        }
        
        int Q = input.nextInt();
        
        for (int i = 0; i < Q; i++) {
            input.nextLine();
            String command = input.nextLine();
            
            if ("Insert".equals(command)) {
                int x = input.nextInt();
                int y = input.nextInt();
                L.add(x, y);
            } else if ("Delete".equals(command)) {
                int x = input.nextInt();
                L.remove(x);
            }
        }
        
        for (Integer number : L) {
            System.out.print(number + " ");
        }
        
        input.close();
    }
}
