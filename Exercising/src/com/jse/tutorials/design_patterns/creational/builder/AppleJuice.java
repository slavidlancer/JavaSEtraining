package com.jse.tutorials.design_patterns.creational.builder;

import java.math.BigDecimal;

public class AppleJuice extends ColdDrink {
    @Override
    public String name() {
        return "apple juice";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("30.75").setScale(2);
    }
}
