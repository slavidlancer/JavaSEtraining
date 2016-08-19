package com.jse.hackerrank.tasks06;

import java.util.Scanner;

class LinkedList {
    private Node head;
    private int count;
    
    public LinkedList() {
        this.head = null;
        this.count = 0;
    }
    
    public LinkedList(Node head) {
        this.head = head;
        this.count = 1;
    }
    
    public Node head() {
        return this.head;
    }
    
    public void add(int data) {
        Node temp = new Node(data);
        
        if (this.head == null) {
            this.head = temp;
            this.count = 1;
        } else {
            Node current = this.head;
            
            while (current.next() != null) {
                current = current.next();
            }
            
            current.setNext(temp);
            this.count++;
        }
    }
    
    public int get(int index) {
        if (index <= 0) {
            return -1; //throw new Exception();
        }
        
        if (this.head == null) {
            return -1; //throw new Exception();
        } else {
            Node current = this.head;
            
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
        
        Node current = this.head;
        
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

class Node {
    private int data;
    private Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
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
}

public class SomeSnippetsTemplates69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        int N = scanner.nextInt();
        
        while (N-- > 0) {
            int element = scanner.nextInt();
            head = insert(head, element);
        }
        
        display(head);
        
        head = delete(head, 0);
        System.out.println();
        
        display(head);
        
        head = delete(head, 2);
        System.out.println();
        
        display(head);
        
        System.out.println("node at 2nd back from tail: " + getNode(head, 2));
        
        head = insertNTh(head, 9, 2);
        
        display(head);
        System.out.println();
        printReversed(head);
        
        System.out.println();
        head = reverse(head);
        display(head);
        
        System.out.println();
        head = removeDuplicatesInSortedList(head);
        display(head);
        
        scanner.close();
        System.out.println();
        
        LinkedList linkedList = new LinkedList();
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
        System.out.println(linkedList.get(-1));
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(3));
        
        System.out.println("comparison = " +
                compareLists(head, linkedList.head()));
        
        head = mergeSortedLists(head, linkedList.head());
        display(head);
        
        int mergeNode = findMergeNode(head, linkedList.head());
        System.out.println("position of merge node = " + mergeNode);
    }
    
    private static void display(Node head) {
        Node start = head;
        
        while (start != null) {
            System.out.println(start.data() + " ");
            
            start = start.next();
        }
    }
    
    private static Node insert(Node head, int data) {
        Node newHead = new Node(data);
        
        if (head == null) {
            return newHead;
        }
        
        Node start = head;
        
        while (start.next() != null) {
            start = start.next();
        }
        
        start.setNext(newHead);
        
        return head;
    }
    
    private static Node delete(Node head, int position) {
        Node node = head;
        
        if (position == 0) {
            head = head.next();
        } else {
            for (int i = 1; i < position; i++) {
                if (node != null) {
                    node = node.next();
                }
            }
            
            if (node != null) {
                Node nodeToDelete = node.next();
                node.setNext(nodeToDelete.next());
            }
        }
        
        return head;
    }
    
    private static int getNode(Node head, int n) {
        int numberOfNodes = 0;
        Node node = head;
        
        while (node != null) {
            node = node.next();
            
            numberOfNodes++;
        }
        
        numberOfNodes -= n;
        
        while (--numberOfNodes > 0) {
            head = head.next();
        }
        
        return head.data();
    }
    
    private static Node insertNTh(Node head, int data, int position) {
        Node node = head;
        
        if (position == 0) {
            node = new Node(data);
            node.setNext(head);
            
            return node;
        } else {
            while (--position > 0) {
                node = node.next();
            }
            
            Node newNode = node.next();
            node.setNext(new Node(data));
            node.next().setNext(newNode);
            
            return head;
        }
    }
    
    private static void printReversed(Node head) {
        Node node = head;
        StringBuilder stringBuilder = new StringBuilder();
        
        while (node != null) {
            stringBuilder.insert(0, (Integer.toString(node.data()) + '\n'));
            
            node = node.next();
        }
        
        System.out.print(stringBuilder);
    }
    
    private static Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        
        Node node = null;
        
        while (head != null) {
            Node current = node;
            node = new Node(head.data());
            node.setNext(current);
            
            head = head.next();
        }
        
        return node;
    }
    
    private static int compareLists(Node headA, Node headB) {
        if ((headA == null) && (headB == null)) {
            return 1;
        }
        
        while (headA.data() == headB.data()) {
            if (headA.next() == null) {
                if (headB.next() == null) {
                    return 1;
                } else {
                    return 0;
                }
            }
            
            headA = headA.next();
            headB = headB.next();
        }
        
        return 0;
    }
    
    private static Node removeDuplicatesInSortedList(Node head) {
        Node node = head;
        
        if (head == null) {
            return null;
        }
        
        while (head.next() != null) {
            if (head.data() == head.next().data()) {
                head.setNext(head.next().next());
            } else {
                head = head.next();
            }
        }
        
        return node;
    }
    
    private static Node mergeSortedLists(Node headA, Node headB) {
        if (headA == null) {
            return headB;
        }
        
        if (headB == null) {
            return headA;
        }
        
        if (headA.data() < headB.data()) {
            headA.setNext(mergeSortedLists(headA.next(), headB));
            
            return headA;
        } else {
            headB.setNext(mergeSortedLists(headA, headB.next()));
            
            return headB;
        }
    }
    
    private static int findMergeNode(Node headA, Node headB) {
        int headALength = 0;
        int headBLength = 0;
        Node headACopy = headA;
        Node headBCopy = headB;
        
        while (headACopy != null) {
            headACopy = headACopy.next();
            headALength++;
        }
        
        while (headBCopy != null) {
            headBCopy = headBCopy.next();
            headBLength++;
        }
        
        while (headALength > headBLength) {
            headA = headA.next();
            
            headALength--;
        }
        
        while (headBLength > headALength) {
            headB = headB.next();
            
            headBLength--;
        }
        
        while (headA != null) {
            if (headA == headB) {
                return headA.data();
            }
            
            headA = headA.next();
            headB = headB.next();
        }
        
        return -1;
    }
}
