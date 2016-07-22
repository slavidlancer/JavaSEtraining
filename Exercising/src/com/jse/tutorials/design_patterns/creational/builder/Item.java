package com.jse.tutorials.design_patterns.creational.builder;

import java.math.BigDecimal;

public interface Item {
    String name();
    Packing packing();
    BigDecimal price();
}
