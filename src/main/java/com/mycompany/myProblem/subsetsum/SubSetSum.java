/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.subsetsum;
import java.util.Hashtable;

/**
 *
 * @author ronaldcheruiyot
 */
public class SubSetSum {
    
    public static void main(String[] args) {
        int[] testArray = {2,5,8,12,16,4};
        int testSum = 28;
        SubSetSum subsetSum = new SubSetSum();
        boolean result = subsetSum.isSubsetPresent(testArray, testSum);
        boolean result1 = subsetSum.isSubsetPresent1(testArray, testSum);
        System.out.println("Result: " + result);
        System.out.println("Result1: " + result);
    }
    
    public boolean isSubsetPresent(int[] array, int sum) {
        for(int i = 0; i < array.length; i++) {
           for(int j = 0; j < array.length; j++) {
               if(i != j) {
                   int testSum = array[i] + array[j]; //constant time
                   if(testSum == sum) return true; //constant time
               }
           } 
        }
        return false;
    }
    
    public boolean isSubsetPresent1(int[] testArray, int testSum) {
        Hashtable table = new Hashtable(); //Constant time lookup
        for(int i = 0; i < testArray.length; i++) {
            int value = testArray[i];
            int complement = testSum - value;
            boolean isPresent = table.contains(value);
            if(isPresent) 
                return true;
            
            table.put(complement, complement);
        }
        
        return false;
    }
    
}
