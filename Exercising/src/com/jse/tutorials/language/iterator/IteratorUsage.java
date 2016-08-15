package com.jse.tutorials.language.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorUsage {
    public static void main(String[] args) {
        Set<Object> simpleSet = new HashSet<>();
        simpleSet.add("str ing");
        simpleSet.add(1234);
        simpleSet.add(1234.56);
        simpleSet.add(')');
        simpleSet.add(1234.56);
        simpleSet.add(true);
        simpleSet.add(1234);
        simpleSet.add(')');
        simpleSet.add(true);
        simpleSet.add("str ing");
        simpleSet.add(false);
        simpleSet.add("str ing");
        simpleSet.add(1234);
        simpleSet.add(1234.56);
        simpleSet.add(')');
        simpleSet.add(1234.56);
        simpleSet.add(true);
        simpleSet.add(1234);
        simpleSet.add(')');
        simpleSet.add(true);
        simpleSet.add("str ing");
        simpleSet.add(false);
        
        for (Iterator<Object> iterator = simpleSet.iterator();
                iterator.hasNext();) {
            Object object = iterator.next();
            
            System.out.println(object);
        }
    }
}
