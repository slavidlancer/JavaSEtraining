package com.softuni.jse.fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] values = line.trim().split("\\s+");
        List<Integer> listValues = new ArrayList<>();
        
        for (String value : values) {
            listValues.add(Integer.parseInt(value));
        }
        
        Collections.sort(listValues);
        
        int position = 0;
        
        while (position < listValues.size()) {
            int number = listValues.get(position);
            int count = 1;
            
            while (((position + count) < listValues.size()) &&
                    (listValues.get(position + count) == number)) {
                count++;
            }
            
            position += count;
            System.out.println(number + " -> " + count);
        }
        
        input.close();
    }
}
