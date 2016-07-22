package com.jse.tutorials.data_structures.graph;

public class Edge implements Comparable<Edge> {
    private Vertex one, two;
    private int weight;
    
    public Edge(Vertex one, Vertex two) {
        this(one, two, 1);
    }
    
    public Edge(Vertex one, Vertex two, int weight) {
        this.one = one; //compareTo
        this.two = two; //compareTo
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return 0;
    }
}
