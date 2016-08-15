package com.jse.tutorials.algorithms.searching.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private Node rootNode;
    private List<Node> nodes = new ArrayList<>();
    private int[][] adjacencyMatrix;
    private List<List<Node>> adjacencyListArray = new ArrayList<>();
    private int size;
    
    public void setRootNode(Node root) {
        this.rootNode = root;
    }
    
    public Node getRootNode() {
        return this.rootNode;
    }
    
    public void addNode(Node node) {
        this.nodes.add(node);
    }
    
    public void connectNodesMatrix(Node start, Node end) {
        if (this.adjacencyMatrix == null) {
            this.size = this.nodes.size();
            this.adjacencyMatrix = new int[this.size][this.size];
        }
        
        int startIndex = this.nodes.indexOf(start);
        int endIndex = this.nodes.indexOf(end);
        
        this.adjacencyMatrix[startIndex][endIndex] = 1;
        this.adjacencyMatrix[endIndex][startIndex] = 1;
    }
    
    public void connectNodesList(Node from, Node... tos) {
        int fromIndex = this.nodes.indexOf(from);
        List<Node> adjacentNodes = new ArrayList<>();
        
        for (Node node : tos) {
            adjacentNodes.add(node);
        }
        
        this.adjacencyListArray.add(fromIndex, adjacentNodes);
    }
    
    public void breadthFirstSearch() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.rootNode);
        
        this.rootNode.makeVisited();
        printNode(this.rootNode);
        
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            Node child = null;
            
            while ((child = getUnvisitedChildNode(node)) != null) {
                child.makeVisited();
                printNode(child);
                queue.add(child);
            }
        }
        
        clearNodes();
    }
    
    public void depthFirstSearch() {
        Stack<Node> stack = new Stack<>();
        stack.push(this.rootNode);
        
        this.rootNode.makeVisited();
        printNode(this.rootNode);
        
        while (!stack.isEmpty()) {
            Node node = stack.peek();
            Node child = getUnvisitedChildNode(node);
            
            if (child != null) {
                child.makeVisited();
                printNode(child);
                stack.push(child);
            } else {
                stack.pop();
            }
        }
        
        clearNodes();
    }
    
    private Node getUnvisitedChildNode(Node node) {
        int index = this.nodes.indexOf(node);
        int j = 0;
        
        while (j < this.size) {
            if ((this.adjacencyMatrix[index][j] == 1) &&
                    (this.nodes.get(j).isVisited() == false)) {
                return this.nodes.get(j);
            }
            
            j++;
        }
        
        return null;
    }
    
    private void clearNodes() {
        int i = 0;
        
        while (i < this.size) {
            Node node = this.nodes.get(i);
            node.makeUnvisited();
            
            i++;
        }
    }
    
    private void printNode(Node node) {
        System.out.println(node.label());
    }
}
