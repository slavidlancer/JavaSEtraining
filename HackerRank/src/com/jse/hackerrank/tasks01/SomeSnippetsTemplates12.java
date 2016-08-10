package com.jse.hackerrank.tasks01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SomeSnippetsTemplates12 {
    private int count;
    private String name;
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    public void setCount(int count) {
        this.count = count;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public SomeSnippetsTemplates12(int count, String name) {
        this.count = count;
        this.name = name;
    }
    
    @Override
    public String toString() {
        String result = this.count + ": " + this.name;
        
        return result;
    }
    
    public static void main(String[] args) {
        final int n = Byte.MAX_VALUE / 12;
        int[] intArr = new int[n];
        int[] intArrOther;
        int[] intArrAnother = {5, 3, 9, 2, 1};
        String[] stringArr = {"gh", "cd", "ab", "ef"};
        
        System.out.println(n + "\n" + Arrays.toString(intArr));
        intArr[n - 1] = 666;
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(intArrAnother));
        
        for (int i = 0; i < stringArr.length; i++) {
            System.out.print(stringArr[i]);
            
            if (i < stringArr.length - 1) {
                System.out.print(" ");
            }
        }
        
        System.out.println();
        
        Arrays.sort(intArrAnother);
        
        System.out.println(Arrays.toString(intArrAnother));
        
        intArrOther = intArrAnother;
        
        System.out.println(Arrays.toString(intArrOther));
        printArray(intArr);
        
        for(int i = intArrAnother.length - 1; i >= 0; i--){
            System.out.print(intArrAnother[i] + " ");
        }
        
        System.out.println();
        
        Arrays.sort(stringArr);
        
        printArray(stringArr);
        
        for (String str : stringArr) {
            System.out.println(str);
        }
        
        System.out.println(Array.get(intArr, intArr.length - 1));
        
        SomeSnippetsTemplates12 object = new SomeSnippetsTemplates12(n, "");
        System.out.println("\n" + object);
        object.setCount(object.input.nextInt());
        object.input.nextLine();
        object.setName(object.input.nextLine());
        
        System.out.println(object + "\n");
        
        System.out.println(Array.get(intArrAnother,
                (Math.abs(object.random.nextInt()) % intArrAnother.length)));
        
        object.input.close();
    }
    
    private static void printArray(int[] arr) {
        int size = arr.length;
        
        System.out.print("[");
        
        for (int i = 0; i < size; i++) {
            int item = arr[i];
            System.out.print(item);
            
            if (i < (size - 1)) {
                System.out.print(", ");
            }
        }
        
        System.out.println("]");
    }
    
    private static void printArray(String[] arr) {
        int size = arr.length;
        
        System.out.print("[");
        
        for (int i = 0; i < size; i++) {
            String item = arr[i];
            System.out.print("\"" + item + "\"");
            
            if (i < (size - 1)) {
                System.out.print(", ");
            }
        }
        
        System.out.println("]");
    }
}
