package com.jse.hackerrank.tasks06;

import java.util.Scanner;

public class SomeSnippetsTemplates60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberOfCylinders = new int[3];
        int[] height = new int[3];
        int[] index = new int[3];
        
        for (int i = 0; i < 3; i++) {
            numberOfCylinders[i] = scanner.nextInt();
            height[i] = 0;
            index[i] = 0;
        }
        
        int[][] stack = {new int[numberOfCylinders[0]],
                new int[numberOfCylinders[1]], new int[numberOfCylinders[2]]};
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < numberOfCylinders[i]; j++) {
                stack[i][j] = scanner.nextInt();
                height[i] += stack[i][j];
            }
        }
        
        int targetHeight = Math.min(Math.min(height[0], height[1]), height[2]);
        
        while ((height[0] != height[1]) || (height[1] != height[2])) {
            for (int i = 0; i < 3; i++) {
                if (height[i] > targetHeight) {
                    height[i] -= stack[i][index[i]++];
                    
                    targetHeight = Math.min(targetHeight, height[i]);
                }
            }
        }
        
        System.out.println(targetHeight);
        
        scanner.close();
    }
}
