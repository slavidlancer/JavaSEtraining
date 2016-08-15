package com.jse.tutorials.data_structures.usage.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListUsage {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("opas");
        list.add("jklz");
        list.add("dfgh");
        
        System.out.println(Arrays.toString(list.toArray()));
    }
}
