package com.jse.tutorials.design_patterns.behavioural.mediator;

public class MediatorPattern {
    public static void main(String[] args) {
        User user01 = new User("User 01");
        User user02 = new User("User 02");
        
        user01.sendMessage("request");
        user02.sendMessage("response");
    }
}
