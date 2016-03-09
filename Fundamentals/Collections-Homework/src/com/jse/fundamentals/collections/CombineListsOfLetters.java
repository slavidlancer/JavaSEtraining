package com.jse.fundamentals.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("first list = ");
        String[] firstList = input.nextLine().split(" ");
        System.out.print("second list = ");
        String[] secondList = input.nextLine().split(" ");
        
        ArrayList<Character> firstListNew = new ArrayList<>();
        ArrayList<Character> secondListNew = new ArrayList<>();
        
        for (String string : firstList) {
            firstListNew.add(string.charAt(0));
        }
        
        for (String string : secondList) {
            secondListNew.add(string.charAt(0));
        }
        
        secondListNew.removeAll(firstListNew);
        firstListNew.addAll(secondListNew);
        
        System.out.println("result: ");
        for (Character element : firstListNew) {
            System.out.print(element + " ");
        }
        
        input.close();
    }
}
