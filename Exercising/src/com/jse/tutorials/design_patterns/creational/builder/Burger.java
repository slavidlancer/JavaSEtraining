package com.jse.tutorials.design_patterns.creational.builder;

import java.math.BigDecimal;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
    
    @Override
    public abstract BigDecimal price();
}
