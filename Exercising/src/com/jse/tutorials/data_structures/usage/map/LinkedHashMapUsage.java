package com.jse.tutorials.data_structures.usage.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapUsage {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        
        linkedHashMap.put("asdf", 1);
        linkedHashMap.put("abqn", 3);
        linkedHashMap.put("awsx", 2);
        linkedHashMap.put("plmn", 4);
        
        for (Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
