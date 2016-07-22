package com.jse.tutorials.data_structures.tree.binary_search;

public class BinarySearchTree<T> {
    public Node<T> root;
    
    @SuppressWarnings("hiding")
    class Node<T> {
        T data;
        Node<T> left; 
        Node<T> right;
        
        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public BinarySearchTree() {
        this.root = null;
    }
    
    public static void main(String[] args) {
        
    }
}
