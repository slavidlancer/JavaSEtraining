package com.jse.tutorials.data_structures.usage.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapUsage {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        
        hashMap.put("a", 1);
        hashMap.put("a", 2);
        hashMap.put("ab", 3);
        System.out.println(hashMap.get("a"));
        
        for (Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        treeMap.put("b", 4);
        treeMap.put("a", 1);
        treeMap.put("ab", 3);
        treeMap.put("a", 2);
        System.out.println(treeMap.get("ab"));
        
        for (Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        linkedHashMap.put("a", 1);
        linkedHashMap.put("b", 2);
        linkedHashMap.put("c", 3);
        linkedHashMap.put("b", 3);
        System.out.println(linkedHashMap.get("a"));
        
        for (Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
