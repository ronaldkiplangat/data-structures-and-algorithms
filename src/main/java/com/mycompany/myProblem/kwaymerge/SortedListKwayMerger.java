/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.kwaymerge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author ronaldcheruiyot
 */
public class SortedListKwayMerger {
    
    public LinkedList<Integer> merge(List<LinkedList<Integer>> input, int currentSize, LinkedList<Integer> output) {
        if(currentSize == 0)
           return output;
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
        for(LinkedList <Integer> ll: input) {
            if(ll.size() != 0) {
                int firstElement = ll.getFirst();
                ll.remove(0);
                minHeap.add(firstElement);
                map.put(firstElement, ll); 
            }
        }    
        int minimum = minHeap.poll();
        LinkedList<Integer> retrievedList = map.get(minimum);
        retrievedList.removeFirst();
        List<LinkedList<Integer>> next = new ArrayList<>();
        for(Map.Entry me: map.entrySet()) {
            LinkedList<Integer> value = (LinkedList<Integer>) me.getValue();
            next.add(value);
            
        }
        output.add(minimum);
        currentSize--;
        return merge(next, currentSize, output);
    
    }
    
    
    public static void main(String[] args) {
        LinkedList<Integer> lst1 = new LinkedList<>();
        lst1.add(1);
        lst1.add(4);
        lst1.add(5);
        LinkedList<Integer> lst2 = new LinkedList<>();
        lst1.add(1);
        lst1.add(3);
        lst1.add(4);
        LinkedList<Integer> lst3 = new LinkedList<>();
        lst1.add(2);
        lst1.add(6);
        
        List<LinkedList<Integer>> mainList = new ArrayList<>();
        mainList.add(lst1);
        mainList.add(lst2);
        mainList.add(lst3);
        
        SortedListKwayMerger kwayMerger = new SortedListKwayMerger();
        
        
        List<Integer> result = kwayMerger.merge(mainList, 8, new LinkedList<>());
        
        System.out.print("Result: " + result);
        
    }
    
}


