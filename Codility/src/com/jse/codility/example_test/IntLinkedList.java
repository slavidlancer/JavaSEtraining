package com.jse.codility.example_test;

public class IntLinkedList {
    IntList intListA;
    IntList intListB;
    IntList intListC;
    IntList intListD;
    
    public IntLinkedList() {
        this.intListA = new IntList();
        this.intListB = new IntList();
        this.intListC = new IntList();
        this.intListD = new IntList();
    }
    
    public void linkSampleList() {
        intListA.next = intListB;
        intListB.next = intListC;
        intListC.next = intListD;
        intListD.next = null;
    }
}
