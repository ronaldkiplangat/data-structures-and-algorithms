/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ronaldcheruiyot
 */
public class Graph {
    
    private Map<Vertex, List<Vertex>> adjacentVertices;

    public Graph() {
    }
    
    

    public Graph(Map<Vertex, List<Vertex>> adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }

    public Map<Vertex, List<Vertex>> getAdjacentVertices() {
        return adjacentVertices;
    }

    public void setAdjacentVertices(Map<Vertex, List<Vertex>> adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }
       
    
    public class Vertex {
        int label;

        public Vertex(int label) {
            this.label = label;
        }
        
        
        
    }
    
    public void addVertex(int label) {      
        adjacentVertices.putIfAbsent(new Vertex(label), new ArrayList<>());      
    }
    
    public void removeVertex(int label) {
        Vertex v = new Vertex(label);
        adjacentVertices.values().stream().forEach(e -> e.remove(v));
        adjacentVertices.remove(new Vertex(label));
    }
    
    public void addEdge(int label1, int label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> l1 = adjacentVertices.get(v1);
        List<Vertex> l2 = adjacentVertices.get(v2);
        l1.add(v2);
        l2.add(v1);
    }
    
    public void removeEdge(int label1, int label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> l1 = adjacentVertices.get(v1);
        List<Vertex> l2 = adjacentVertices.get(v2);
        if(l1 != null && !l1.isEmpty()) {
            l1.remove(v2);
        }  
        if(l2 != null && !l2.isEmpty()) {
            l2.remove(v1);
        }    
        
    
    }
    
    public Graph createGraph() {
        Graph graph = new Graph(new HashMap<Vertex, List<Vertex>>());
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addVertex(7);
        graph.addVertex(8);
        graph.addVertex(9);
        graph.addVertex(10);
        graph.addEdge(1, 4);
        graph.addEdge(1, 2);
        graph.addEdge(4, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 10);
        graph.addEdge(2, 5);
        graph.addEdge(2, 8);
        graph.addEdge(2, 7);
        graph.addEdge(5, 8);
        graph.addEdge(5, 7);
        graph.addEdge(5, 6);
        graph.addEdge(7, 8);        
        return graph;
    }
    
    public List<Vertex> getAdjVertices(int label) {
        return adjacentVertices.get(new Vertex(label));
    }
    
    
}
