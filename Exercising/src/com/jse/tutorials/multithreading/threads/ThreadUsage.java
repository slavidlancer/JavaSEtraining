package com.jse.tutorials.multithreading.threads;

public class ThreadUsage {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread thread2 = new Thread(new Thread2());
        
        thread1.start();
        thread2.start();
    }
}
