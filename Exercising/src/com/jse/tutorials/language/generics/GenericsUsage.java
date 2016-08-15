package com.jse.tutorials.language.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Box<T extends Serializable> {
    private T data;
    
    public T getData() {
        return this.data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return getData().toString();
    }
}

public class GenericsUsage {
    public static void main(String[] args) {
        Box<Boolean> box1 = new Box<>();
        box1.setData(false);
        System.out.println(box1.getData());
        
        Box<Boolean> box2 = new Box<>();
        box2.setData(true);
        System.out.println(box2.getData());
        System.out.println();
        
        List<Box<Boolean>> list = new ArrayList<>();
        list.add(box2);
        list.add(box2);
        list.add(box1);
        list.add(box1);
        printList(list);
    }
    
    private static <T> void printList(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
