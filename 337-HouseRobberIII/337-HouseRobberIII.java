// Last updated: 9/22/2026, 10:10:13 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        return ways(m,n);
4    }
5    public int ways(int m,int n){
6        int[][] grid=new int[m][n];
7        for(int i=0;i<m;i++){
8            for(int j=0;j<n;j++){
9                if(i==0 || j==0){
10                    grid[i][j]=1;
11                }
12                else grid[i][j]=grid[i-1][j]+grid[i][j-1];
13            }
14        }
15        return grid[m-1][n-1];
16    }
17}