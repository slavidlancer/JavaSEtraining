package com.jse.tutorials.design_patterns.behavioural._null_object;

public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }
    
    @Override
    public String getName() {
        return "not available in customer database";
    }
}
