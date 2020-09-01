/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.dfs;

import com.mycompany.myProblem.dfs.Graph.Vertex;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author ronaldcheruiyot
 */
public class DFS {
    
    public static void main(String[] args) {
        Set<Integer> result = traverseDepthFirst(new Graph().createGraph(), 0);
        System.out.println(result.toString());
    }
    
    public static Set<Integer> traverseDepthFirst(Graph graph, int root) {
        Set<Integer> visited = new LinkedHashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            int label = stack.pop();
            if(!visited.contains(label)) {
                visited.add(label);
                for(Vertex v: graph.getAdjVertices(label)) {
                    stack.push(v.label);
                }
            }
        }       
        return visited;
    }
    
    
//    public static Set<Integer> dfs(int[] input) {
//        Set<Integer> visited = new LinkedHashSet<>();
//        Stack<Integer> stack = new Stack<>();
//        int root = input[0];
//        stack.push(root);
//        while(!stack.isEmpty()) {
//            int label = stack.pop();
//            if(!visited.contains(label)) {
//                int left = input[2*i + 1];
//                int right = input[2* + 2];
//                stack.push(left);
//                stack.push(right);
//            }
//            
//        }
//    }
    
    public static int minimumSwaps(int[] input) {
        boolean[] visited = new boolean[input.length];
        int swaps = 0;
        for(int i = 0; i < input.length; i++) {
            int cycleSize = 0;
            int j = i;
            while(!visited[j]) {
                visited[j] = true;
                j = input[i] -1;
                cycleSize++;
            }
            if(cycleSize != 0) {
                swaps = swaps + (cycleSize - 1);
            }
            
        
        }
        return swaps;
    
    }
    
}
