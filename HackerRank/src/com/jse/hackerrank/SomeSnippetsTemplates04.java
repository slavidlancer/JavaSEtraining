package com.jse.hackerrank;

public class SomeSnippetsTemplates04 {
    static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
        }
    }
    
    public static void main(String[] args) {
        //LinkedList linkedList = new LinkedList(); //SomeSnippetsTemplates04
        Node headOffirstLinkedList = null;
        Node headOfSecondLinkedList = createLinkList();
        
        printElements(headOffirstLinkedList); //LinkedList.printElements(headOffirstLinkedList);
        printElements(headOfSecondLinkedList); //LinkedList.printElements(headOfSecondLinkedList);
        
        headOffirstLinkedList = insert(headOffirstLinkedList, 10);
        headOfSecondLinkedList = insert(headOfSecondLinkedList, 20);
        
        System.out.println(headOffirstLinkedList.data);
        System.out.println(headOfSecondLinkedList.data + "\n");
        
        printElements(headOffirstLinkedList);
        System.out.println();
        printElements(headOfSecondLinkedList);
    }
    
    private static Node createLinkList() {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node tail = new Node(3);
        
        head.next = node1;
        node1.next = tail;
        tail.next = null;
                
        return head;
    }
    
    static void printElements(Node head) {
        while (head != null) {
            System.out.println(head.data);
            
            head = head.next;
        }
    }
    
    static Node insert(Node head,int x) {
        if (head == null) {
            Node newHead = new Node(x);
            //newHead.data = x;
            newHead.next = null;
            
            return newHead;
        }
        
        Node newHead = new Node(x);
        //newHead.data = x;
        newHead.next = head;
        
        return newHead;
    }
}
