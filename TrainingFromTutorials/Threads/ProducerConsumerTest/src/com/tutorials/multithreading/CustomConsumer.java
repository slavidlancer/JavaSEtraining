package com.tutorials.multithreading;

public class CustomConsumer extends Thread {
    private SharedQueue sharedQueue;
    
    public CustomConsumer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                String message = sharedQueue.get();
                System.out.println(getName() + " : get " + message);
                sleep(2000);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
