package com.tutorials.multithreading;

import java.util.Date;

public class CustomProducer extends Thread {
    private SharedQueue sharedQueue;
    
    public CustomProducer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                String message = new Date().toString();
                System.out.println("producer : put " + message);
                sharedQueue.put(message);
                sleep(500);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
