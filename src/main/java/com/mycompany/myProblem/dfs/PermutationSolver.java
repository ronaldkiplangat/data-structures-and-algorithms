/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.dfs;

import java.util.Arrays;

/**
 *
 * @author ronaldcheruiyot
 */
public class PermutationSolver {
    static int[] tracker = new int[3];
    static int[] result = new int[3];
    
    public static void main(String[] args) {
        Arrays.fill(tracker, 0);
        int[] input = {1,2,3};
        solve(input, 0);
        
    }
    
    //1 --> Check available choices
    //2 --> Pick one and remove from pool
    //3 --> Check avaiable choices
    //4 --> Pick one and remove from pool
    //5 --> No more choices? go back and pick the ones left
    //123 000
    //1   100    
    
    
    public static void solve(int[] input, int k) {
        
        
        if(k > input.length) {
            System.out.println(Arrays.toString(result));
        } else {
            for(int j = 0; j < tracker.length; j++) {
                if(tracker[j] == 0) {
                    result[k] = input[k];
                    tracker[j] = 1;
                    solve(input, k + 1);
                    tracker[j] = 0;
                } 
        }   
        
        }
        
    }
    
}
