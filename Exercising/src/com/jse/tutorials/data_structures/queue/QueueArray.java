package com.jse.tutorials.data_structures.queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class QueueArray<T> implements Queue<T> {
    private T[] arr;
    private int total, first, next;
    
    @SuppressWarnings("unchecked")
    public QueueArray() {
        arr = (T[]) new Object[2];
    }
    
    private void resize(int capacity) {
        @SuppressWarnings("unchecked")
        T[] tmp = (T[]) new Object[capacity];
        int size = arr.length;
        
        for (int i = 0; i < total; i++) {
            tmp[i] = arr[(first + i) % size];
        }
        
        arr = tmp;
        first = 0;
        next = total;
    }
    
    @Override
    public Queue<T> enqueue(T element) {
        int size = arr.length;
        
        if (size == total) {
            resize(size * 2);
        }
        
        arr[next++] = element;
        
        if (next == size) {
            next = 0;
        }
        
        total++;
        
        return this;
    }

    @Override
    public T dequeue() {
        int size = arr.length;
        
        if (total == 0) {
            throw new NoSuchElementException();
        }
        
        T element = arr[first];
        arr[first] = null;
        
        if (++first == size) {
            first = 0;
        }
        
        if ((--total > 0) && (total == (size / 4))) {
            resize(size / 2);
        }
        
        return element;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
