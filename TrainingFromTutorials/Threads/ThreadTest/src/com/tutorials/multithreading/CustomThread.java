package com.tutorials.multithreading;

public class CustomThread extends Thread {
    private String name;
    private int timeInterval;
    
    public CustomThread(String name, int timeInterval) {
        this.name = name;
        this.timeInterval = timeInterval;
    }
    
    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.println(this.name);
                sleep(this.timeInterval);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
