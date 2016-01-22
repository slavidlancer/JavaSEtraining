package com.tutorials.multithreading;

public class ThreadTest {
    public static void main(String[] args) {
        CustomThread threadOne = new CustomThread("threadOne", 1000);
        CustomThread threadTwo = new CustomThread("threadTwo", 2000);
        CustomThread threadThree = new CustomThread("threadThree", 1500);
        
        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}
