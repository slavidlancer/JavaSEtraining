package com.jse.codility.lessons.time_complexity;

public class FrogJmp {
    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;
        
        int jumps = new FrogJmp().calculateMinimalNumberOfJumps(X, Y, D);
        
        System.out.println(jumps);
    }
    
    public int calculateMinimalNumberOfJumps(int X, int Y, int D) {
        int distance = Y - X;
        
        if ((distance % D) == 0) {
            return distance / D;
        } else {
            return (distance / D) + 1;
        }
    }
}
