package com.jse.tutorials.design_patterns.creational.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public BigDecimal getCost() {
        BigDecimal cost = BigDecimal.ZERO.setScale(2);
        
        for (Item item : items) {
            cost = cost.add(item.price());
        }
        
        return cost;
    }
    
    public void showItems() {
        for (Item item : items) {
            System.out.println("item: " + item.name());
            System.out.println("packing: " + item.packing().pack());
            System.out.println("price: " + item.price());
            System.out.println("----");
        }
    }
}
