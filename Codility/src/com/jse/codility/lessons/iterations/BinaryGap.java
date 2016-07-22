package com.jse.codility.lessons.iterations;

import java.util.Arrays;

public class BinaryGap {
    public static void main(String[] args) {
        //System.out.println(calculateMaxBinaryGap(529)); //1000010001
        System.out.println(calculateMaxBinaryGap(1041)); //10000010001
    }
    
    private static int calculateMaxBinaryGap(int N) {
        String binary = Integer.toBinaryString(N);
        
        //System.out.println(binary);
        
        binary = binary.replace("0", " ").trim();
        String[] zeroGroups = binary.split("1");
        
        if (zeroGroups.length == 0) {
            return 0;
        }
        
        int[] gaps = new int[zeroGroups.length];
        
        for (int i = 0; i < zeroGroups.length; i++) {
            gaps[i] = zeroGroups[i].length();
        }
        
        Arrays.sort(gaps);
        
        return gaps[gaps.length - 1];
    }
}
