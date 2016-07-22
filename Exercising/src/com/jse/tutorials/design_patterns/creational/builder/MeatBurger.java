package com.jse.tutorials.design_patterns.creational.builder;

import java.math.BigDecimal;

public class MeatBurger extends Burger {
    @Override
    public String name() {
        return "meat burger";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("50.50").setScale(2);
    }
}
