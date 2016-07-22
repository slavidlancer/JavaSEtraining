package com.jse.tutorials.design_patterns.creational.builder;

import java.math.BigDecimal;

public class OrangeJuice extends ColdDrink {
    @Override
    public String name() {
        return "orange juice";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("35.25").setScale(2);
    }
}
