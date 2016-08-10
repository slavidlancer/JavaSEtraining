package com.jse.hackerrank.tasks01;

import java.util.Arrays;
import java.util.Scanner;

public class SomeSnippetsTemplates17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int k = input.nextInt();
        String[] subStrsOfStr = new String[str.length() - k + 1];
        
        for (int i = 0; i < (str.length() - k + 1); i++) {
            subStrsOfStr[i] = str.substring(i, i + k);
        }
        
        Arrays.sort(subStrsOfStr);
        
        System.out.println(subStrsOfStr[0]);
        System.out.println(subStrsOfStr[subStrsOfStr.length - 1]);
        
        input.close();
    }
}
