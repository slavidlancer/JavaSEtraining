package com.jse.tutorials.design_patterns.behavioural.template;

public class Chess extends Game {
    @Override
    void initialize() {
        System.out.println("chess intiliazied");
    }

    @Override
    void startPlay() {
        System.out.println("chess started");
    }

    @Override
    void endPlay() {
        System.out.println("chess ended");
    }
}
