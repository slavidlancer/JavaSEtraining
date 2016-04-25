package com.softuni.jse.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] values = line.trim().split("\\s+");
        List<Double> listValues = new ArrayList<>();
        int position = 0;
        
        for (String value : values) {
            listValues.add(Double.parseDouble(value));
        }
        
        while (position < listValues.size() - 1) {
            if (listValues.get(position).equals(listValues.get(position + 1))) {
                listValues.remove(position);
                listValues.set(position, 2 * listValues.get(position));
                position--;
            } else {
                position++;
            }
            
            if (position < 0) {
                position = 0;
            }
        }
        
        for (Double value : listValues) {
            System.out.print(value);
            
            if (listValues.size() > 0) {
                System.out.print(" ");
            }
        }
        
        input.close();
    }
}
