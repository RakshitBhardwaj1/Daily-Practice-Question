// Last updated: 8/6/2026, 4:43:03 PM
1class Solution {
2    public int climbStairs(int n) {
3        if(n<=2){
4            return n; 
5        }
6        int path1=2;
7        int path2=1;
8
9        for(int i=3;i<=n;i++){
10            int path3=path1+path2;
11            path2=path1;
12            path1=path3;
13        }
14        return path1;
15    }
16}