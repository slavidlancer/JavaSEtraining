package com.jse.tutorials.design_patterns.behavioural.state;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("the player is in start state");
        
        context.setState(this);
    }
    
    @Override
    public String toString() {
        return "start state";
    }
}
