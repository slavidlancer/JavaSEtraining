package com.jse.tutorials.data_structures.usage.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ListUsage {
    public static void main(String[] args) {
        Queue<Character> list1 = new PriorityQueue<>();
        list1.add('z');
        list1.add('b');
        list1.add('c');
        list1.add('c');
        list1.add('a');
        list1.add('x');
        list1.add('y');
        list1.add('y');
        list1.add('z');
        list1.add('a');
        list1.add('b');
        
        List<Character> list2 = new ArrayList<>();
        list2.addAll(list1);
        
        System.out.println(Arrays.toString(list1.toArray()));
        System.out.println(Arrays.toString(list2.toArray()));
    }
}
