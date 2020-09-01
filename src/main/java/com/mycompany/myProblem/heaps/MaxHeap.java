/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.heaps;

/**
 *
 * @author ronaldcheruiyot
 */
public class MaxHeap {
    private int[] HeapArray;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        HeapArray = new int[this.maxSize];
    }
    
    //Return position of parent
    public int parent(int pos) {
        return pos / 2;
    }
    
    //Return left child
    public int leftChild(int pos) {
        return (2 * pos) + 1;
    }
    
    //Return right child
    public int rightChild(int pos) {
        return (2 * pos) + 2;
    }
    
    //Is the given node a leaf
    public boolean isLeaf(int pos) {
        if(pos >= (size/2) && pos <= size) {
            return true;
        }
        return false;
    }
    
    //
    public void swap(int pos1, int pos2) {
        int temp = HeapArray[pos1];
        HeapArray[pos1] = HeapArray[pos2];
        HeapArray[pos2] = temp;
        
    
    }
    
    //Max heapify
    public void maxHeapify(int pos) {
        if(isLeaf(pos))
            return;
        
        if(HeapArray[pos] < leftChild(pos) || HeapArray[pos] < rightChild(pos)) {
            
            //If 
            if(leftChild(pos) > rightChild(pos)) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            } else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    
    }
    
    public void sort(int[] input) {
        
    
    }
    
    
}
