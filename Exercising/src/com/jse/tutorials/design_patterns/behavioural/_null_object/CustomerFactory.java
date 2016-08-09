package com.jse.tutorials.design_patterns.behavioural._null_object;

public class CustomerFactory {
    public static final String[] names = {"Name1", "Name2", "Name3"};
    
    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        
        return new NullCustomer();
    }
}
