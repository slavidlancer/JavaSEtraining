package com.jse.tutorials.data_structures.usage.list;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueUsage {
    public static void main(String[] args) {
        Queue<Double> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4.56);
        priorityQueue.add(1.23);
        priorityQueue.add(0.91);
        priorityQueue.add(7.89);
        
        System.out.println(Arrays.toString(priorityQueue.toArray()));
    }
}
