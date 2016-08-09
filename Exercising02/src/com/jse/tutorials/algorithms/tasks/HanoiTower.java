package com.jse.tutorials.algorithms.tasks;

public class HanoiTower {
    public static void main(String[] args) {
        int numberOfDisks = 3;
        
        solveTowersOfHanoi(numberOfDisks, 'A', 'B', 'C');
    }
    
    private static void solveTowersOfHanoi(int numberOfDisks, char from,
            char intermediate, char to) {
        if (numberOfDisks == 1) {
            System.out.println("move disk 1 from " + from + " to " + to);
        } else {
            solveTowersOfHanoi(numberOfDisks - 1, from, to, intermediate);
            
            System.out.println("move disk " + numberOfDisks + " from " + from +
                    " to " + to);
            
            solveTowersOfHanoi(numberOfDisks - 1, intermediate, from, to);
        }
    }
}
