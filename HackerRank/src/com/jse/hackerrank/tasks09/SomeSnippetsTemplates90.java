package com.jse.hackerrank.tasks09;

import java.util.LinkedList;

class Queuey<T> {
    private LinkedList<T> queue;
    
    public Queuey() {
        this.queue = new LinkedList<>();
    }
    
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }
    
    public int size() {
        return this.queue.size();
    }
    
    public void enqueue(T item) {
        this.queue.addLast(item);
    }
    
    public T dequeue() {
        return this.queue.removeFirst();
    }
    
    public T peek() {
        return this.queue.peek();
    }
}

public class SomeSnippetsTemplates90 {
    public static void main(String[] args) {
        Queuey<Integer> numberQueue = new Queuey<>();
        System.out.println("enqueue 5");
        numberQueue.enqueue(5);
        System.out.println("enqueue 7");
        numberQueue.enqueue(7);
        System.out.println("enqueue 6");
        numberQueue.enqueue(6);
        System.out.println("size = " + numberQueue.size());
        System.out.println("dequeue " + numberQueue.dequeue());
        System.out.println("dequeue " + numberQueue.dequeue());
        System.out.println("isEmpty? " + numberQueue.isEmpty());
        System.out.println("peek = " + numberQueue.peek());
        System.out.println("size = " + numberQueue.size());
        System.out.println();
        
        Queuey<String> stringQueue = new Queuey<>();
        System.out.println("enqueue \"first\"");
        stringQueue.enqueue("first");
        System.out.println("enqueue \"second\"");
        stringQueue.enqueue("second");
        System.out.println("enqueue \"third\"");
        stringQueue.enqueue("third");
        System.out.println("size = " + stringQueue.size());
        System.out.println("dequeue " + stringQueue.dequeue());
        System.out.println("dequeue " + stringQueue.dequeue());
        System.out.println("isEmpty? " + stringQueue.isEmpty());
        System.out.println("peek = " + stringQueue.peek());
        System.out.println("size = " + stringQueue.size());
        System.out.println();
    }
}
