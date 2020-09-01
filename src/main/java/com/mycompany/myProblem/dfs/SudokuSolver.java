/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myProblem.dfs;

/**
 *
 * @author ronaldcheruiyot
 */
public class SudokuSolver {
    
    public static void main(String[] args) {
        
    }
    
    public static void printBoard(int[][] board) {
    
    }
    
    public static Pair findEmpty(int[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                int value = board[i][j];
                if( value == 0) {
                    return new Pair(i, j);
                }
            }    
        }
        
        return null;
    }
    
    public static boolean is_valid(Pair position, int[][] board, int number) {
        //row = k
        //column = l
        int k = position.getK();
        int l = position.getL();
        int currentValue = board[k][l];
        
        //loop all values in current row -->int[k][i]
        for(int i = 0; i < board.length; i++) {
            int rowValue = board[k][i];
            if(rowValue == currentValue) {
                return false;
            }
        }
        
        for(int j = 0; j < board.length; j++) {
            int rowValue = board[l][j];
            if(rowValue == currentValue) {
                return false;
            }
        }
        
    
        return true;
    }
    
    public static boolean solve(int[][] input) {
        Pair position = findEmpty(input);
        if(position == null) {
            return true;
        }
        int k = position.getK();
        int l = position.getL();        
        for(int i = 1; i < 10; i++) {
            if(is_valid(position, input, i)) {
                input[k][l] = i;
                if(solve(input)) {
                    return true;
                };
            } else {
                input[k][l] = 0;
            }
        }
        return false;
    
    }
            
            
    private static class Pair {
        
        //row
        private int k;
        //column
        private int l;

        public Pair(int k, int l) {
            this.k = k;
            this.l = l;
        }

        public int getK() {
            return k;
        }

        public void setK(int k) {
            this.k = k;
        }

        public int getL() {
            return l;
        }

        public void setL(int l) {
            this.l = l;
        }
        
        
        
    
    }
    
}
