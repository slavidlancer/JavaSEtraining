package com.jse.tutorials.data_structures.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private List<Edge> neighborhood;
    private String label;
    
    public Vertex(String label) {
        this.label = label;
        this.neighborhood = new ArrayList<>();
    }
}
