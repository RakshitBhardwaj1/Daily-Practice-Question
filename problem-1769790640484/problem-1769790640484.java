// Last updated: 1/30/2026, 10:00:40 PM
1class Solution {
2    public void solveSudoku(char[][] board) {
3        SudokuSolver(board,0,0);
4    }
5    public static boolean SudokuSolver(char[][] board,int row,int col){
6        if(col==9){
7            col=0;
8            row++;
9        }
10        if(row==9){
11            return true;
12        }
13        if(board[row][col]!='.'){
14            return SudokuSolver(board,row,col+1);
15        }
16        else{
17            for(char i='1';i<='9';i++){
18                if(isitSafe(board,row,col,i)==true){
19                    board[row][col] = i;
20                    
21                if (SudokuSolver(board, row, col + 1))
22                    return true;
23
24                board[row][col] = '.';
25                }
26            }
27        }
28        return false;
29    }
30    public static boolean isitSafe(char[][] board,int row,int col,int val){
31        for(int i=0;i<9;i++){
32            if(board[row][i]==val){
33                return false;
34            }
35        }
36        for(int i=0;i<9;i++){
37            if(board[i][col]==val){
38                return false;
39            }
40        }
41        int r=row-row%3;
42        int c=col-col%3;
43        for(int i=r;i<r+3;i++){
44            for(int j=c;j<c+3;j++){
45                if(board[i][j]==val){
46                    return false;
47                }
48            }
49        }
50        return true;
51    }
52
53
54}