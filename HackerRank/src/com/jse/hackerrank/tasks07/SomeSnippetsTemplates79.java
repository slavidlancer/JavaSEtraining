package com.jse.hackerrank.tasks07;

import java.util.LinkedList;
import java.util.List;

class QueueyOfNumbers {
    private LinkedList<Integer> queue;
    
    public QueueyOfNumbers() {
        this.queue = new LinkedList<>();
    }
    
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }
    
    public int size() {
        return this.queue.size();
    }
    
    public void enqueue(int number) {
        this.queue.addLast(number);
    }
    
    public int dequeue() {
        return this.queue.removeFirst();
    }
    
    public int peek() {
        return this.queue.peek();
    }
}

class QueueyOfStrings {
    private LinkedList<String> queue;
    
    public QueueyOfStrings() {
        this.queue = new LinkedList<>();
    }
    
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }
    
    public int size() {
        return this.queue.size();
    }
    
    public void enqueue(String item) {
        this.queue.addLast(item);
    }
    
    public String dequeue() {
        return this.queue.removeFirst();
    }
    
    public String peek() {
        return this.queue.peek();
    }
}

class Stacky {
    private LinkedList<String> stack;
    
    public Stacky() {
        this.stack = new LinkedList<>();
    }
    
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
    
    public int size() {
        return this.stack.size();
    }
    
    public void push(String item) {
        this.stack.addLast(item);
    }
    
    public String pop() {
        return this.stack.removeLast();
    }
    
    public String peek() {
        return this.stack.peek();
    }
}

public class SomeSnippetsTemplates79 {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("first");
        System.out.println(linkedList);
        linkedList.add("second");
        System.out.println(linkedList);
        ((LinkedList<String>) linkedList).addFirst("third");
        System.out.println(linkedList);
        ((LinkedList<String>) linkedList).addLast("fourth");
        System.out.println(linkedList);
        linkedList.add(2, "fifth");
        System.out.println(linkedList);
        
        System.out.println(linkedList.get(2));
        
        linkedList.clear();
        System.out.println(linkedList);
        
        linkedList.add("sixth");
        System.out.println(linkedList);
        
        linkedList.add("sixth");
        System.out.println(linkedList);
        System.out.println();
        
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        System.out.println("offer 1");
        linkedList2.offer(1);
        System.out.println("offer 2");
        linkedList2.offer(2);
        System.out.println("offer 3");
        linkedList2.offer(3);
        System.out.println("poll " + linkedList2.poll());
        System.out.println();
        
        QueueyOfNumbers numberQueue = new QueueyOfNumbers();
        System.out.println("enqueue 5");
        numberQueue.enqueue(5);
        System.out.println("enqueue 7");
        numberQueue.enqueue(7);
        System.out.println("enqueue 6");
        numberQueue.enqueue(6);
        System.out.println("size = " + numberQueue.size());
        System.out.println("dequeue " + numberQueue.dequeue());
        System.out.println("dequeue " + numberQueue.dequeue());
        System.out.println("isEmpty? " + numberQueue.isEmpty());
        System.out.println("peek = " + numberQueue.peek());
        System.out.println("size = " + numberQueue.size());
        System.out.println();
        
        QueueyOfStrings stringQueue = new QueueyOfStrings();
        System.out.println("enqueue \"first\"");
        stringQueue.enqueue("first");
        System.out.println("enqueue \"second\"");
        stringQueue.enqueue("second");
        System.out.println("enqueue \"third\"");
        stringQueue.enqueue("third");
        System.out.println("size = " + stringQueue.size());
        System.out.println("dequeue " + stringQueue.dequeue());
        System.out.println("dequeue " + stringQueue.dequeue());
        System.out.println("isEmpty? " + stringQueue.isEmpty());
        System.out.println("peek = " + stringQueue.peek());
        System.out.println("size = " + stringQueue.size());
        System.out.println();
        
        Stacky stringStack = new Stacky();
        System.out.println("push \"first\"");
        stringStack.push("first");
        System.out.println("push \"second\"");
        stringStack.push("second");
        System.out.println("push \"third\"");
        stringStack.push("third");
        System.out.println("size = " + stringStack.size());
        System.out.println("peek = " + stringStack.peek());
        System.out.println("pop " + stringStack.pop());
        System.out.println("pop " + stringStack.pop());
        System.out.println("pop " + stringStack.pop());
        System.out.println("isEmpty? " + stringStack.isEmpty());
        System.out.println("size = " + stringStack.size());
    }
}
