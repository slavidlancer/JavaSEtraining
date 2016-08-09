package com.jse.tutorials.design_patterns.behavioural.memento;

public class Originator {
    private String state;
    
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }
    
    public Memento saveStateToMemento() {
        return new Memento(this.state);
    }
}
