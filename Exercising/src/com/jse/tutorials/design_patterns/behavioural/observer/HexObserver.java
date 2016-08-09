package com.jse.tutorials.design_patterns.behavioural.observer;

public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Hex String: " +
                Integer.toHexString(this.subject.getState()));
    }
}
