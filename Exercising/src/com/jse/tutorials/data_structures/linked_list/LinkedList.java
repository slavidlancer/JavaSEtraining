package com.jse.tutorials.data_structures.linked_list;

public class LinkedList<T> {
    private Node<T> head;
    
    public LinkedList() {
        this.head = new Node<T>(null);
    }
    
    public Node<T> head() {
        return this.head;
    }
    
    public void appendToTail(Node<T> node) {
        Node<T> current = this.head;
        
        while (current.next() != null) {
            current = current.next();
        }
        
        current.setNext(node);
    }
    
    public boolean hasCycle() {
        Node<T> tortoise = this.head;
        Node<T> hare = this.head;
        
        if (this.head == null) {
            return false;
        }
        
        while ((hare != null) && (hare.next() != null)) {
            tortoise = tortoise.next();
            hare = hare.next().next();
            
            if (hare == null) { //|| (tortoise == null)
                return false;
            }
            
            if (hare == tortoise) {
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<T> current = this.head.next();
        
        if (this.head != null) {
            stringBuilder.append("head(" + this.head.data() + ")").append("->");
        }
        
        /*if (current == null) {
            stringBuilder.delete(stringBuilder.length() - 2,
                    stringBuilder.length());
        }*/
        
        while (current != null) {
            stringBuilder.append(current).append("->");
            
            current = current.next();
            
            /*if (current == null) {
                stringBuilder.delete(stringBuilder.length() - 2,
                        stringBuilder.length());
            }*/
        }
        
        if (current == null) {
            stringBuilder.append("null");
        }
        
        return stringBuilder.toString();
    }
}
