package com.jse.tutorials.design_patterns.structural.proxy;

public class ProxyPattern {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        
        image.display();
        
        System.out.println();
        
        image.display();
    }
}
