package com.jse.tutorials.data_structures.usage.list;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueUsage {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        
        System.out.println(Arrays.toString(deque.toArray()));
    }
}
