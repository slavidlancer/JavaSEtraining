package com.jse.tutorials.data_structures.queue;

import java.util.NoSuchElementException;

public class QueueStructure {
    public static void main(String[] args) {
        Queue<String> greetings = new QueueArray<>();
        
        try {
            greetings.dequeue();
        } catch (NoSuchElementException nsee) {
            nsee.printStackTrace();
        }
        
        greetings.enqueue("first");
        System.out.println(greetings);
        greetings.enqueue("second");
        System.out.println(greetings);
        greetings.enqueue("third");
        System.out.println(greetings);
        greetings.enqueue("fourth");
        System.out.println(greetings);
        greetings.dequeue();
        System.out.println(greetings);
        greetings.enqueue("fifth");
        System.out.println(greetings);
        greetings.dequeue();
        System.out.println(greetings);
        greetings.dequeue();
        System.out.println(greetings);
        
        Queue<Integer> numbers = new QueueLinkedList<>();
        
        try {
            numbers.dequeue();
        } catch (NoSuchElementException nsee) {
            nsee.printStackTrace();
        }
        
        numbers.enqueue(1);
        System.out.println(numbers);
        numbers.enqueue(2);
        System.out.println(numbers);
        numbers.enqueue(3);
        System.out.println(numbers);
        numbers.enqueue(4);
        System.out.println(numbers);
        numbers.dequeue();
        System.out.println(numbers);
        numbers.enqueue(5);
        System.out.println(numbers);
        numbers.dequeue();
        System.out.println(numbers);
        numbers.dequeue();
        System.out.println(numbers);
    }
}
