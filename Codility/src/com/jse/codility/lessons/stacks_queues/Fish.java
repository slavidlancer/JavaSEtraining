package com.jse.codility.lessons.stacks_queues;

import java.util.Stack;

public class Fish {
    public static void main(String[] args) {
        /*int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};*/
        int[] A = {5, 4, 3, 2, 1};
        int[] B = {0, 1, 0, 1, 1};
        /*int[] A = {1, 2, 3, 4, 5};
        int[] B = {1, 1, 0, 0, 1};*/
        /*int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 1};*/
        /*int[] A = {4};
        int[] B = {0};*/
        /*int[] A = {0};
        int[] B = {1};*/
        /*int[] A = {0};
        int[] B = {0};*/
        /*int[] A = {1000000000};
        int[] B = {1};*/
        /*int[] A = {1, 1000000000};
        int[] B = {1, 0};*/
        
        int number = new Fish().calculateAliveFish(A, B);
        
        System.out.println(number);
    }

    private int calculateAliveFish(int[] A, int[] B) {
        int sizeA = A.length;
        int count = 0;
        
        if (sizeA == 1) {
            count = 1;
            
            return count;
        }
        
        Stack<Integer> fishes = new Stack<>();
        
        for (int i = 0; i < sizeA; i++) {
            int size = A[i];
            int direction = B[i];
            
            if (fishes.empty()) {
                fishes.push(i);
            } else {
                while (!fishes.empty() &&
                        ((direction - B[fishes.peek()]) == -1) &&
                        (A[fishes.peek()] < size)) {
                    fishes.pop();
                }
                
                if (!fishes.empty()) {
                    if ((direction - B[fishes.peek()]) != -1) {
                        fishes.push(i);
                    }
                } else {
                    fishes.push(i);
                }
            }
        }
        
        count = fishes.size();
        
        return count;
    }
}
