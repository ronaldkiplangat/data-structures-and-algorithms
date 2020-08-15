/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.binarytrees;

/**
 *
 * @author ronaldcheruiyot
 */
public class BinarySearch {
    
    private class Node {
        private int value;
        private Node left;
        private Node right;
    }
    
    public boolean isBST(Node n) {
        return isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public boolean isBST(Node n, int min, int max) {
        if(n == null) return true;
        if(n.value < min || n.value > max) return false;
        return isBST(n.left, min, n.value) && isBST(n.right, n.value + 1, max);
    }
    
}
