package com.jse.hackerrank.tasks03;

import java.util.Scanner;

public class SomeSnippetsTemplates34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int countNegativeSumsOfSubarrays = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            
            if (sum < 0) {
                countNegativeSumsOfSubarrays++;
            }
            
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                
                if (sum < 0) {
                    countNegativeSumsOfSubarrays++;
                }
            }
        }
        
        System.out.println(countNegativeSumsOfSubarrays);
        
        input.close();
    }
}
