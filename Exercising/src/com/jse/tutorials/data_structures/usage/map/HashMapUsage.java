package com.jse.tutorials.data_structures.usage.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapUsage {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        
        hashMap.put("asdf", 1);
        hashMap.put("awsx", 2);
        hashMap.put("abqn", 3);
        hashMap.put("oknb", 1);
        hashMap.put("ijbv", 2);
        hashMap.put("cvgy", 3);
        
        for (Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
