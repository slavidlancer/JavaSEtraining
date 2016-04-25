package com.softuni.jse.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] values = line.trim().split("[|]");
        List<String> listValues = new ArrayList<>();
        
        for (int i = values.length - 1; i >= 0; i--) {
            listValues.add(values[i].replaceAll("\\s+", " ").trim());
            
            if (i != 0) {
                listValues.add(" ");
            }
        }
        
        for (String value : listValues) {
            System.out.print(value);
        }
        
        input.close();
    }
}
