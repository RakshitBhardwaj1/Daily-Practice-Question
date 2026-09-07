// Last updated: 9/7/2026, 4:43:02 PM
1class Solution {
2    public int climbStairs(int n) {
3        if(n==0) return 1;
4        if(n==1) return 1;
5
6        int prev1=1;
7        int prev2=1;
8        for(int i=2;i<=n;i++){
9            int c=prev1+prev2;
10            prev2=prev1;
11            prev1=c;
12        }
13        return prev1;
14    }
15}