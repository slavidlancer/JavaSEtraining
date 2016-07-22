package com.jse.tutorials.design_patterns.behavioural.command;

public class SellStock implements Order {
private Stock abcStock;
    
    public SellStock(Stock stock) {
        this.abcStock = stock;
    }
    
    @Override
    public void execute() {
        this.abcStock.sell();
    }
}
