package com.jse.tutorials.design_patterns.behavioural.template;

public class TemplatePattern {
    public static void main(String[] args) {
        Game football = new Football();
        football.play();
        
        System.out.println();
        
        Game chess = new Chess();
        chess.play();
    }
}
