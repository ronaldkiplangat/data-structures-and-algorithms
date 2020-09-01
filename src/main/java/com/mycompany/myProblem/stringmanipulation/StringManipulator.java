/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.stringmanipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 *
 * @author ronaldcheruiyot
 */
public class StringManipulator {
    
    private static int MAX_NO_OF_CHARACTERS = 256;
    
    public static void main(String[] args) {
        String in = "RONALD";
        String out = reverse(in);
        System.out.println("Reversed: " + out);
        String input = "jv";
        String output = maximumOccuringChar(input);
        System.out.println("Max occureing: " + output);
        String dup = removeDuplicates("geeksforgeeks");
        System.out.println("Duplicates removed: " + dup);
    }
    
    public static String reverse(String input) {
        char[] inputArray = input.toCharArray();
        char[] outputArray = new char[input.length()];
        int startIndex = 0;
        for(int i = inputArray.length - 1; i >= 0; i--) {
            outputArray[startIndex] = inputArray[i];
            startIndex++;
        }
        String output = String.valueOf(outputArray);
        return output;
    }
    
    public static String maximumOccuringChar(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if(map.containsKey(current)) {
                int count = map.get(current);
                count++;
                map.put(current, count);
            } else {
                map.put(current, 1);
            }
        
        }
        
        int maxValue = 0;
        char maxChar = ' ';
        for(Map.Entry entry: map.entrySet()) {
            char key = (Character)entry.getKey();
            int value = (Integer)entry.getValue();
            if(value > maxValue) {
                maxValue = value;
                maxChar = key;
            }
        }
        return String.valueOf(maxChar);
    
    }
    
    
    public static boolean areAnagrams(String str1, String str2) {
        int[] array1 = new int[MAX_NO_OF_CHARACTERS];
        Arrays.fill(array1, 0);
        int[] array2 = new int[MAX_NO_OF_CHARACTERS];
        Arrays.fill(array1, 0);
        
        if(str1.length() != str2.length()) {
            return false;
        }
        
        for(int i = 0; i < str1.length() && i < str2.length(); i++) {
            array1[str1.charAt(i)]++;
            array2[str1.charAt(i)]++;
        }
        
        for(int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    
    }
    
    public static boolean areAnagrams1(String str1, String str2) {
        int[] referenceArray = new int[MAX_NO_OF_CHARACTERS];
        Arrays.fill(referenceArray, 0);
       
        
        if(str1.length() != str2.length()) {
            return false;
        }
        
        for(int i = 0; i < str1.length(); i++) {
            referenceArray[str1.charAt(i)]++;
            referenceArray[str2.charAt(i)]--;
            if(referenceArray[str1.charAt(i)] != 0) {
                return false;
            }
        }
        
        return true;
    
    }
    
    public static String removeDuplicates(String input) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        char[] inputArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c: inputArray) {
            set.add(c);
        }
        for(char c: set) {
            sb.append(c);
        }
        
        return String.valueOf(sb);
    
    }
    
    
}
