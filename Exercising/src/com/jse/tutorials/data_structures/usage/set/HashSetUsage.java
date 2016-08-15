package com.jse.tutorials.data_structures.usage.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetUsage {
    public static void main(String[] args) {
        Set<Double> hashSet = new HashSet<>();
        
        hashSet.add(1.00);
        hashSet.add(3.00);
        hashSet.add(2.00);
        hashSet.add(3.00);
        hashSet.add(1.00);
        hashSet.add(3.00);
        hashSet.add(2.00);
        hashSet.add(3.00);
        hashSet.add(5.00);
        hashSet.add(0.00);
        hashSet.add(4.00);
        hashSet.add(6.00);
        
        System.out.println(Arrays.toString(hashSet.toArray()));
    }
}
