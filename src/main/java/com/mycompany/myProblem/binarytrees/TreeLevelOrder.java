/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.binarytrees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ronaldcheruiyot
 */
public class TreeLevelOrder {
    
    //Given a tree, write a function that prints out the nodes of the tree in level order
    
    public static void main(String[] args) {
        
    }
    
    private class Node {
        int value;
        Node left;
        Node right;
    }
    
    public static void print(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node curr = queue.remove();
            System.out.println(curr.value);
            if(curr.left != null) {
                queue.add(curr.left);
            }
            if(curr.right != null) {
                queue.add(curr.right);
            }
        }
    }
    
}
