package com.jse.tutorials.design_patterns.behavioural.observer;

public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();
        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexObserver hexObserver = new HexObserver(subject);
        
        System.out.println("first state change: 15");
        subject.setState(15);
        
        System.out.println("first state change: 10");
        subject.setState(10);
        
        /* subject.remove(binaryObserver);
        subject.setState(0); */
    }
}
