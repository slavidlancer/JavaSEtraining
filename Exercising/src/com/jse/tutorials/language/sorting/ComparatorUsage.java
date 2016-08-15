package com.jse.tutorials.language.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorUsage {
    public static void main(String[] args) {
        List<Byte> list = new LinkedList<>();
        
        /*for (int i = 20; i >= 0; i--) {
            list.add((byte) i);
        }*/
        
        for (int i = 0; i < 20; i++) {
            list.add((byte) i);
        }
        
        System.out.println(Arrays.toString(list.toArray()));
        
        Collections.sort(list, new Comparator<Byte>() {
            @Override
            public int compare(Byte o1, Byte o2) {
                return o2.compareTo(o1); //o1.compareTo(o2);
            }
        });
        
        System.out.println(Arrays.toString(list.toArray()));
    }
}
