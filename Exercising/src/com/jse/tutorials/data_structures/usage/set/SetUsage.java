package com.jse.tutorials.data_structures.usage.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetUsage {
    public static void main(String[] args) {
        Set<Double> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        
        hashSet.add(1.00);
        hashSet.add(3.00);
        hashSet.add(2.00);
        hashSet.add(3.00);
        
        for (Iterator<Double> iterator = hashSet.iterator();
                iterator.hasNext();) {
            Double value = iterator.next();
            
            System.out.println(value);
        }
        
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(1);
        
        for (Integer integer : treeSet) {
            System.out.println(integer);
        }
        
        linkedHashSet.add("a");
        linkedHashSet.add("b");
        linkedHashSet.add("c");
        linkedHashSet.add("d");
        linkedHashSet.add("b");
        
        for (Iterator<String> iterator = linkedHashSet.iterator();
                iterator.hasNext();) {
            String value = iterator.next();
            
            System.out.println(value);
        }
    }
}
