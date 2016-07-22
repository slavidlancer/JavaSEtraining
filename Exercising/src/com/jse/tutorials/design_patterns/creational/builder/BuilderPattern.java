package com.jse.tutorials.design_patterns.creational.builder;

public class BuilderPattern {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("veg meal:");
        vegMeal.showItems();
        System.out.println("total cost: " + vegMeal.getCost());
        
        System.out.println();
        
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("non-veg meal:");
        nonVegMeal.showItems();
        System.out.println("total cost: " + nonVegMeal.getCost());
    }
}
