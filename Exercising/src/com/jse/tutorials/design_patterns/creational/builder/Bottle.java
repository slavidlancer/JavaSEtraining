package com.jse.tutorials.design_patterns.creational.builder;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}
