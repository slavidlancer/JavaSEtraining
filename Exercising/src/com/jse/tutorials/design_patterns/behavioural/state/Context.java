package com.jse.tutorials.design_patterns.behavioural.state;

public class Context {
    private State state;
    
    public Context() {
        this.state = null;
    }
    
    State getState() {
        return this.state;
    }
    
    void setState(State state) {
        this.state = state;
    }
}
