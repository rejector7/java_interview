package leetcode.hashmap;

import java.util.HashSet;

public class P36 {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            int n = board.length;
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> columnSet = new HashSet<>();
            HashSet<Character> gridSet = new HashSet<>();
            for(int i = 0; i < n; ++i){
                for(int j = 0; j < n; ++j){
                    if(board[i][j] != '.') {
                        if(rowSet.contains((Character)board[i][j])){
                            return false;
                        }
                        else{
                            rowSet.add((Character) board[i][j]);
                        }
                    }
                    if(board[j][i] != '.') {
                        if(columnSet.contains((Character)board[j][i])){
                            return false;
                        }
                        else{
                            columnSet.add((Character) board[j][i]);
                        }
                    }
                }
                rowSet.clear();
                columnSet.clear();
            }

            for(int i = 0; i < n; i+=3){
                for(int j = 0; j < n; j+=3){
                    for(int row = i; row < i + 3; row++){
                        for(int col = j; col < j + 3; col++){
                            if(board[row][col] != '.'){
                                if(gridSet.contains((Character) board[row][col])){
                                    return false;
                                }
                                else{
                                    gridSet.add((Character) board[row][col]);
                                }
                            }
                        }
                    }
                    gridSet.clear();
                }
            }
            return true;
        }
    }
    class Solution01{
        public boolean isValidSudoku(char[][] board) {
            int n = board.length;
            HashSet<Character>[] row = new HashSet[9];
            HashSet<Character>[] col = new HashSet[9];
            HashSet<Character>[] grid = new HashSet[9];
            for(int i = 0; i < n; ++i){
                row[i] = new HashSet<>();
                col[i] = new HashSet<>();
                grid[i] = new HashSet<>();
            }
            for(int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j){
                    int gridIndex = (i/3) * 3 + j/3;
                    Character c = (Character) board[i][j];
                    if(c != '.'){
                        if(row[i].contains(c))return false;
                        else{
                            row[i].add(c);
                        }
                        if(col[j].contains(c))return false;
                        else{
                            col[j].add(c);
                        }
                        if(grid[gridIndex].contains(c))return false;
                        else{
                            grid[gridIndex].add(c);
                        }
                    }
                }
            }
            return true;
        }
    }
}
