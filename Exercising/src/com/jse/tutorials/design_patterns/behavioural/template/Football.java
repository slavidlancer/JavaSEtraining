package com.jse.tutorials.design_patterns.behavioural.template;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("football intiliazied");
    }

    @Override
    void startPlay() {
        System.out.println("football started");
    }

    @Override
    void endPlay() {
        System.out.println("football ended");
    }
}
