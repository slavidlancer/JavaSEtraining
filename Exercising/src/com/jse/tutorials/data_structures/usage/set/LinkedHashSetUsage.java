package com.jse.tutorials.data_structures.usage.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetUsage {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        
        linkedHashSet.add("d");
        linkedHashSet.add("a");
        linkedHashSet.add("b");
        linkedHashSet.add("c");
        linkedHashSet.add("c");
        linkedHashSet.add("d");
        linkedHashSet.add("b");
        linkedHashSet.add("c");
        
        System.out.println(Arrays.toString(linkedHashSet.toArray()));
    }
}
