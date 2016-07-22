package com.jse.tutorials.design_patterns.behavioural.command;

public class CommandPattern {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();
    }
}
