package com.jse.tutorials.multithreading.threads;

public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("running");
        
        for (int i = 0; i < 666; i++) {
            System.out.println(i);
        }
    }
}
