package com.jse.hackerrank.tasks05;

import java.util.Scanner;
//import java.util.Stack;

public class SomeSnippetsTemplates59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] h1 = new int[n1];
        int n2 = scanner.nextInt();
        int[] h2 = new int[n1];
        int n3 = scanner.nextInt();
        int[] h3 = new int[n1];
        int maxHeight = -1;
        /*Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();*/
        
        for (int i = 0; i < n1; i++) {
            h1[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n2; i++) {
            h2[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n3; i++) {
            h3[i] = scanner.nextInt();
        }
        
        /*for (int i = n1 - 1; i >= 0; i--) {
            stack1.push(h1[i]);
        }
        
        for (int i = n2 - 1; i >= 0; i--) {
            stack2.push(h2[i]);
        }
        
        for (int i = n3 - 1; i >= 0; i--) {
            stack3.push(h3[i]);
        }
        
        while (stack1.size() != stack3.size()) {
            stack1.pop();
            
            if (stack1.size() != stack2.size()) {
                stack2.pop();
            }
        }
        
        System.out.println(stack1.size());
        System.out.println(stack2.size());
        System.out.println(stack3.size());*/
        maxHeight = findEqualHeight(h1, h2, h3);
        System.out.println(maxHeight);
        
        scanner.close();
    }
    
    private static int findEqualHeight(int[] h1, int[] h2, int[] h3) {
        int sum1 = sumArray(h1);
        int sum2 = sumArray(h2);
        int sum3 = sumArray(h3);
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int maxHeight = -1;
        
        while (true) {
            if ((sum1 > sum2) || (sum1 > sum3)) {
                sum1 -= h1[i1++];
            } else if ((sum2 > sum1) || (sum2 > sum3)) {
                sum2 -= h2[i2++];
            } else if ((sum3 > sum1) || (sum3 > sum2)) {
                sum3 -= h3[i3++];
            } else {
                break;
            }
        }
        
        maxHeight = sum1;
        
        return maxHeight;
    }
    
    private static int sumArray(int[] h) {
        int sum = 0;
        
        for (int i = 0; i < h.length; i++) {
            sum += h[i];
        }
        
        return sum;
    }
}
