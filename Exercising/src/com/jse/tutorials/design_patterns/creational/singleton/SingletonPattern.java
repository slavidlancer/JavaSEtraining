package com.jse.tutorials.design_patterns.creational.singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.showMessage();
    }
}
