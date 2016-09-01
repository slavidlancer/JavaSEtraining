package com.jse.hackerrank.tasks08;

public class SomeSnippetsTemplates87 {
    public static void main(String[] args) {
        int[] unsorted = {1, 5, 2, 4, 3};
        bubbleSort(unsorted);
    }
    
    private static void bubbleSort(int[] arr) {
        printArray("Initial", arr);
        
        int endPosition = arr.length - 1;
        int swapPosition = 0;
        
        while (endPosition > 0) {
            swapPosition = 0;
            
            for (int i = 0; i < endPosition; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    
                    swapPosition = i;
                }
                
                printArray("Current", arr);
            }
            
            endPosition = swapPosition;
        }
        
        printArray("Sorted", arr);
    }
    
    private static void printArray(String title, int[] arr) {
        System.out.print(title + " array: ");
        
        for (int number : arr) {
            System.out.print(number + " ");
        }
        
        System.out.println();
    }
}
