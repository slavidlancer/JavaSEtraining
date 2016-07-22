package com.jse.tutorials.design_patterns.creational.builder;

import java.math.BigDecimal;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
    
    @Override
    public abstract BigDecimal price();
}
