package com.jse.tutorials.design_patterns.behavioural._null_object;

public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }
    
    @Override
    public boolean isNil() {
        return false;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
}
