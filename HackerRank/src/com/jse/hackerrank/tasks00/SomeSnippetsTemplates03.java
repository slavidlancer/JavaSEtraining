package com.jse.hackerrank.tasks00;

class BinaryTree {
    private Node root;
    
    public BinaryTree() {
        this.root = createBinaryTree();
    }
    
    private static Node createBinaryTree() {
        Node root = new Node(3);
        Node node1 = new Node(5);
        Node node2 = new Node(1);
        Node node3 = new Node(4);
        Node node4 = new Node(2);
        Node node5 = new Node(6);
        
        root.left = node1;
        root.right = node4;
        
        node1.left = node2;
        node1.right = node3;
        
        node4.left = node5;
        node4.right = null;
        
        return root;
    }
    
    public Node root() {
        return this.root;
    }
    
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        
        System.out.print(root.data + " ");
        
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        
        System.out.print(root.data + " ");
    }
    
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        
        inOrder(root.left);
        
        System.out.print(root.data + " ");
        
        inOrder(root.right);
    }
    
    private static class Node {
        private int data;
        private Node left;
        private Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
        /*public int data() {
            return this.data;
        }
        
        public void setData(int data) {
            this.data = data;
        }
        
        public Node left() {
            return this.left;
        }
        
        public void setLeft(Node left) {
            this.left = left;
        }
        
        public Node right() {
            return this.right;
        }
        public void setRight(Node right) {
            this.right = right;
        }*/
    }
}

public class SomeSnippetsTemplates03 {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        
        System.out.println("pre-order:");
        BinaryTree.preOrder(binaryTree.root());
        
        System.out.println("\n\nin-order:");
        BinaryTree.inOrder(binaryTree.root());
        
        System.out.println("\n\npost-order:");
        BinaryTree.postOrder(binaryTree.root());
    }
}
