/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.subsetsum;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author ronaldcheruiyot
 */
public class EqualsSubestSum {
    
    public static boolean isSubsetSum(int[] a, int sum) {
        
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(i != j) {
                    int result = a[i] + a[j];
                    if(result == sum) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int[] a = {2, 5, 8, 7};
        int s = 14;
        //boolean k = isSubsetSum(a,s);
        boolean k = isSubsetSum1(a,s);
        System.out.println("Result: " + k);
        
    }
    
    public static boolean isSubsetSum1(int[] a, int sum) {
        Hashtable complements = new Hashtable();// constant time lookup
        for(int i = 0; i < a.length; i++) {
            int current = a[i];
            if(complements.contains(current))
                return true;    
            int complement = sum - current;
            complements.put(complement, complement);
        }    
        return false;
    }
}
