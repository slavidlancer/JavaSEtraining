package com.jse.tutorials.data_structures.tree;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    private T data;
    private List<Node<T>> children;
    private Node<T> parent;
    
    public Node(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}
