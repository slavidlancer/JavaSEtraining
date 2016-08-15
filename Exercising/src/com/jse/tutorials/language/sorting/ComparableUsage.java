package com.jse.tutorials.language.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Fruit implements Comparable<Fruit> {
    private String name;
    private String description;
    private int quantity;
    
    public Fruit(String name, String description, int quantity) {
        super();
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public int compareTo(Fruit o) {
        int compareQuantity = o.getQuantity();
        
        return this.quantity - compareQuantity; //ascending order
        //return compareQuantity - this.quantity; //descending order
    }
}

public class ComparableUsage {
    public static void main(String[] args) {
        Map<Fruit, String> fruitsSorted = new TreeMap<>();
        List<Fruit> fruits = new ArrayList<>();
        Fruit fruit1 = new Fruit("name1", "description1", 20);
        fruits.add(fruit1);
        Fruit fruit2 = new Fruit("name2", "description2", 10);
        fruits.add(fruit2);
        Fruit fruit3 = new Fruit("name3", "description3", 0);
        fruits.add(fruit3);
        Fruit fruit4 = new Fruit("name4", "description4", 666);
        fruits.add(fruit4);
        Fruit fruit5 = new Fruit("name5", "description5", 2);
        fruits.add(fruit5);
        Fruit fruit6 = new Fruit("name6", "description6", 5);
        fruits.add(fruit6);
        
        for (int i = 0; i < 6; i++) {
            fruitsSorted.put(fruits.get(i), "example" + i);
        }
        
        //System.out.println(fruitsSorted);
        
        for (Entry<Fruit, String> fruit : fruitsSorted.entrySet()) {
            System.out.println(fruit.getKey().getQuantity() + ": " +
                    fruit.getValue());
        }
    }
}
