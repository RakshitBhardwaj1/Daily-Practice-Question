// Last updated: 12/28/2025, 9:10:03 PM
1class Solution {
2    public int countNegatives(int[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        int count=0;
6        for (int i=0;i<n;i++){
7            for(int j=0;j<m;j++){
8                if(grid[i][j]<0){
9                    count++;
10                }
11            }
12        }
13        return count;
14    }
15}