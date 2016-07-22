package com.jse.tutorials.data_structures.queue;

public interface Queue<T> {
    Queue<T> enqueue(T element);
    T dequeue();
}
