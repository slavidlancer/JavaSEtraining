package com.jse.hackerrank;

public class SomeSnippetsTemplates03 {
    static class Node {
        int data;
        Node left;
        Node right;
        
        public Node(int data) {
            this.data = data;
        }
    }
    
    public static void main(String[] args) {
        //BinaryTree binaryTree = new BinaryTree(); //SomeSnippetsTemplates03
        Node root = createBinaryTree();
        
        System.out.println("pre-order:");
        preOrder(root); //BinaryTree.preOrder(root);
        
        System.out.println("\n\nin-order:");
        inOrder(root); //BinaryTree.inOrder(root);
        
        System.out.println("\n\npost-order:");
        postOrder(root); //BinaryTree.postOrder(root);
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
    
    static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        
        System.out.print(root.data + " ");
        
        preOrder(root.left);
        preOrder(root.right);
    }
    
    static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        
        System.out.print(root.data + " ");
    }
    
    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        
        inOrder(root.left);
        
        System.out.print(root.data + " ");
        
        inOrder(root.right);
    }
}
