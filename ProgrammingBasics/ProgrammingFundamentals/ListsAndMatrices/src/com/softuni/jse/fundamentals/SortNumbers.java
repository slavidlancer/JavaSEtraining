package com.softuni.jse.fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] values = line.trim().split("\\s+");
        List<Double> listValues = new ArrayList<>();
        
        for (String value : values) {
            listValues.add(Double.parseDouble(value));
        }
        
        Collections.sort(listValues);
        
        for (int i = 0; i < listValues.size(); i++) {
            System.out.print(listValues.get(i));
            
            if ((i >= 0) && (i != listValues.size() - 1)) {
                System.out.print(" <= ");
            }
        }
        
        input.close();
    }
}
