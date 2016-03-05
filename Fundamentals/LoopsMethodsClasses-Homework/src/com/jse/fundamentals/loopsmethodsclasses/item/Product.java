package com.jse.fundamentals.loopsmethodsclasses.item;

import java.math.BigDecimal;

public class Product implements Comparable<Product> {
    private String name;
    private BigDecimal price;
    
    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public BigDecimal getPrice() {
        return this.price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product p) {
        return this.getPrice().compareTo(p.getPrice());
    }

    @Override
    public String toString() {
        return this.price + " " + this.name;
    }
}
