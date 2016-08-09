package com.jse.tutorials.design_patterns.behavioural.strategy;

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        int result = num1 + num2;
        
        return result;
    }
}
