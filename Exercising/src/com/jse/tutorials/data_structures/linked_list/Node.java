package com.jse.tutorials.data_structures.linked_list;

public class Node<T> {
    private Node<T> next;
    private T data;
    
    public Node (T data) {
        this.data = data;
    }
    
    public Node<T> next() {
        return this.next;
    }
    
    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    public T data() {
        return this.data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return this.data.toString();
    }
}
