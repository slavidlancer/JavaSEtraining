package com.softuni.jse.fundamentals;

import java.util.Scanner;

public class LargestCommonEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words1 = input.nextLine().split(" ");
        String[] words2 = input.nextLine().split(" ");
        
        int largestCommonEnd = getLargestCommonEnd(words1, words2);
        System.out.println(largestCommonEnd);
        
        input.close();
    }

    static int getLargestCommonEnd(String[] words1, String[] words2) {
        int rightCount = 0;
        int leftCount = 0;
        int n1 = words1.length;
        int n2 = words2.length;
        
        while ((rightCount < n1) && (rightCount < n2)) {
            if (words1[n1 - rightCount - 1].equals(
                    words2[n2 - rightCount - 1])) {
                rightCount++;
            } else {
                break;
            }
        }
        
        while ((leftCount < n1) && (leftCount < n2)) {
            if (words1[leftCount].equals(words2[leftCount])) {
                leftCount++;
            } else {
                break;
            }
        }
        
        return rightCount > leftCount ? rightCount : leftCount;
    }
}
