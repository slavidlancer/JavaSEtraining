package com.jse.codility.example_test;

public class PtrListLen {
    public static void main(String[] args) {
        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.linkSampleList();
        
        int count = calculateCountOfLinkedList(intLinkedList);
        
        System.out.println(count);
    }

    private static int calculateCountOfLinkedList(IntLinkedList intLinkedList) {
        int count = 0;
        IntList part = intLinkedList.intListA;
        
        while (part != null) {
            count++;
            
            part = part.next;
        }
        
        return count;
    }
}
