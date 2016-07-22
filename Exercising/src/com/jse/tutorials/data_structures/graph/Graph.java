package com.jse.tutorials.data_structures.graph;

import java.util.HashMap;
import java.util.Map;

public class Graph {
    private Map<String, Vertex> vertices;
    private Map<Integer, Edge> edges;
    
    public Graph() {
        this.vertices = new HashMap<>();
        this.edges = new HashMap<>();
    }
    
    public static void main(String[] args) {
        
    }
}
