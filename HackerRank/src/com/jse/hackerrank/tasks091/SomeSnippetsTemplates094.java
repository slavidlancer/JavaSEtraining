package com.jse.hackerrank.tasks091;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SomeSnippetsTemplates094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int element = scanner.nextInt();
            head = insert(head, element);
        }
        
        head = removeDuplicates(head);
        display(head);

        scanner.close();
    }
    
    public static Node insert(Node head, int data) {
        Node node = new Node(data);
        
        if (head == null) {
            head = node;
        } else if (head.next == null) {
            head.next = node;
        } else {
            Node start = head;
            
            while (start.next != null) {
                start = start.next;
            }
            
            start.next = node;
        }
        
        return head;
    }
    
    public static void display(Node head) {
        Node start = head;
        
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
        
    public static Node removeDuplicates(Node head) {
        if (head == null) {
            return null;
        }
        
        Node start = head;
            
        while (start.next != null) {
            if (start.data == start.next.data) {
                start.next = start.next.next;
            } else {
                start = start.next;
            }
        }
        
        return head;
    }
}
