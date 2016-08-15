package com.jse.tutorials.algorithms.searching.graphs;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        Node nodeA = new Node('A');
        Node nodeB = new Node('B');
        Node nodeC = new Node('C');
        Node nodeD = new Node('D');
        Node nodeE = new Node('E');
        Node nodeF = new Node('F');
        
        Graph graph = new Graph();
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);
        graph.setRootNode(nodeA);
        
        graph.connectNodesMatrix(nodeA, nodeB);
        graph.connectNodesMatrix(nodeA, nodeC);
        graph.connectNodesMatrix(nodeA, nodeD);
        graph.connectNodesMatrix(nodeB, nodeE);
        graph.connectNodesMatrix(nodeB, nodeF);
        graph.connectNodesMatrix(nodeC, nodeF);
        
        System.out.println("BFS graph traversal");
        graph.breadthFirstSearch();
    }
}
