package com.jse.tutorials.algorithms.searching.graphs;

public class Node {
    private char label;
    private boolean visited = false;
    
    public Node(char label) {
        this.label = label;
    }
    
    public char label() {
        return this.label;
    }
    
    public void setLabel(char label) {
        this.label = label;
    }
    
    public boolean isVisited() {
        return this.visited;
    }
    
    public void makeVisited() {
        this.visited = true;
    }
    
    public void makeUnvisited() {
        this.visited = false;
    }
}
