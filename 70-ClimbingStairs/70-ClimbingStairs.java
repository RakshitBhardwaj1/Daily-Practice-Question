// Last updated: 2/5/2026, 7:44:44 PM
1class Solution {
2    public int climbStairs(int n) {
3        if(n<=2){
4            return n;
5        }
6        int way1=2;
7        int way2=1;
8
9        for(int i=3;i<=n;i++){
10            int curr=way1+way2;
11            way2=way1;
12            way1=curr;
13        }
14        return way1;
15    }
16}