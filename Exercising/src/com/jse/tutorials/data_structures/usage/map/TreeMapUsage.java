package com.jse.tutorials.data_structures.usage.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapUsage {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        
        treeMap.put("sdf", 1);
        treeMap.put("wsx", 2);
        treeMap.put("bqn", 3);
        
        for (Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
