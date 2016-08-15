package com.jse.tutorials.data_structures.usage.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsage {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        
        System.out.println(Arrays.toString(queue.toArray()));
    }
}
