/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.stringmanipulation;

/**
 *
 * @author ronaldcheruiyot
 */
public class Permutation {
    
    public static void main(String[] args) {
        
    }
    
   
    //a, b, c
    //a, c, b
    
    //b, a, c
    //b, c, a
   
    
    //c, a, b
    //c, b, a
    
    
    public static void permute(char[] input, int pos, boolean[] tracker, char[] original) {
        if(pos == input.length - 1) {
            System.out.println(input);
        } else {
            for(int i = 0; i < tracker.length; i++) {
                if(tracker[i] == false) {
                    input[pos] = original[i];
                    tracker[i] = true;
                    permute(input, pos++, tracker, original);
                    tracker[i] = false;
                    
                }
            }
        }
        
    }
    
    
}
