package com.jse.hackerrank.tasks00;

class LinkedList {
    private Node head;
    
    public LinkedList() {
        this.head = createLinkList();
    }
    
    public LinkedList(Node head) {
        this.head = head;
    }
    
    public LinkedList(boolean isWithLoop) {
        if (isWithLoop) {
            this.head = createLinkListWithLoop();
        }
    }
    
    public Node head() {
        return this.head;
    }
    
    private static Node createLinkList() {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node tail = new Node(3);
        
        /*head.next = node1;
        node1.next = tail;
        tail.next = null;*/
        head.setNext(node1);
        node1.setNext(tail);
        tail.setNext(null);
        
        return head;
    }
    
    private static Node createLinkListWithLoop() {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node tail = new Node(4);
        
        /*head.next = node1;
        node1.next = tail;
        tail.next = null;*/
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(tail);
        tail.setNext(node2);
        
        return head;
    }
    
    public void printElements(Node head) {
        while (head != null) {
            System.out.println(head.data());
            
            head = head.next();
        }
    }
    
    public Node insert(Node head, int x) {
        if (head == null) {
            Node newHead = new Node(x);
            /*newHead.data = x;
            newHead.next = null;*/
            newHead.setNext(null);
            this.head = newHead;
            
            return newHead;
        }
        
        Node newHead = new Node(x);
        /*newHead.data = x;
        newHead.next = head;*/
        newHead.setNext(head);
        this.head = newHead;
        
        return newHead;
    }
    
    public boolean hasCycle(Node head) {
        Node hare = head;
        Node tortoise = head;
        
        if (head == null) {
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
}

class Node {
    private int data;
    private Node next;
    /*int data;
    Node next;*/
    
    public Node(int data) {
        this.data = data;
    }
    
    public int data() {
        return this.data;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    public Node next() {
        return this.next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
        return Integer.toString(this.data);
    }
}

public class SomeSnippetsTemplates04 {
    public static void main(String[] args) {
        LinkedList firstLinkedList = new LinkedList(null);
        LinkedList secondLinkedList = new LinkedList();
        LinkedList thirdLinkedList = new LinkedList(true);
        
        System.out.println("first linkedlist:");
        firstLinkedList.printElements(firstLinkedList.head());
        System.out.println("second linkedlist:");
        secondLinkedList.printElements(secondLinkedList.head());
        System.out.println("third linkedlist:");
        
        if (thirdLinkedList.hasCycle(thirdLinkedList.head())) {
            System.out.println("has cycle");
        } else {
            secondLinkedList.printElements(thirdLinkedList.head());
        }
        
        Node nodeInFirstLinkedList = firstLinkedList.insert(
                firstLinkedList.head(), 10);
        Node nodeInSecondLinkedList = secondLinkedList.insert(
                secondLinkedList.head(), 20);
        
        System.out.println("last 2 inserted nodes, in first and second "
                + "linkedlists:");
        System.out.println(nodeInFirstLinkedList);
        System.out.println(nodeInSecondLinkedList);
        
        System.out.println("first linkedlist, head:");
        System.out.println(firstLinkedList.head());
        System.out.println("second linkedlist, head:");
        System.out.println(secondLinkedList.head());
        
        System.out.println("first linkedlist:");
        firstLinkedList.printElements(firstLinkedList.head());
        System.out.println("second linkedlist:");
        secondLinkedList.printElements(secondLinkedList.head());
    }
}
