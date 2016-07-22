package com.jse.tutorials.design_patterns.behavioural.command;

public class BuyStock implements Order {
    private Stock abcStock;
    
    public BuyStock(Stock stock) {
        this.abcStock = stock;
    }
    
    @Override
    public void execute() {
        this.abcStock.buy();
    }
}
