package com.jse.hackerrank.tasks10;

class LinkedList<T> {
    private Node<T> head;
    private int count;
    
    public LinkedList() {
        this.head = null;
        this.count = 0;
    }
    
    public LinkedList(Node<T> head) {
        this.head = head;
        this.count = 1;
    }
    
    public Node<T> head() {
        return this.head;
    }
    
    public void add(T data) {
        Node<T> temp = new Node<>(data);
        
        if (this.head == null) {
            this.head = temp;
            this.count = 1;
        } else {
            Node<T> current = this.head;
            
            while (current.next() != null) {
                current = current.next();
            }
            
            current.setNext(temp);
            this.count++;
        }
    }
    
    public T get(int index) throws Exception {
        if (index <= 0) {
            throw new Exception("invalid index");
        }
        
        if (this.head == null) {
            throw new Exception("null head");
        } else {
            Node<T> current = this.head;
            
            for (int i = 1; i < index; i++) {
                current = current.next();
            }
            
            return current.data();
        }
    }

    public int size() {
        return this.count;
    }
    
    public boolean isEmpty() {
        return (this.head == null); //(this.count == 0)
    }
    
    public void remove() {
        if (this.head == null) {
            return;
        }
        
        Node<T> current = this.head;
        
        if (current.next() == null) {
            this.head = null;
            
            return;
        }
        
        while (current.next().next() != null) {
            current = current.next();
        }
        
        current.setNext(null);
        this.count--;
    }
}

class Node<T> {
    private T data;
    private Node<T> next;
    
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
    
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
    
    public T data() {
        return this.data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public Node<T> next() {
        return this.next;
    }
    
    public void setNext(Node<T> next) {
        this.next = next;
    }
}

public class SomeSnippetsTemplates100 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.remove();
        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());
        linkedList.add(666);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        display(linkedList.head());
        linkedList.add(4);
        display(linkedList.head());
        linkedList.remove();
        display(linkedList.head());
        System.out.println();
        
        try {
            System.out.println(linkedList.get(-1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println(linkedList.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println(linkedList.get(3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void display(Node head) {
        Node start = head;
        
        while (start != null) {
            System.out.println(start.data() + " ");
            
            start = start.next();
        }
    }
}
