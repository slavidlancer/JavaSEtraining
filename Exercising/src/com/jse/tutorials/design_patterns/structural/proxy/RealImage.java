package com.jse.tutorials.design_patterns.structural.proxy;

public class RealImage implements Image {
    private String fileName;
    
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(this.fileName);
    }
    
    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
    
    @Override
    public void display() {
        System.out.println("Displaying " + this.fileName);
    }
}
