package com.jse.tutorials.design_patterns.behavioural.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
