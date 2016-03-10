package com.jse.fundamentals.oop.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    private List<Vertex> vertices;
    
    protected Shape() {
        this.vertices = new ArrayList<>();
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void addVertices(Vertex... vertices) {
        for (Vertex vertex : vertices) {
            this.vertices.add(vertex);
        }
    }
}
