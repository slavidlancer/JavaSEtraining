package com.jse.tutorials.design_patterns.creational.builder;

import java.math.BigDecimal;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "veg burger";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("25.00").setScale(2);
    }
}
