package com.jse.hackerrank.tasks03;

import java.util.BitSet;
import java.util.Scanner;

public class SomeSnippetsTemplates35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        BitSet[] B = {new BitSet(n), new BitSet(n)};
        
        for (int i = 0; i < m; i++) {
            String command = input.next();
            int arg1 = input.nextInt();
            int arg2 = input.nextInt();
            
            switch (command) {
                case "AND":
                    B[arg1 - 1].and(B[arg2 - 1]);
                    
                    break;
                    
                case "OR":
                    B[arg1 - 1].or(B[arg2 - 1]);
                    
                    break;
                    
                case "XOR":
                    B[arg1 - 1].xor(B[arg2 - 1]);
                    
                    break;
                    
                case "FLIP":
                    B[arg1 - 1].flip(arg2);
                    
                    break;
                    
                case "SET":
                    B[arg1 - 1].set(arg2);
                    
                    break;
                    
                default:
                    System.out.println("wrong command");
                    
                    break;
            }
            
            System.out.println(B[0].cardinality() + " " + B[1].cardinality());
        }
        
        input.close();
    }
}
