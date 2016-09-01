package com.jse.hackerrank.tasks09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    Node left, right;
    int data;
    
    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class SomeSnippetsTemplates91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Node root = null;
        
        while (t-- > 0) {
            int data = scanner.nextInt();
            root = insert(root, data);
        }
        
        int height = getHeight(root);
        
        System.out.println(height);
        
        levelOrder(root);
        
        scanner.close();
    }
    
    public static Node insert(Node root, int data){
        if (root == null) {
            return new Node(data);
        } else {
            Node current;
            
            if (data <= root.data) {
                current = insert(root.left, data);
                root.left = current;
            } else {
                current = insert(root.right, data);
                root.right = current;
            }
            
            return root;
        }
    }
    
    public static int getHeight(Node root) {
        if (root == null) {
            return -1;
        }
        
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
    
    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        
        if (root != null) {
            queue.offer(root);
            
            while (!queue.isEmpty()) {
                Node current = queue.poll();
                
                System.out.print(current.data + " ");
                
                if (current.left != null) {
                    queue.offer(current.left);
                }
                
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
    }
}
