package com.jse.tutorials.design_patterns.behavioural.state;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("the player is in stop state");
        
        context.setState(this);
    }
    
    @Override
    public String toString() {
        return "stop state";
    }
}
