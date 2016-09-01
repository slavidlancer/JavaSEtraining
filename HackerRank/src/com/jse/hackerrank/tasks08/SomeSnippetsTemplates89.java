package com.jse.hackerrank.tasks08;

public class SomeSnippetsTemplates89 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3}; //not int[]
        String[] stringArray = {"hello", "world"};
        
        printArray(intArray);
        printArray(stringArray);
        printItemsInArray(intArray);
        printItemsInArray(stringArray);
        
        if (SomeSnippetsTemplates89.class.getDeclaredMethods().length > 2) {
            System.out.println("You should only have 1 method printArray().");
        }
        
        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 2));
        System.out.println(findMax(3, 3));
        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax("this", "that"));
        System.out.println(findMax('a', 'b'));
        
        SomeSnippetsTemplates89 temp = new SomeSnippetsTemplates89();
        //System.out.println(findMax(temp, temp));
    }
    
    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }
    
    //<?>, <E super Number>
    public static <E> void printItemsInArray(E[] arr) {
        System.out.print("[");
        
        for (int i = 0; i < arr.length; i++) {
            E item = arr[i]; //element
            
            System.out.print(item);
            
            if (i < (arr.length - 1)) {
                System.out.print(", ");
            }
        }
        
        System.out.println("]");
    }
    
    public static <E, T> E[] getArray(E[] arr, T variable) {
        return arr;
    }
    
    public static <T extends Comparable<T>> T findMax(T a, T b) {
        int n = a.compareTo(b); //-1/0/1
        
        if (n < 0) {
            return b;
        } else {
            return a;
        }
    }
}
