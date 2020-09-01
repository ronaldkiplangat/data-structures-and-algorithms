/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.dfs;

import com.mycompany.myProblem.dfs.Graph.Vertex;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author ronaldcheruiyot
 */
public class BFS {
    
    public void bFS(Graph graph, int s) {
        Queue<Integer> queue = new LinkedList<>();
        int n = graph.getAdjacentVertices().size();
        boolean visited[] = new boolean[n]; 
        queue.add(s);
        
        while(!queue.isEmpty()) {
            int k = queue.poll();
            if(visited[k] == false) {
                visited[k] = true;
                List<Vertex> adjacent = graph.getAdjVertices(k);
                for(Vertex v: adjacent) {
                    queue.add(v.label);
                }
            
            }
            
            
        }
    }
    
}
