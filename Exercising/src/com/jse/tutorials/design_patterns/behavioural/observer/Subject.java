package com.jse.tutorials.design_patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;
    
    public List<Observer> getObservers() {
        return observers;
    }
    
    public void attach(Observer observer) {
        this.observers.add(observer);
    }
    
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }
    
    public int getState() {
        return state;
    }
    
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
