// Last updated: 8/6/2026, 4:26:10 PM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int n=cost.length;
4        int[] dp=new int[n];
5        Arrays.fill(dp,-1);
6        return Math.min(mincost(cost,n-1,dp),mincost(cost,n-2,dp));
7    }
8    public int mincost(int[] cost,int idx,int[] dp){
9        if(idx==0||idx==1){
10            return cost[idx];
11        }
12        if(dp[idx]!=-1){
13            return dp[idx];
14        }
15        return dp[idx]=cost[idx]+Math.min(mincost(cost,idx-1,dp),mincost(cost,idx-2,dp));
16    }
17}