package com.jse.hackerrank.tasks03;

import java.util.Scanner;
import java.util.Stack;

public class SomeSnippetsTemplates31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String binaryN = convertDecimalToBinary(n);
        int maxOnes = 0;
        int currentMaxOnes  = 0;
        
        System.out.println(binaryN);
        System.out.println(Integer.toBinaryString(n));
        
        for (int i = 0; i < binaryN.length(); i++) {
            if (binaryN.charAt(i) == '1') {
                currentMaxOnes++;
                maxOnes = Math.max(currentMaxOnes, maxOnes);
            } else if (binaryN.charAt(i) == '0') {
                currentMaxOnes = 0;
            }
        }
        
        System.out.println(maxOnes);
        
        input.close();
    }
    
    private static String convertDecimalToBinary(int n) {
        Stack<Byte> binaryStack = new Stack<>();
        StringBuilder stringBuilderBinaryNumber = new StringBuilder();
        
        while (n > 0) {
            byte remainder = (byte) (n % 2);
            n /= 2;
            
            binaryStack.push(remainder);
        }
        
        while (!binaryStack.isEmpty()) {
            stringBuilderBinaryNumber.append(binaryStack.pop());
        }
        
        return stringBuilderBinaryNumber.toString();
    }
}
