package com.tutorials.multithreading;

import java.util.Vector;

public class SharedQueue {
    private static int QUEUE_SIZE = 5;
    private Vector<String> queue = new Vector<String>();
    
    public synchronized void put(String object) throws InterruptedException {
        while (queue.size() == QUEUE_SIZE) {
            wait();
        }
        
        queue.addElement(object);
        notify();
    }
    
    public synchronized String get() throws InterruptedException {
        while (queue.size() == 0) {
            wait();
        }
        
        String message = queue.firstElement();
        queue.removeElement(message);
        notify();
        
        return message;
    }
}
