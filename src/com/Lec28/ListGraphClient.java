package com.Lec28;

public class ListGraphClient {
    public static void main(String[] args) {

        AdjacencyListGraph<String> graph = new AdjacencyListGraph<>();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("C", "D");
        graph.addEdge("D", "B");
        graph.addEdge("A", "D");

//        graph.display();

//        graph.BFT();

//        graph.DFT();

//        graph.connectedComponents();

        System.out.println(graph.bipartite());
    }
}
