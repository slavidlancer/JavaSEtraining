package com.jse.hackerrank.tasks08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    private int data;
    private Node left;
    private Node right;
    
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    
    public int data() {
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
    }
}

public class SomeSnippetsTemplates82 {
    public static void main(String[] args) {
        Node root = new Node(3,
                new Node(2,
                        new Node(1), null),
                new Node(5,
                        new Node(4), new Node(6, null,
                                new Node(7))));
        
        System.out.println("height = " + height(root));
        
        System.out.println("top view:");
        showTopView(root);
        
        System.out.println("\n\nlevel-order:");
        levelOrder(root);
        
        insertInBST(root, 4);
        
        System.out.println("\n\nlevel-order:");
        levelOrder(root);
        
        Node node = getLowestCommonAncestor(root, 1, 7);
        System.out.println("\nLowest Common Ancestor (1, 7) = " + node.data());
    }
    
    private static int height(Node root) {
        /*int leftHeight = 0;
        int rightHeight = 0;
        
        if (root != null) {
            if (root.left() != null) {
                leftHeight = height(root.left());
            } else {
                //return 0;
            }
            
            if (root.right() != null) {
                rightHeight = height(root.right());
            } else {
                return 0;
            }
        } else {
            return 0;
        }
        
        return (leftHeight > rightHeight) ? (leftHeight + 1) :
                (rightHeight + 1);*/
        
        if (root == null) {
            return -1;
        }
        
        int h = Math.max(height(root.left()), height(root.right())) + 1;
        
        return h;
    }
    
    private static void showTopView(Node root) {
        Node current = root;
        Stack<Node> stack = new Stack<>();
        
        while (current != null) {
            stack.push(current);
            
            current = current.left();
        }
        
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.data() + " ");
        }
        
        current = root.right();
        
        while (current != null) {
            System.out.print(current.data() + " ");
            
            current = current.right();
        }
    }
    
    private static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            
            if (node.left() != null) {
                queue.add(node.left());
            }
            
            if (node.right() != null) {
                queue.add(node.right());
            }
            
            System.out.print(node.data() + " ");
        }
    }
    
    private static Node insertInBST(Node root, int value) {
        Node node = root;
        
        if (node == null) {
            node = new Node(value);
            
            return node;
        }
        
        while (true) {
            if (value > node.data()) {
                if (node.right() != null) {
                    node = node.right();
                } else {
                    node.setRight(new Node(value));
                    
                    break;
                }
            } else {
                if (node.left() != null) {
                    node = node.left();
                } else {
                    node.setLeft(new Node(value));
                    
                    break;
                }
            }
        }
        
        return root;
    }
    
    private static Node getLowestCommonAncestor(Node root, int v1, int v2) {
        if (root == null) {
            return null;
        }
        
        if (v1 > v2) {
            int temp = v2;
            v2 = v1;
            v1 = temp;
        }
        
        while ((root.data() < v1) || (root.data() > v2)) {
            if (root.data() < v1) {
                root = root.right();
            } else if (root.data() > v2) {
                root = root.left();
            }
        }
        
        return root;
    }
}
