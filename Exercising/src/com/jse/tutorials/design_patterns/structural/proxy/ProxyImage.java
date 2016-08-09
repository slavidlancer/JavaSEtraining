package com.jse.tutorials.design_patterns.structural.proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void display() {
        if (this.realImage == null) {
            this.realImage = new RealImage(this.fileName);
        }
        
        this.realImage.display();
    }
}
