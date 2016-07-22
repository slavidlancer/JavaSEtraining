package com.jse.tutorials.data_structures.queue;

import java.util.NoSuchElementException;

public class QueueLinkedList<T> implements Queue<T> {
    private int total;
    private Node first, last;
    
    private class Node {
        private T element;
        private Node next;
    }
    
    public QueueLinkedList() {}
    
    @Override
    public Queue<T> enqueue(T element) {
        Node current = last;
        last = new Node();
        last.element = element;
        
        if (total++ == 0) {
            first = last;
        } else {
            current.next = last;
        }
        
        return this;
    }

    @Override
    public T dequeue() {
        if (total == 0) {
            throw new NoSuchElementException();
        }
        
        T element = first.element;
        first = first.next;
        
        if (--total == 0) {
            last = null;
        }
        
        return element;
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node tmp = first;
        
        while (tmp != null) {
            stringBuilder.append(tmp.element).append(", ");
            tmp = tmp.next;
        }
        
        return stringBuilder.toString();
    }
}
