package com.jse.fundamentals.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CardsFrequencies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter cards:");
        String[] faces = input.nextLine().split("\\W+");
        LinkedHashMap<String, Integer> faceFrequencies = new LinkedHashMap<>();
        
        for (String face : faces) {
            if (!faceFrequencies.containsKey(face)) {
                faceFrequencies.put(face, 1);
            } else {
                faceFrequencies.put(face, (faceFrequencies.get(face) + 1));
            }
        }
        
        for (Map.Entry<String, Integer> face : faceFrequencies.entrySet()) {
            System.out.printf("%s -> %.2f %%\n", face.getKey(),
                    (face.getValue() * 100.0 / faces.length));
        }
        
        input.close();
    }
}
