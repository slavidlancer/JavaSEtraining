package com.jse.hackerrank.tasks07;

class Node {
    private int data;
    private Node previous;
    private Node next;
    
    public Node(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
    
    public int data() {
        return this.data;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    public Node previous() {
        return this.previous;
    }
    
    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    
    public Node next() {
        return this.next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
}

public class SomeSnippetsTemplates70 {
    public static void main(String[] args) {
        Node head = new Node(0);
        
        display(head);
        System.out.println();
        
        head = insertIntoSortedList(head, 2);
        head = insertIntoSortedList(head, 3);
        head = insertIntoSortedList(head, 4);
        
        display(head);
        System.out.println();
        
        head = reverse(head);
        
        display(head);
    }
    
    private static void display(Node head) {
        Node start = head;
        
        while (start != null) {
            System.out.println(start.data() + " ");
            
            start = start.next();
        }
    }
    
    private static Node insertIntoSortedList(Node head, int data) {
        if (head == null) {
            Node node = new Node(data);
            
            return node;
        }
        
        Node node = head;
        
        while (node != null) {
            if (node.data() >= data) {
                Node current = new Node(data);
                current.setPrevious(node.previous());
                current.setNext(node);
                node.setPrevious(current);
                
                if (current.previous() == null) {
                    return current;
                } else {
                    current.previous().setNext(current);
                    
                    return head;
                }
            }
            
            if (node.next() == null) {
                Node current = new Node(data);
                current.setPrevious(node);
                current.setNext(null);
                node.setNext(current);
                
                break;
            }
            
            node = node.next();
        }
        
        return head;
    }
    
    private static Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        
        while (head != null) {
            Node node = head.previous();
            head.setPrevious(head.next());
            head.setNext(node);
            
            if (head.previous() == null) {
                return head;
            }
            
            head = head.previous();
        }
        
        return head;
    }
}
