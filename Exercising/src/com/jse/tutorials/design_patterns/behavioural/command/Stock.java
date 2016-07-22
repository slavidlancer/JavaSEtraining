package com.jse.tutorials.design_patterns.behavioural.command;

public class Stock {
    private String name = "ABC";
    private int quantity = 10;
    
    public void buy() {
        System.out.println(this.name + ": " + this.quantity + ", bought");
    }
    
    public void sell() {
        System.out.println(this.name + ": " + this.quantity + ", sold");
    }
}
