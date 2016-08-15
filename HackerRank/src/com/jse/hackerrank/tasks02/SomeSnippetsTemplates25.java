package com.jse.hackerrank.tasks02;

import java.util.Scanner;

interface Food {
    String getType();
}

class Pizza implements Food {
    @Override
    public String getType() {
        return "someone ordered a fast food";
    }
}

class Cake implements Food {
    @Override
    public String getType() {
        return "someone ordered a dessert";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if ("pizza".equals(order)) {
            return new Pizza();
        } else if ("cake".equals(order)) {
            return new Cake();
        } else {
            return null;
        }
    }
}

public class SomeSnippetsTemplates25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FoodFactory foodFactory = new FoodFactory();
        Food food = foodFactory.getFood(input.nextLine());
        
        System.out.println("the factory returned: " +
                food.getClass().getSimpleName());
        System.out.println(food.getType());
        
        input.close();
    }
}
