package com.jse.tutorials.design_patterns.behavioural.memento;

public class Memento {
    private String state;
    
    public Memento(String state) {
        this.state = state;
    }
    
    protected String getState() {
        return this.state;
    }
}
