package com.jse.tutorials.design_patterns.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();
    
    public Memento get(int index) {
        return this.mementoList.get(index);
    }
    
    public void add(Memento state) {
        this.mementoList.add(state);
    }
    
    public int getCurrentSize() {
        return this.mementoList.size();
    }
}
