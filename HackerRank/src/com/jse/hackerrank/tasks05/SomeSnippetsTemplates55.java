package com.jse.hackerrank.tasks05;

import java.util.Scanner;

public class SomeSnippetsTemplates55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        
        while (t > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            System.out.println(canWinOrNot(arr, m, 0) ? "YES" : "NO");
            
            t--;
        }
        
        scanner.close();
    }
    
    private static boolean canWinOrNot(int[] arr, int m, int i) {
        //int n = arr.length;
        
        if (i < 0) {
            return false;
        }
        
        try {
            if (arr[i] == 1) {
                return false;
            }
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            return true;
        }
        
        /*if (i == (n - 1)) {
            return true;
        }
        
        if ((i + m) > (n - 1)) {
            return true;
        }*/
        
        arr[i] = 1;
        
        return canWinOrNot(arr, m, (i + 1)) || canWinOrNot(arr, m, (i + m)) ||
                canWinOrNot(arr, m, (i - 1));
    }
}
