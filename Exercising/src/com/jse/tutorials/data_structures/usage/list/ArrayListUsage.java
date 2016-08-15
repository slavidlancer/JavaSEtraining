package com.jse.tutorials.data_structures.usage.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListUsage {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("qwer");
        list.add("tyui");
        
        System.out.println(Arrays.toString(list.toArray()));
    }
}
