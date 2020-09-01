/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.binarytrees;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author ronaldcheruiyot
 */
public class HuffmanEncoder {
    
    public static void main(String[] args) {
        solve();
    }
    
    private static class HuffmanNode {
        int data;
        char c;
        
        HuffmanNode left;
        HuffmanNode right;
    
    }
    
    private static class CustomComparator implements Comparator<HuffmanNode> {

        @Override
        public int compare(HuffmanNode arg0, HuffmanNode arg1) {
           return  arg0.data - arg1.data; //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    public static void printCharacter(HuffmanNode root, String s) {
        
        if(root.left == null && root.right == null && Character.isLetter(root.c)) {
            System.out.println(root.c + ": " + s);
            return;
        }
        printCharacter(root.left, s + "0");
        printCharacter(root.right, s + "1");
    
    }
    
    public static void solve() {
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };
        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>(charArray.length, new CustomComparator());
        
        for(int i = 0; i < charArray.length; i++) {
            HuffmanNode node = new HuffmanNode();
            node.c = charArray[i];
            node.data = charfreq[i];
            
            queue.add(node);
        }
       
        HuffmanNode root = new HuffmanNode();
        
        while(queue.size() > 1) {
            HuffmanNode i = queue.peek();
            queue.poll();
            
            HuffmanNode j = queue.peek();
            queue.poll();
            
            HuffmanNode k = new HuffmanNode();
            k.data = i.data + j.data;
            
            k.c = '-';
            k.left = i;
            k.right = j;
            root = k;
            
            queue.add(k);
        }
        
        printCharacter(root, "");
        
    }
    
}
