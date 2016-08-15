package com.jse.tutorials.data_structures.usage.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetUsage {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(0);
        
        System.out.println(Arrays.toString(treeSet.toArray()));
    }
}
