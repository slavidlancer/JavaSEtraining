package com.jse.tutorials.design_patterns.creational.builder;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        
        meal.addItem(new VegBurger());
        meal.addItem(new AppleJuice());
        
        return meal;
    }
    
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        
        meal.addItem(new MeatBurger());
        meal.addItem(new OrangeJuice());
        
        return meal;
    }
}
