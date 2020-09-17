/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.kwaymerge;

import java.util.PriorityQueue;

/**
 *
 * @author ronaldcheruiyot
 */
public class KSortedListMerger {
    
//    The function merge() takes in a 2d array of sorted arrays and retuns a merged sorted array containing all the elements in the original array
    
    public static void main(String[] args) {
     
    }
    
    private static class QueueNode implements Comparable<QueueNode> {
        int array, index, value;
        
        @Override
        public int compareTo(QueueNode node) {
            if(value > node.value) return 1;
            if(value < node.value) return -1;
            else return -1;
                    
        }

        public QueueNode(int array, int index, int value) {
            this.array = array;
            this.index = index;
            this.value = value;
        }
        
        
        
    }
    
    public static int[] merge(int[][] arrayList) {
            PriorityQueue<QueueNode> queue = new PriorityQueue<>();
            int length = 0;
            for(int i = 0; i < arrayList.length; i++) {
                if(arrayList[i].length > 0) {
                    int element = arrayList[i][0];
                    QueueNode node = new QueueNode(i, 0, element);
                    queue.add(node);
                    length = length + 1;
                }
            }
            
            int[] result = new int[length];
            
            for(int i = 0; i < length; i++) {
                QueueNode qn = queue.poll();
                int value = qn.value;
                result[i] = value;
            }
            
            return result;
        }
    
    
}
