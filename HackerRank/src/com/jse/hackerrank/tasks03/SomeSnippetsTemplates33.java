package com.jse.hackerrank.tasks03;

import java.util.Arrays;
import java.util.Scanner;

public class SomeSnippetsTemplates33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[6][6]; //int arr[][] = new int[6][6];
        int[] sum = new int[4 * 4]; //int sum[] = new int[4 * 4]; //(arr.length - 2) * (arr.length - 2)
        int sumIndex = 0;
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        
        for (int i = 0; i < (arr.length - 2); i++) {
            for (int j = 0; j < (arr.length - 2); j++) {
                sum[sumIndex] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                        arr[i + 1][j + 1] +
                        arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                
                /*System.out.println(arr[i][j] + " " + arr[i][j + 1] + " " +
                        arr[i][j + 2]);
                System.out.println("  " + arr[i + 1][j + 1]);
                System.out.println(arr[i + 2][j] + " " + arr[i + 2][j + 1] +
                        " " + arr[i + 2][j + 2]);
                System.out.println();*/
                
                sumIndex++;
            }
        }
        
        Arrays.sort(sum);
        System.out.println(sum[sum.length - 1]);
        
        input.close();
    }
}
